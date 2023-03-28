package lt.viko.eif.einoris.auctionmsgrcvr.utils;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.xml.sax.SAXException;

import javax.jms.Connection;
import javax.jms.JMSException;

import javax.jms.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class MsgListener {
    private static final String BROKER_URL = "http://localhost:8161";

    /**
     * Method for receiving all messages from activeMQ
     * Constantly overwrites newest received xml string to xml file and then creates the object
     */
    public void MsgListenerStart()  {
        try {
            MsgToObject msgtoobject = new MsgToObject();
            ConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnectionFactory.DEFAULT_BROKER_URL);
            Connection con = factory.createConnection();
            Session session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Queue queue = session.createQueue("MY_QUEUE");
            MessageConsumer consumer = session.createConsumer(queue);
            con.start();
            while (true) {
                Message msg = consumer.receive(5000);
                if (msg instanceof TextMessage) {
                    TextMessage tm = (TextMessage) msg;
                    msgtoobject.stringToFile(tm.getText());
                    msgtoobject.setXml_text(tm.getText());
                    msgtoobject.convertXMLtoObject();
                    System.out.println(tm.getText());
                } else {
                    System.out.println("Queue Empty");
                    con.stop();
                    break;
                }
            }
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }

    }
}
