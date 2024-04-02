//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in
// JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.18 at 01:31:03 PM MESZ 
//


package eu.spocseu.edeliverygw.configuration.xsd;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * {@literal
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Server">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="defaultCitizenQAAlevel" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                   &lt;attribute name="gatewayName" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                   &lt;attribute name="gatewayDomain" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                   &lt;attribute name="gatewayAddress" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Client" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;/choice>
 *         &lt;element name="PostalAdress">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="StreetAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Locality" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Country" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * }
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"server", "client", "postalAdress"})
@XmlRootElement(name = "EDeliveryDetail")
public class EDeliveryDetail {
    @XmlElement(name = "Server")
    protected EDeliveryDetail.Server server;
    @XmlElement(name = "Client")
    protected Object client;
    @XmlElement(name = "PostalAdress", required = true)
    protected EDeliveryDetail.PostalAdress postalAdress;

    /**
     * Gets the value of the server property.
     *
     * @return possible object is
     * {@link EDeliveryDetail.Server }
     */
    public EDeliveryDetail.Server getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     *
     * @param value allowed object is
     *              {@link EDeliveryDetail.Server }
     */
    public void setServer(EDeliveryDetail.Server value) {
        this.server = value;
    }

    /**
     * Gets the value of the client property.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setClient(Object value) {
        this.client = value;
    }

    /**
     * Gets the value of the postalAdress property.
     *
     * @return possible object is
     * {@link EDeliveryDetail.PostalAdress }
     */
    public EDeliveryDetail.PostalAdress getPostalAdress() {
        return postalAdress;
    }

    /**
     * Sets the value of the postalAdress property.
     *
     * @param value allowed object is
     *              {@link EDeliveryDetail.PostalAdress }
     */
    public void setPostalAdress(EDeliveryDetail.PostalAdress value) {
        this.postalAdress = value;
    }

    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * {@literal
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="StreetAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Locality" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Country" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * }
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PostalAdress {
        @XmlAttribute(name = "StreetAddress")
        @XmlSchemaType(name = "anySimpleType")
        protected String streetAddress;
        @XmlAttribute(name = "Locality")
        @XmlSchemaType(name = "anySimpleType")
        protected String locality;
        @XmlAttribute(name = "PostalCode")
        @XmlSchemaType(name = "anySimpleType")
        protected String postalCode;
        @XmlAttribute(name = "Country")
        @XmlSchemaType(name = "anySimpleType")
        protected String country;

        /**
         * Gets the value of the streetAddress property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getStreetAddress() {
            return streetAddress;
        }

        /**
         * Sets the value of the streetAddress property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setStreetAddress(String value) {
            this.streetAddress = value;
        }

        /**
         * Gets the value of the locality property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getLocality() {
            return locality;
        }

        /**
         * Sets the value of the locality property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setLocality(String value) {
            this.locality = value;
        }

        /**
         * Gets the value of the postalCode property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getPostalCode() {
            return postalCode;
        }

        /**
         * Sets the value of the postalCode property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPostalCode(String value) {
            this.postalCode = value;
        }

        /**
         * Gets the value of the country property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCountry(String value) {
            this.country = value;
        }
    }

    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * {@literal
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="defaultCitizenQAAlevel" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="gatewayName" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="gatewayDomain" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="gatewayAddress" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * }
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Server {
        @XmlAttribute
        protected Integer defaultCitizenQAAlevel;
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String gatewayName;
        @XmlAttribute
        @XmlSchemaType(name = "anySimpleType")
        protected String gatewayDomain;
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String gatewayAddress;

        /**
         * Gets the value of the defaultCitizenQAAlevel property.
         *
         * @return possible object is
         * {@link Integer }
         */
        public Integer getDefaultCitizenQAAlevel() {
            return defaultCitizenQAAlevel;
        }

        /**
         * Sets the value of the defaultCitizenQAAlevel property.
         *
         * @param value allowed object is
         *              {@link Integer }
         */
        public void setDefaultCitizenQAAlevel(Integer value) {
            this.defaultCitizenQAAlevel = value;
        }

        /**
         * Gets the value of the gatewayName property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getGatewayName() {
            return gatewayName;
        }

        /**
         * Sets the value of the gatewayName property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setGatewayName(String value) {
            this.gatewayName = value;
        }

        /**
         * Gets the value of the gatewayDomain property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getGatewayDomain() {
            return gatewayDomain;
        }

        /**
         * Sets the value of the gatewayDomain property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setGatewayDomain(String value) {
            this.gatewayDomain = value;
        }

        /**
         * Gets the value of the gatewayAddress property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getGatewayAddress() {
            return gatewayAddress;
        }

        /**
         * Sets the value of the gatewayAddress property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setGatewayAddress(String value) {
            this.gatewayAddress = value;
        }
    }
}
