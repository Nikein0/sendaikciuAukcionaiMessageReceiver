//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.27 at 12:13:36 PM EEST 
//


package lt.viko.eif.einoris;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.viko.eif.einoris package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Seller_QNAME = new QName("", "seller");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.viko.eif.einoris
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SellerType }
     * 
     */
    public SellerType createSellerType() {
        return new SellerType();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link ItemsType }
     * 
     */
    public ItemsType createItemsType() {
        return new ItemsType();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link PricingType }
     * 
     */
    public PricingType createPricingType() {
        return new PricingType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "seller")
    public JAXBElement<SellerType> createSeller(SellerType value) {
        return new JAXBElement<SellerType>(_Seller_QNAME, SellerType.class, null, value);
    }

}
