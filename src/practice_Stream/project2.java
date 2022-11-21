package practice_Stream;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class project2 {

	public static void main(String[] args) {
		InetAddress local_addr = null;
		InetAddress remote_addr = null;
		
		try {
			local_addr = InetAddress.getLocalHost();
			remote_addr = InetAddress.getByName("www.naver.com");
		} catch (UnknownHostException ex) {
			System.err.println("유효하지 않은 도메인입니다. ");
			System.exit(-1);
		}
		System.out.println("local_addr = " +local_addr.getHostAddress());
		System.out.println("remote_addr = " +remote_addr.getHostAddress());
		
	}

}
