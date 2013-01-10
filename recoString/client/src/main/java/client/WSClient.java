package client;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;
import java.net.URL;

import org.example.contract.recostring.RecoStringPortType;
import org.example.contract.recostring.RecoStringService;

public class WSClient {
    private static final QName SERVICE_NAME = new QName("http://www.example.org/contract/recoString",
            "recoStringService");
    private static final QName PORT_NAME = new QName("http://www.example.org/contract/recoString",
            "recoStringPort");

    public static void main(String[] args) throws Exception {
        
        String endpointAddress = "http://127.0.0.1:8080/recoString/services/recoString";

        Service service = Service.create(new URL(endpointAddress + "?wsdl"), SERVICE_NAME);
        RecoStringPortType port = service.getPort(RecoStringPortType.class);


        System.out.println("##################################SERVICE is RUNNING#################################");
        recoStringCl(port, "test@mail.com");
        //recoStringCl(port, "http://test.site");//Here we have exeption . PLANNED ! 
        recoStringCl(port, "Usual test string");
        System.out.println("##################################END OF REQUEST#####################################");
    }

    public static void recoStringCl(RecoStringPortType port, String pstring) {
        String resp = port.recoString(pstring);
        System.out.println("String - " + pstring + " is " + resp);
    }
}
