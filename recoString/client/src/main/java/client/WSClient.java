package client;

import org.example.contract.recostring.RecoStringPortType;
import org.example.contract.recostring.RecoStringService;

public class WSClient {
    public static void main (String[] args) {
    	RecoStringService service = new RecoStringService();
    	RecoStringPortType port = service.getRecoStringPort();           

        //recoString(port, 10);
        //recoString(port, 0);
       // recoString(port, -10);
    } 
    
    public static void RecoString(RecoStringPortType port, 
            String numToDouble) {
       // int resp = port.doubleIt(numToDouble);
        System.out.println("String is  " + numToDouble);
    }
}
