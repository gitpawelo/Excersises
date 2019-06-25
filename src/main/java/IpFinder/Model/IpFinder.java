package IpFinder.Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpFinder {

    public boolean hasIp(String text) {

        String ipPattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.$" +
                "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.$" +
                "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.$" +
                "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println(true);
            return true;

        }
        System.out.println(false);
        return false;

    }
}

