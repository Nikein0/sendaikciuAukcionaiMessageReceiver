package lt.viko.eif.einoris;

import jakarta.xml.bind.JAXBElement;
import lt.viko.eif.einoris.auctionmsgrcvr.model.Seller;
import lt.viko.eif.einoris.auctionmsgrcvr.utils.MsgListener;
import lt.viko.eif.einoris.auctionmsgrcvr.utils.MsgToObject;


public class Main {
    public static void main(String[] args) {
        MsgListener msgListener = new MsgListener();
        MsgToObject msgToObject = new MsgToObject();
        msgListener.MsgListenerStart();
        //Seller seller = msgToObject.convertXMLtoObject();
        //System.out.println(seller);
        SellerType seller = msgToObject.convertXMLtoObject();
        System.out.println(seller);
    }
}