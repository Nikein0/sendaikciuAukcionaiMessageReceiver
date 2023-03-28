package lt.viko.eif.einoris.auctionmsgrcvr.utils;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import lt.viko.eif.einoris.SellerType;
import lt.viko.eif.einoris.auctionmsgrcvr.model.Seller;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.security.cert.X509Certificate;

public class MsgToObject {
    private static final String SELLER_XML = "XmlFile.xml";

    public String getXml_text() {
        return xml_text;
    }

    public void setXml_text(String xml_text) {
        this.xml_text = xml_text;
    }

    private String xml_text;

    /**
     * Method for saving received XML string to a file
     */
    public void stringToFile(String xmlSource){
        try {
            // Parse the given input
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(xmlSource)));

            // Write the parsed document to an xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);

            StreamResult result = new StreamResult(new File("XmlFile.xml"));
            transformer.transform(source, result);
        } catch (ParserConfigurationException | IOException | TransformerException | SAXException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Method for unmarshalling the XML file and returning main object
     */
    public SellerType convertXMLtoObject(){
        try {
            JAXBContext context = JAXBContext.newInstance(SellerType.class);
            Unmarshaller un = context.createUnmarshaller();
            SellerType seller = (SellerType) un.unmarshal(new File(SELLER_XML));
            return seller;
            //System.out.println(seller);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
    }



