package com.m11n.hermes.core.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import org.joda.beans.BeanDefinition;
import org.joda.beans.MetaBean;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

@BeanDefinition
@JsonIgnoreProperties({"meta", "metaBean"})
@XmlRootElement(name = "documents_printjob")
@Entity
@Table(name = "hermes_documents_tub")
public class DocumentsTub extends DirectBean {
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue
    private Integer id;
    
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "printjob_id")
    private Integer printjobId;
    
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "type")
    private String type;
    
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "group_no")
    private Integer groupNo;
    
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "tub_no")
    private Integer tubNo;
    
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "order_id")
    private String orderId;
    
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "product_id")
    private Integer productId;
    
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "amount")
    private Integer amount;
    

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code DocumentsTub}.
     * @return the meta-bean, not null
     */
    public static DocumentsTub.Meta meta() {
        return DocumentsTub.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(DocumentsTub.Meta.INSTANCE);
    }

    @Override
    public DocumentsTub.Meta metaBean() {
        return DocumentsTub.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the id.
     * @return the value of the property
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id.
     * @param id  the new value of the property
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the the {@code id} property.
     * @return the property, not null
     */
    public final Property<Integer> id() {
        return metaBean().id().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the printjobId.
     * @return the value of the property
     */
    public Integer getPrintjobId() {
        return printjobId;
    }

    /**
     * Sets the printjobId.
     * @param printjobId  the new value of the property
     */
    public void setPrintjobId(Integer printjobId) {
        this.printjobId = printjobId;
    }

    /**
     * Gets the the {@code printjobId} property.
     * @return the property, not null
     */
    public final Property<Integer> printjobId() {
        return metaBean().printjobId().createProperty(this);
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
     * Gets the groupNo.
     * @return the value of the property
     */
    public Integer getGroupNo() {
        return groupNo;
    }

    /**
     * Sets the groupNo.
     * @param groupNo  the new value of the property
     */
    public void setGroupNo(Integer groupNo) {
        this.groupNo = groupNo;
    }

    /**
     * Gets the the {@code groupNo} property.
     * @return the property, not null
     */
    public final Property<Integer> groupNo() {
        return metaBean().groupNo().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the tubNo.
     * @return the value of the property
     */
    public Integer getTubNo() {
        return tubNo;
    }

    /**
     * Sets the tubNo.
     * @param tubNo  the new value of the property
     */
    public void setTubNo(Integer tubNo) {
        this.tubNo = tubNo;
    }

    /**
     * Gets the the {@code tubNo} property.
     * @return the property, not null
     */
    public final Property<Integer> tubNo() {
        return metaBean().tubNo().createProperty(this);
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
     * Gets the productId.
     * @return the value of the property
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Sets the productId.
     * @param productId  the new value of the property
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * Gets the the {@code productId} property.
     * @return the property, not null
     */
    public final Property<Integer> productId() {
        return metaBean().productId().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the amount.
     * @return the value of the property
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * Sets the amount.
     * @param amount  the new value of the property
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Gets the the {@code amount} property.
     * @return the property, not null
     */
    public final Property<Integer> amount() {
        return metaBean().amount().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public DocumentsTub clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            DocumentsTub other = (DocumentsTub) obj;
            return JodaBeanUtils.equal(getId(), other.getId()) &&
                    JodaBeanUtils.equal(getPrintjobId(), other.getPrintjobId()) &&
                    JodaBeanUtils.equal(getType(), other.getType()) &&
                    JodaBeanUtils.equal(getGroupNo(), other.getGroupNo()) &&
                    JodaBeanUtils.equal(getTubNo(), other.getTubNo()) &&
                    JodaBeanUtils.equal(getOrderId(), other.getOrderId()) &&
                    JodaBeanUtils.equal(getProductId(), other.getProductId()) &&
                    JodaBeanUtils.equal(getAmount(), other.getAmount());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getPrintjobId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getType());
        hash = hash * 31 + JodaBeanUtils.hashCode(getGroupNo());
        hash = hash * 31 + JodaBeanUtils.hashCode(getTubNo());
        hash = hash * 31 + JodaBeanUtils.hashCode(getOrderId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getProductId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAmount());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(288);
        buf.append("DocumentsTub{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("id").append('=').append(JodaBeanUtils.toString(getId())).append(',').append(' ');
        buf.append("printjobId").append('=').append(JodaBeanUtils.toString(getPrintjobId())).append(',').append(' ');
        buf.append("type").append('=').append(JodaBeanUtils.toString(getType())).append(',').append(' ');
        buf.append("groupNo").append('=').append(JodaBeanUtils.toString(getGroupNo())).append(',').append(' ');
        buf.append("tubNo").append('=').append(JodaBeanUtils.toString(getTubNo())).append(',').append(' ');
        buf.append("orderId").append('=').append(JodaBeanUtils.toString(getOrderId())).append(',').append(' ');
        buf.append("productId").append('=').append(JodaBeanUtils.toString(getProductId())).append(',').append(' ');
        buf.append("amount").append('=').append(JodaBeanUtils.toString(getAmount())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code DocumentsTub}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code id} property.
         */
        private final MetaProperty<Integer> id = DirectMetaProperty.ofReadWrite(
                this, "id", DocumentsTub.class, Integer.class);
        /**
         * The meta-property for the {@code printjobId} property.
         */
        private final MetaProperty<Integer> printjobId = DirectMetaProperty.ofReadWrite(
                this, "printjobId", DocumentsTub.class, Integer.class);
        /**
         * The meta-property for the {@code type} property.
         */
        private final MetaProperty<String> type = DirectMetaProperty.ofReadWrite(
                this, "type", DocumentsTub.class, String.class);
        /**
         * The meta-property for the {@code groupNo} property.
         */
        private final MetaProperty<Integer> groupNo = DirectMetaProperty.ofReadWrite(
                this, "groupNo", DocumentsTub.class, Integer.class);
        /**
         * The meta-property for the {@code tubNo} property.
         */
        private final MetaProperty<Integer> tubNo = DirectMetaProperty.ofReadWrite(
                this, "tubNo", DocumentsTub.class, Integer.class);
        /**
         * The meta-property for the {@code orderId} property.
         */
        private final MetaProperty<String> orderId = DirectMetaProperty.ofReadWrite(
                this, "orderId", DocumentsTub.class, String.class);
        /**
         * The meta-property for the {@code productId} property.
         */
        private final MetaProperty<Integer> productId = DirectMetaProperty.ofReadWrite(
                this, "productId", DocumentsTub.class, Integer.class);
        /**
         * The meta-property for the {@code amount} property.
         */
        private final MetaProperty<Integer> amount = DirectMetaProperty.ofReadWrite(
                this, "amount", DocumentsTub.class, Integer.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "id",
                "printjobId",
                "type",
                "groupNo",
                "tubNo",
                "orderId",
                "productId",
                "amount");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return id;
                case 148871979:  // printjobId
                    return printjobId;
                case 3575610:  // type
                    return type;
                case 293428384:  // groupNo
                    return groupNo;
                case 110710690:  // tubNo
                    return tubNo;
                case -1207110391:  // orderId
                    return orderId;
                case -1051830678:  // productId
                    return productId;
                case -1413853096:  // amount
                    return amount;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends DocumentsTub> builder() {
            return new DirectBeanBuilder<DocumentsTub>(new DocumentsTub());
        }

        @Override
        public Class<? extends DocumentsTub> beanType() {
            return DocumentsTub.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code id} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> id() {
            return id;
        }

        /**
         * The meta-property for the {@code printjobId} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> printjobId() {
            return printjobId;
        }

        /**
         * The meta-property for the {@code type} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> type() {
            return type;
        }

        /**
         * The meta-property for the {@code groupNo} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> groupNo() {
            return groupNo;
        }

        /**
         * The meta-property for the {@code tubNo} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> tubNo() {
            return tubNo;
        }

        /**
         * The meta-property for the {@code orderId} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> orderId() {
            return orderId;
        }

        /**
         * The meta-property for the {@code productId} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> productId() {
            return productId;
        }

        /**
         * The meta-property for the {@code amount} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> amount() {
            return amount;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return ((DocumentsTub) bean).getId();
                case 148871979:  // printjobId
                    return ((DocumentsTub) bean).getPrintjobId();
                case 3575610:  // type
                    return ((DocumentsTub) bean).getType();
                case 293428384:  // groupNo
                    return ((DocumentsTub) bean).getGroupNo();
                case 110710690:  // tubNo
                    return ((DocumentsTub) bean).getTubNo();
                case -1207110391:  // orderId
                    return ((DocumentsTub) bean).getOrderId();
                case -1051830678:  // productId
                    return ((DocumentsTub) bean).getProductId();
                case -1413853096:  // amount
                    return ((DocumentsTub) bean).getAmount();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    ((DocumentsTub) bean).setId((Integer) newValue);
                    return;
                case 148871979:  // printjobId
                    ((DocumentsTub) bean).setPrintjobId((Integer) newValue);
                    return;
                case 3575610:  // type
                    ((DocumentsTub) bean).setType((String) newValue);
                    return;
                case 293428384:  // groupNo
                    ((DocumentsTub) bean).setGroupNo((Integer) newValue);
                    return;
                case 110710690:  // tubNo
                    ((DocumentsTub) bean).setTubNo((Integer) newValue);
                    return;
                case -1207110391:  // orderId
                    ((DocumentsTub) bean).setOrderId((String) newValue);
                    return;
                case -1051830678:  // productId
                    ((DocumentsTub) bean).setProductId((Integer) newValue);
                    return;
                case -1413853096:  // amount
                    ((DocumentsTub) bean).setAmount((Integer) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
