//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.27 at 12:13:36 PM EEST 
//


package lt.viko.eif.einoris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{}categoryType"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pricing" type="{}pricingType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemsType", propOrder = {
    "category",
    "id",
    "name",
    "pricing"
})
public class ItemsType {

    @XmlElement(required = true)
    protected CategoryType category;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected PricingType pricing;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryType }
     *     
     */
    public CategoryType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryType }
     *     
     */
    public void setCategory(CategoryType value) {
        this.category = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link PricingType }
     *     
     */
    public PricingType getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingType }
     *     
     */
    public void setPricing(PricingType value) {
        this.pricing = value;
    }

    @Override
    public String toString() {
        return String.format("Item name = %s\n\t\tCategory = %s\n\t\tPricing: Cur.Price = %s, min.Bid = %s, startPrice = %s"
                , this.name, this.category, this.pricing.getCurrentPrice(), this.pricing.getMinimumBid(), this.pricing.getStartingPrice());
    }
}
