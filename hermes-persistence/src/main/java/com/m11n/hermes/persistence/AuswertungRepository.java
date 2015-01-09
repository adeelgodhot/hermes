package com.m11n.hermes.persistence;

import com.google.common.base.Joiner;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.*;

@Repository
public class AuswertungRepository extends AbstractAuswertungRepository {
    private static final Logger logger = LoggerFactory.getLogger(AuswertungRepository.class);

    public List<Map<String, Object>> query(String sqlStatement, Map<String, Object> parameters, RowMapper<Map<String, Object>> mapper) {
        if(!StringUtils.isEmpty(sqlStatement) && !StringUtils.isEmpty(sqlStatement.trim())) {
            return jdbcTemplate.query(sqlStatement, parameters, mapper);
        } else {
            logger.warn("Query statement empty!");
            return Collections.emptyList();
        }
    }

    public int update(String sqlStatement, Map<String, Object> parameters) {
        if(!StringUtils.isEmpty(sqlStatement) && !StringUtils.isEmpty(sqlStatement.trim())) {
            return jdbcTemplate.update(sqlStatement, parameters);
        } else {
            logger.warn("Query statement empty!");
            return 0;
        }
    }

    public String findShippingIdByOrderId(String orderId) {
        String sql = "select shipping_id from Auswertung.mage_custom_order where Bestellung = " + orderId;
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, Collections.<String, Object>emptyMap());
        if(result.next()) {
            return result.getString(1);
        } else {
            return null;
        }
    }

    public List<Map<String, Object>> findOrdersByOrderId(String orderId) {
        String sql = "select Bestellung as orderId, GesamtPreis_der_Bestellung_Brutto as amount, Kundenummer as clientId, Kunden_vorname as firstname, Kunden_name as lastname, Kunden_ebay_name as ebayName, typ as type, Status as status from Auswertung.mage_custom_order where Bestellung = " + orderId;

        return jdbcTemplate.query(sql, Collections.<String, Object>emptyMap(), new DefaultMapper());
    }

    public List<Map<String, Object>> findOrderByFilter(String uuid, String lastnameCriteria, boolean amount, boolean amountDiff, boolean lastname, String orderId, boolean or) {
        try {
            String sql = IOUtils.toString(AuswertungRepository.class.getClassLoader().getResourceAsStream("filter.sql"));

            String join = or ? " OR " : " AND ";

            List<String> filters = new ArrayList<>();

            // NOTE: by default lastname will be filtered if nothing is selected
            if(!(amount || amountDiff || lastname) && (StringUtils.isEmpty(lastnameCriteria) || "%".equals(lastnameCriteria)) && StringUtils.isEmpty(orderId)) {
                lastname = true;
            }

            if(amount) {
                filters.add("a.GesamtPreis_der_Bestellung_Brutto = b.amount");
            }
            if(amountDiff) {
                filters.add("abs(a.GesamtPreis_der_Bestellung_Brutto - b.amount) < 1");
            }
            if(lastname) {
                filters.add("locate(\n" +
                        "  left(replace(replace(replace(replace(lower(a.Kunden_name), 'ä', ''), 'ö', ''), 'ü', ''), 'ß', ''), 4)," +
                        "  replace(replace(replace(replace(lower(b.description), 'ä', ''), 'ö', ''), 'ü', ''), 'ß', '')) >= 0");
            }
            if(!StringUtils.isEmpty(orderId)) {
                filters.add("a.Bestellung = " + orderId);
            }

            if(!StringUtils.isEmpty(lastnameCriteria)) {
                filters.add("a.Kunden_name LIKE '" + lastnameCriteria + "'");
            }

            sql = String.format(sql, Joiner.on(join).join(filters));

            // TODO: remove this in production
            logger.debug(sql);

            return jdbcTemplate.query(sql, Collections.<String, Object>singletonMap("uuid", uuid), new DefaultMapper());
        } catch (IOException e) {
            logger.error(e.toString(), e);
        }

        return Collections.emptyList();
    }

    public static class DefaultMapper extends BaseRowMapper {
        @Override
        public Map<String, Object> mapRow(ResultSet resultSet, int i) throws SQLException {
            Map<String, Object> row = new HashMap<>();
            ResultSetMetaData metaData = resultSet.getMetaData();

            for(int j=1; j<=metaData.getColumnCount(); j++) {
                String name = getLabel(metaData, j);
                Object value = getValue(resultSet, j);

                row.put(name, value);
            }

            return row;
        }
    }
}
