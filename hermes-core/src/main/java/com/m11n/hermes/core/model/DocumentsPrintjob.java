package com.m11n.hermes.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import org.joda.beans.BeanDefinition;
import org.joda.beans.MetaBean;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class DocumentsPrintjob extends DirectBean {
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true)
    private Integer id;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "created_at")
    private Date createdAt = new Date();

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "status")
    private String status;

    @PropertyDefinition
    @Column(name = "printed_at")
    @JsonSerialize
    private Date printedAt;


    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code DocumentsPrintjob}.
     * @return the meta-bean, not null
     */
    public static DocumentsPrintjob.Meta meta() {
        return DocumentsPrintjob.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(DocumentsPrintjob.Meta.INSTANCE);
    }

    @Override
    public DocumentsPrintjob.Meta metaBean() {
        return DocumentsPrintjob.Meta.INSTANCE;
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
     * Gets the createdAt.
     * @return the value of the property
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the createdAt.
     * @param createdAt  the new value of the property
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets the the {@code createdAt} property.
     * @return the property, not null
     */
    public final Property<Date> createdAt() {
        return metaBean().createdAt().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the status.
     * @return the value of the property
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * @param status  the new value of the property
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the the {@code status} property.
     * @return the property, not null
     */
    public final Property<String> status() {
        return metaBean().status().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the printedAt.
     * @return the value of the property
     */
    public Date getPrintedAt() {
        return printedAt;
    }

    /**
     * Sets the printedAt.
     * @param printedAt  the new value of the property
     */
    public void setPrintedAt(Date printedAt) {
        this.printedAt = printedAt;
    }

    /**
     * Gets the the {@code printedAt} property.
     * @return the property, not null
     */
    public final Property<Date> printedAt() {
        return metaBean().printedAt().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public DocumentsPrintjob clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            DocumentsPrintjob other = (DocumentsPrintjob) obj;
            return JodaBeanUtils.equal(getId(), other.getId()) &&
                    JodaBeanUtils.equal(getCreatedAt(), other.getCreatedAt()) &&
                    JodaBeanUtils.equal(getStatus(), other.getStatus()) &&
                    JodaBeanUtils.equal(getPrintedAt(), other.getPrintedAt());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getCreatedAt());
        hash = hash * 31 + JodaBeanUtils.hashCode(getStatus());
        hash = hash * 31 + JodaBeanUtils.hashCode(getPrintedAt());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(160);
        buf.append("DocumentsPrintjob{");
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
        buf.append("createdAt").append('=').append(JodaBeanUtils.toString(getCreatedAt())).append(',').append(' ');
        buf.append("status").append('=').append(JodaBeanUtils.toString(getStatus())).append(',').append(' ');
        buf.append("printedAt").append('=').append(JodaBeanUtils.toString(getPrintedAt())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code DocumentsPrintjob}.
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
                this, "id", DocumentsPrintjob.class, Integer.class);
        /**
         * The meta-property for the {@code createdAt} property.
         */
        private final MetaProperty<Date> createdAt = DirectMetaProperty.ofReadWrite(
                this, "createdAt", DocumentsPrintjob.class, Date.class);
        /**
         * The meta-property for the {@code status} property.
         */
        private final MetaProperty<String> status = DirectMetaProperty.ofReadWrite(
                this, "status", DocumentsPrintjob.class, String.class);
        /**
         * The meta-property for the {@code printedAt} property.
         */
        private final MetaProperty<Date> printedAt = DirectMetaProperty.ofReadWrite(
                this, "printedAt", DocumentsPrintjob.class, Date.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "id",
                "createdAt",
                "status",
                "printedAt");

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
                case 598371643:  // createdAt
                    return createdAt;
                case -892481550:  // status
                    return status;
                case -1796473505:  // printedAt
                    return printedAt;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends DocumentsPrintjob> builder() {
            return new DirectBeanBuilder<DocumentsPrintjob>(new DocumentsPrintjob());
        }

        @Override
        public Class<? extends DocumentsPrintjob> beanType() {
            return DocumentsPrintjob.class;
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
         * The meta-property for the {@code createdAt} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> createdAt() {
            return createdAt;
        }

        /**
         * The meta-property for the {@code status} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> status() {
            return status;
        }

        /**
         * The meta-property for the {@code printedAt} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> printedAt() {
            return printedAt;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return ((DocumentsPrintjob) bean).getId();
                case 598371643:  // createdAt
                    return ((DocumentsPrintjob) bean).getCreatedAt();
                case -892481550:  // status
                    return ((DocumentsPrintjob) bean).getStatus();
                case -1796473505:  // printedAt
                    return ((DocumentsPrintjob) bean).getPrintedAt();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    ((DocumentsPrintjob) bean).setId((Integer) newValue);
                    return;
                case 598371643:  // createdAt
                    ((DocumentsPrintjob) bean).setCreatedAt((Date) newValue);
                    return;
                case -892481550:  // status
                    ((DocumentsPrintjob) bean).setStatus((String) newValue);
                    return;
                case -1796473505:  // printedAt
                    ((DocumentsPrintjob) bean).setPrintedAt((Date) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
