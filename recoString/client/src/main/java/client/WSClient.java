package client;
import client.WSGUI;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import java.awt.EventQueue;
import java.net.URL;

import org.example.contract.recostring.RecoStringPortType;
import org.example.contract.recostring.RecoStringService;

public class WSClient {
    public static RecoStringPortType pas_port = null;//nen  
    
    public static  String response_string = null;//nen
    
    private static final QName SERVICE_NAME = new QName("http://www.example.org/contract/recoString",
            "recoStringService");
    private static final QName PORT_NAME = new QName("http://www.example.org/contract/recoString",
            "recoStringPort");

    public static void main(String[] args) throws Exception {


        String endpointAddress = "http://127.0.0.1:8080/recoString/services/recoString";

        Service service = Service.create(new URL(endpointAddress + "?wsdl"), SERVICE_NAME);
        RecoStringPortType port = service.getPort(RecoStringPortType.class);
        pas_port = port;
        // -------------------------------------------------
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WSGUI frame = new WSGUI();
                    frame.setVisible(true);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        // -------------------------------------------------

        // -------------------------------------------------
    }

    public static void recoStringCl(RecoStringPortType port, String pstring) {
        String resp = port.recoString(pstring);
        response_string =resp;
        
        System.out.println("String - " + pstring + " is " + resp);
    }
}
