package com.m11n.hermes.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.beans.*;
import org.joda.beans.impl.direct.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collections;
import java.util.Map;
import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

@BeanDefinition
@JsonIgnoreProperties({"meta", "metaBean"})
@XmlRootElement(name = "print_job")
public class PrintJob extends DirectBean
{
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private String type;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private String orderId;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private Map<String, Object> params;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private String templates;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private Integer chargeSize;

    public PrintJob() {

    }

    public PrintJob(String type, String orderId, Integer chargeSize) {
        this(type, orderId, Collections.<String, Object>emptyMap(), chargeSize);
    }

    public PrintJob(String type, String orderId, Map<String, Object> params, Integer chargeSize) {
        this.type = type;
        this.orderId = orderId;
        this.params = params;
        this.chargeSize = chargeSize;
    }

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code PrintJob}.
     * @return the meta-bean, not null
     */
    public static PrintJob.Meta meta() {
        return PrintJob.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(PrintJob.Meta.INSTANCE);
    }

    @Override
    public PrintJob.Meta metaBean() {
        return PrintJob.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the type.
     * @return the value of the property
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     * @param type  the new value of the property
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the the {@code type} property.
     * @return the property, not null
     */
    public final Property<String> type() {
        return metaBean().type().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the orderId.
     * @return the value of the property
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the orderId.
     * @param orderId  the new value of the property
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * Gets the the {@code orderId} property.
     * @return the property, not null
     */
    public final Property<String> orderId() {
        return metaBean().orderId().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the params.
     * @return the value of the property
     */
    public Map<String, Object> getParams() {
        return params;
    }

    /**
     * Sets the params.
     * @param params  the new value of the property
     */
    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    /**
     * Gets the the {@code params} property.
     * @return the property, not null
     */
    public final Property<Map<String, Object>> params() {
        return metaBean().params().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the templates.
     * @return the value of the property
     */
    public String getTemplates() {
        return templates;
    }

    /**
     * Sets the templates.
     * @param templates  the new value of the property
     */
    public void setTemplates(String templates) {
        this.templates = templates;
    }

    /**
     * Gets the the {@code templates} property.
     * @return the property, not null
     */
    public final Property<String> templates() {
        return metaBean().templates().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the chargeSize.
     * @return the value of the property
     */
    public Integer getChargeSize() {
        return chargeSize;
    }

    /**
     * Sets the chargeSize.
     * @param chargeSize  the new value of the property
     */
    public void setChargeSize(Integer chargeSize) {
        this.chargeSize = chargeSize;
    }

    /**
     * Gets the the {@code chargeSize} property.
     * @return the property, not null
     */
    public final Property<Integer> chargeSize() {
        return metaBean().chargeSize().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public PrintJob clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            PrintJob other = (PrintJob) obj;
            return JodaBeanUtils.equal(getType(), other.getType()) &&
                    JodaBeanUtils.equal(getOrderId(), other.getOrderId()) &&
                    JodaBeanUtils.equal(getParams(), other.getParams()) &&
                    JodaBeanUtils.equal(getTemplates(), other.getTemplates()) &&
                    JodaBeanUtils.equal(getChargeSize(), other.getChargeSize());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash += hash * 31 + JodaBeanUtils.hashCode(getType());
        hash += hash * 31 + JodaBeanUtils.hashCode(getOrderId());
        hash += hash * 31 + JodaBeanUtils.hashCode(getParams());
        hash += hash * 31 + JodaBeanUtils.hashCode(getTemplates());
        hash += hash * 31 + JodaBeanUtils.hashCode(getChargeSize());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(192);
        buf.append("PrintJob{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("type").append('=').append(JodaBeanUtils.toString(getType())).append(',').append(' ');
        buf.append("orderId").append('=').append(JodaBeanUtils.toString(getOrderId())).append(',').append(' ');
        buf.append("params").append('=').append(JodaBeanUtils.toString(getParams())).append(',').append(' ');
        buf.append("templates").append('=').append(JodaBeanUtils.toString(getTemplates())).append(',').append(' ');
        buf.append("chargeSize").append('=').append(JodaBeanUtils.toString(getChargeSize())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code PrintJob}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code type} property.
         */
        private final MetaProperty<String> type = DirectMetaProperty.ofReadWrite(
                this, "type", PrintJob.class, String.class);
        /**
         * The meta-property for the {@code orderId} property.
         */
        private final MetaProperty<String> orderId = DirectMetaProperty.ofReadWrite(
                this, "orderId", PrintJob.class, String.class);
        /**
         * The meta-property for the {@code params} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Map<String, Object>> params = DirectMetaProperty.ofReadWrite(
                this, "params", PrintJob.class, (Class) Map.class);
        /**
         * The meta-property for the {@code templates} property.
         */
        private final MetaProperty<String> templates = DirectMetaProperty.ofReadWrite(
                this, "templates", PrintJob.class, String.class);
        /**
         * The meta-property for the {@code chargeSize} property.
         */
        private final MetaProperty<Integer> chargeSize = DirectMetaProperty.ofReadWrite(
                this, "chargeSize", PrintJob.class, Integer.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "type",
                "orderId",
                "params",
                "templates",
                "chargeSize");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3575610:  // type
                    return type;
                case -1207110391:  // orderId
                    return orderId;
                case -995427962:  // params
                    return params;
                case 1981727545:  // templates
                    return templates;
                case 1418067157:  // chargeSize
                    return chargeSize;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends PrintJob> builder() {
            return new DirectBeanBuilder<PrintJob>(new PrintJob());
        }

        @Override
        public Class<? extends PrintJob> beanType() {
            return PrintJob.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code type} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> type() {
            return type;
        }

        /**
         * The meta-property for the {@code orderId} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> orderId() {
            return orderId;
        }

        /**
         * The meta-property for the {@code params} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Map<String, Object>> params() {
            return params;
        }

        /**
         * The meta-property for the {@code templates} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> templates() {
            return templates;
        }

        /**
         * The meta-property for the {@code chargeSize} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> chargeSize() {
            return chargeSize;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3575610:  // type
                    return ((PrintJob) bean).getType();
                case -1207110391:  // orderId
                    return ((PrintJob) bean).getOrderId();
                case -995427962:  // params
                    return ((PrintJob) bean).getParams();
                case 1981727545:  // templates
                    return ((PrintJob) bean).getTemplates();
                case 1418067157:  // chargeSize
                    return ((PrintJob) bean).getChargeSize();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3575610:  // type
                    ((PrintJob) bean).setType((String) newValue);
                    return;
                case -1207110391:  // orderId
                    ((PrintJob) bean).setOrderId((String) newValue);
                    return;
                case -995427962:  // params
                    ((PrintJob) bean).setParams((Map<String, Object>) newValue);
                    return;
                case 1981727545:  // templates
                    ((PrintJob) bean).setTemplates((String) newValue);
                    return;
                case 1418067157:  // chargeSize
                    ((PrintJob) bean).setChargeSize((Integer) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
