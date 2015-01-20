package com.m11n.hermes.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.beans.*;
import org.joda.beans.impl.direct.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
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
@XmlRootElement(name = "tracking_status")
public class DhlTrackingStatus extends DirectBean
{
    @PropertyDefinition
    @XmlAttribute(name = "date")
    private String date;

    @PropertyDefinition
    @XmlAttribute(name = "message")
    private String message;

    @PropertyDefinition
    @XmlAttribute(name = "next")
    private String next;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code DhlTrackingStatus}.
     * @return the meta-bean, not null
     */
    public static DhlTrackingStatus.Meta meta() {
        return DhlTrackingStatus.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(DhlTrackingStatus.Meta.INSTANCE);
    }

    @Override
    public DhlTrackingStatus.Meta metaBean() {
        return DhlTrackingStatus.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the date.
     * @return the value of the property
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the date.
     * @param date  the new value of the property
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets the the {@code date} property.
     * @return the property, not null
     */
    public final Property<String> date() {
        return metaBean().date().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the message.
     * @return the value of the property
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message.
     * @param message  the new value of the property
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the the {@code message} property.
     * @return the property, not null
     */
    public final Property<String> message() {
        return metaBean().message().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the next.
     * @return the value of the property
     */
    public String getNext() {
        return next;
    }

    /**
     * Sets the next.
     * @param next  the new value of the property
     */
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * Gets the the {@code next} property.
     * @return the property, not null
     */
    public final Property<String> next() {
        return metaBean().next().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public DhlTrackingStatus clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            DhlTrackingStatus other = (DhlTrackingStatus) obj;
            return JodaBeanUtils.equal(getDate(), other.getDate()) &&
                    JodaBeanUtils.equal(getMessage(), other.getMessage()) &&
                    JodaBeanUtils.equal(getNext(), other.getNext());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMessage());
        hash = hash * 31 + JodaBeanUtils.hashCode(getNext());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(128);
        buf.append("DhlTrackingStatus{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("date").append('=').append(JodaBeanUtils.toString(getDate())).append(',').append(' ');
        buf.append("message").append('=').append(JodaBeanUtils.toString(getMessage())).append(',').append(' ');
        buf.append("next").append('=').append(JodaBeanUtils.toString(getNext())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code DhlTrackingStatus}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code date} property.
         */
        private final MetaProperty<String> date = DirectMetaProperty.ofReadWrite(
                this, "date", DhlTrackingStatus.class, String.class);
        /**
         * The meta-property for the {@code message} property.
         */
        private final MetaProperty<String> message = DirectMetaProperty.ofReadWrite(
                this, "message", DhlTrackingStatus.class, String.class);
        /**
         * The meta-property for the {@code next} property.
         */
        private final MetaProperty<String> next = DirectMetaProperty.ofReadWrite(
                this, "next", DhlTrackingStatus.class, String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "date",
                "message",
                "next");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3076014:  // date
                    return date;
                case 954925063:  // message
                    return message;
                case 3377907:  // next
                    return next;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends DhlTrackingStatus> builder() {
            return new DirectBeanBuilder<DhlTrackingStatus>(new DhlTrackingStatus());
        }

        @Override
        public Class<? extends DhlTrackingStatus> beanType() {
            return DhlTrackingStatus.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code date} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> date() {
            return date;
        }

        /**
         * The meta-property for the {@code message} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> message() {
            return message;
        }

        /**
         * The meta-property for the {@code next} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> next() {
            return next;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3076014:  // date
                    return ((DhlTrackingStatus) bean).getDate();
                case 954925063:  // message
                    return ((DhlTrackingStatus) bean).getMessage();
                case 3377907:  // next
                    return ((DhlTrackingStatus) bean).getNext();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3076014:  // date
                    ((DhlTrackingStatus) bean).setDate((String) newValue);
                    return;
                case 954925063:  // message
                    ((DhlTrackingStatus) bean).setMessage((String) newValue);
                    return;
                case 3377907:  // next
                    ((DhlTrackingStatus) bean).setNext((String) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
