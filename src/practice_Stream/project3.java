package practice_Stream;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class project3 {

	public static void main(String[] args) {
		InetAddress[] remote_addr = null;
		try {
			remote_addr = InetAddress.getAllByName("www.yahoo.com");
		} catch(UnknownHostException ex){
			System.err.println("유효하지 않은 도메인입니다.");
			System.exit(-1);
		}
		
		for(int n = 0; n < remote_addr.length; ++n) {
			System.out.println("야후 ["+ n + "] :" + remote_addr[n].getHostAddress());
			// 네이버는 IP 2개, daum은 1개, google은 IPv6,IPv4 둘 다, yahoo는 IP가 여러개 할당되어있는 것을 확인할 수 있다.
		}
	}

}
