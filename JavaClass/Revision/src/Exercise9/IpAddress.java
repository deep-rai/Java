package Exercise9;
import java.io.*;
import java.net.*;

public class IpAddress {
    public void getAddress() {
        try {
            InetAddress showIp = InetAddress.getByName("www.facebook.com");
            System.out.println("HostName " + showIp.getHostName());
            System.out.println("IP address " + showIp.getHostAddress());
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
