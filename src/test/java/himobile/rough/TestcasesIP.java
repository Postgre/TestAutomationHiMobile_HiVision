package himobile.rough;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestcasesIP {

	public static void main(String[] args) throws Exception {
		
		String myIp = InetAddress.getLocalHost().getHostAddress();
		InetAddress ip1 = InetAddress.getLocalHost();
		InetAddress ip2 = InetAddress.getLoopbackAddress();
		
		System.out.println(myIp);
		System.out.println(ip1);
		System.out.println(ip2);

	}

}
