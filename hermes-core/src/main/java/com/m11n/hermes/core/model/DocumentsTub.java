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
@Table(name = "hermes_documents_printjob")
public class DocumentsTub extends DirectBean {
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Id
    @Column(name = "id", unique = true)
    private Integer id;
    
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "printjob_id")
    private Integer printjobId;
    
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "group")
    private Integer group;
    
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "tub_no")
    private Integer tubNo;
    
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "order_id")
    private Integer order_id;
    
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
     * Gets the group.
     * @return the value of the property
     */
    public Integer getGroup() {
        return group;
    }

    /**
     * Sets the group.
     * @param group  the new value of the property
     */
    public void setGroup(Integer group) {
        this.group = group;
    }

    /**
     * Gets the the {@code group} property.
     * @return the property, not null
     */
    public final Property<Integer> group() {
        return metaBean().group().createProperty(this);
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
     * Gets the order_id.
     * @return the value of the property
     */
    public Integer getOrder_id() {
        return order_id;
    }

    /**
     * Sets the order_id.
     * @param order_id  the new value of the property
     */
    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    /**
     * Gets the the {@code order_id} property.
     * @return the property, not null
     */
    public final Property<Integer> order_id() {
        return metaBean().order_id().createProperty(this);
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
                    JodaBeanUtils.equal(getGroup(), other.getGroup()) &&
                    JodaBeanUtils.equal(getTubNo(), other.getTubNo()) &&
                    JodaBeanUtils.equal(getOrder_id(), other.getOrder_id()) &&
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
        hash = hash * 31 + JodaBeanUtils.hashCode(getGroup());
        hash = hash * 31 + JodaBeanUtils.hashCode(getTubNo());
        hash = hash * 31 + JodaBeanUtils.hashCode(getOrder_id());
        hash = hash * 31 + JodaBeanUtils.hashCode(getProductId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAmount());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(256);
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
        buf.append("group").append('=').append(JodaBeanUtils.toString(getGroup())).append(',').append(' ');
        buf.append("tubNo").append('=').append(JodaBeanUtils.toString(getTubNo())).append(',').append(' ');
        buf.append("order_id").append('=').append(JodaBeanUtils.toString(getOrder_id())).append(',').append(' ');
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
         * The meta-property for the {@code group} property.
         */
        private final MetaProperty<Integer> group = DirectMetaProperty.ofReadWrite(
                this, "group", DocumentsTub.class, Integer.class);
        /**
         * The meta-property for the {@code tubNo} property.
         */
        private final MetaProperty<Integer> tubNo = DirectMetaProperty.ofReadWrite(
                this, "tubNo", DocumentsTub.class, Integer.class);
        /**
         * The meta-property for the {@code order_id} property.
         */
        private final MetaProperty<Integer> order_id = DirectMetaProperty.ofReadWrite(
                this, "order_id", DocumentsTub.class, Integer.class);
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
                "group",
                "tubNo",
                "order_id",
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
                case 98629247:  // group
                    return group;
                case 110710690:  // tubNo
                    return tubNo;
                case 1234304940:  // order_id
                    return order_id;
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
         * The meta-property for the {@code group} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> group() {
            return group;
        }

        /**
         * The meta-property for the {@code tubNo} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> tubNo() {
            return tubNo;
        }

        /**
         * The meta-property for the {@code order_id} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> order_id() {
            return order_id;
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
                case 98629247:  // group
                    return ((DocumentsTub) bean).getGroup();
                case 110710690:  // tubNo
                    return ((DocumentsTub) bean).getTubNo();
                case 1234304940:  // order_id
                    return ((DocumentsTub) bean).getOrder_id();
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
                case 98629247:  // group
                    ((DocumentsTub) bean).setGroup((Integer) newValue);
                    return;
                case 110710690:  // tubNo
                    ((DocumentsTub) bean).setTubNo((Integer) newValue);
                    return;
                case 1234304940:  // order_id
                    ((DocumentsTub) bean).setOrder_id((Integer) newValue);
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
