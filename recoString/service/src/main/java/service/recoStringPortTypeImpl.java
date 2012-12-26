package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.jws.WebService;
import org.example.contract.recostring.RecoStringPortType;

@WebService(targetNamespace = "http://www.example.org/contract/recoString", portName = "recoStringPort", serviceName = "recoStringService", endpointInterface = "org.example.contract.recostring.RecoStringPortType")
public class recoStringPortTypeImpl implements RecoStringPortType {
    // --------------------------------------------------------------------------------------------
    //
    public static boolean IsEmail(String email)//
    {
        Pattern p = Pattern.compile("(([a-zA-Z][\\w]*)@[\\w[.]]*\\.+([a-z]+))");//

        Matcher m = p.matcher(email);
        boolean b = m.matches();
        return b;
    }

    //
    //
    public static boolean IsIp(String Ip) {
        Pattern p = Pattern
                .compile("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");//

        Matcher m = p.matcher(Ip);
        boolean b = m.matches();
        return b;
    }

    //
    public static boolean IsURL(String URL) {
        Pattern p = Pattern
                .compile("^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]");//

        //
        Matcher m = p.matcher(URL);
        boolean b = m.matches();
        return b;
    }

    //
    // --------------------------------------------------------------------------------------------
    public String recoString(String numberToDouble) {

        // ----------------

        String answer = "0 - this is usual string";
        if (IsEmail(numberToDouble)) {
            answer = "3- this is Email-adress";
        }

        else if (IsIp(numberToDouble)) {
            answer = "1 - this is Ip-adress";
        }

        else if (IsURL(numberToDouble)) {
            answer = "2 - this is URL-adress";
        }

        // ----------------
        return answer;//

    }
}
