package com.m11n.hermes.persistence;

import com.m11n.hermes.core.model.BankStatement;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface BankStatementRepository extends PagingAndSortingRepository<BankStatement, String> {
    BankStatement findByHash(String hash);

    List<BankStatement> findByStatusAndAmountGreaterThan(String status, BigDecimal amount);

    @Query("SELECT COUNT(*) FROM BankStatement bs where bs.account = :account AND bs.transferDate = :transfer_date AND bs.descriptionb = :descriptionb AND bs.amount = :amount AND bs.currency = :currency")
    long exists(@Param("account") String account, @Param("transfer_date") Date transferDate, @Param("descriptionb") String descriptionB, @Param("amount") BigDecimal amount, @Param("currency") String currency);

    @Modifying(clearAutomatically = true)
    @Query("update BankStatement bs set bs.status =:status where bs.id =:id")
    void updateStatus(@Param("id") String id, @Param("status") String status);

    @Modifying(clearAutomatically = true)
    @Query("update BankStatement bs set bs.status =:status, bs.orderId = :orderId where bs.id =:id")
    void updateStatusAndOrderId(@Param("id") String id, @Param("status") String status, @Param("orderId") String orderId);
}
