package com.m11n.hermes.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.beans.*;
import org.joda.beans.impl.direct.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collections;
import java.util.List;
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
@XmlRootElement(name = "print_request")
public class PrintRequest extends DirectBean
{
    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private String templates;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private Integer target;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private Integer chargeSize;

    @PropertyDefinition
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    private List<PrintRequestCharge> charges;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code PrintRequest}.
     * @return the meta-bean, not null
     */
    public static PrintRequest.Meta meta() {
        return PrintRequest.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(PrintRequest.Meta.INSTANCE);
    }

    @Override
    public PrintRequest.Meta metaBean() {
        return PrintRequest.Meta.INSTANCE;
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
     * Gets the target.
     * @return the value of the property
     */
    public Integer getTarget() {
        return target;
    }

    /**
     * Sets the target.
     * @param target  the new value of the property
     */
    public void setTarget(Integer target) {
        this.target = target;
    }

    /**
     * Gets the the {@code target} property.
     * @return the property, not null
     */
    public final Property<Integer> target() {
        return metaBean().target().createProperty(this);
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
    /**
     * Gets the charges.
     * @return the value of the property
     */
    public List<PrintRequestCharge> getCharges() {
        return charges;
    }

    /**
     * Sets the charges.
     * @param charges  the new value of the property
     */
    public void setCharges(List<PrintRequestCharge> charges) {
        this.charges = charges;
    }

    /**
     * Gets the the {@code charges} property.
     * @return the property, not null
     */
    public final Property<List<PrintRequestCharge>> charges() {
        return metaBean().charges().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public PrintRequest clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            PrintRequest other = (PrintRequest) obj;
            return JodaBeanUtils.equal(getTemplates(), other.getTemplates()) &&
                    JodaBeanUtils.equal(getTarget(), other.getTarget()) &&
                    JodaBeanUtils.equal(getChargeSize(), other.getChargeSize()) &&
                    JodaBeanUtils.equal(getCharges(), other.getCharges());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getTemplates());
        hash = hash * 31 + JodaBeanUtils.hashCode(getTarget());
        hash = hash * 31 + JodaBeanUtils.hashCode(getChargeSize());
        hash = hash * 31 + JodaBeanUtils.hashCode(getCharges());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(128);
        buf.append("PrintRequest{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("templates").append('=').append(JodaBeanUtils.toString(getTemplates())).append(',').append(' ');
        buf.append("target").append('=').append(JodaBeanUtils.toString(getTarget())).append(',').append(' ');
        buf.append("chargeSize").append('=').append(JodaBeanUtils.toString(getChargeSize())).append(',').append(' ');
        buf.append("charges").append('=').append(JodaBeanUtils.toString(getCharges())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code PrintRequest}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code templates} property.
         */
        private final MetaProperty<String> templates = DirectMetaProperty.ofReadWrite(
                this, "templates", PrintRequest.class, String.class);
        /**
         * The meta-property for the {@code target} property.
         */
        private final MetaProperty<Integer> target = DirectMetaProperty.ofReadWrite(
                this, "target", PrintRequest.class, Integer.class);
        /**
         * The meta-property for the {@code chargeSize} property.
         */
        private final MetaProperty<Integer> chargeSize = DirectMetaProperty.ofReadWrite(
                this, "chargeSize", PrintRequest.class, Integer.class);
        /**
         * The meta-property for the {@code charges} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<PrintRequestCharge>> charges = DirectMetaProperty.ofReadWrite(
                this, "charges", PrintRequest.class, (Class) List.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "templates",
                "chargeSize",
                "charges");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 1981727545:  // templates
                    return templates;
                case 1418067158:  // chargeSize
                    return target;
                case 1418067157:  // chargeSize
                    return chargeSize;
                case 739062847:  // charges
                    return charges;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends PrintRequest> builder() {
            return new DirectBeanBuilder<PrintRequest>(new PrintRequest());
        }

        @Override
        public Class<? extends PrintRequest> beanType() {
            return PrintRequest.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code templates} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> templates() {
            return templates;
        }

        /**
         * The meta-property for the {@code target} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> target() {
            return target;
        }

        /**
         * The meta-property for the {@code chargeSize} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> chargeSize() {
            return chargeSize;
        }

        /**
         * The meta-property for the {@code charges} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<List<PrintRequestCharge>> charges() {
            return charges;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 1981727545:  // templates
                    return ((PrintRequest) bean).getTemplates();
                case 1418067158:  // chargeSize
                    return ((PrintRequest) bean).getTarget();
                case 1418067157:  // chargeSize
                    return ((PrintRequest) bean).getChargeSize();
                case 739062847:  // charges
                    return ((PrintRequest) bean).getCharges();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 1981727545:  // templates
                    ((PrintRequest) bean).setTemplates((String) newValue);
                    return;
                case 1418067158:  // chargeSize
                    ((PrintRequest) bean).setTarget((Integer) newValue);
                    return;
                case 1418067157:  // chargeSize
                    ((PrintRequest) bean).setChargeSize((Integer) newValue);
                    return;
                case 739062847:  // charges
                    ((PrintRequest) bean).setCharges((List<PrintRequestCharge>) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
