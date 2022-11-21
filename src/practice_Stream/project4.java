package practice_Stream;

import java.io.*;
import java.net.*;

public class project4 {

	public static void main(String[] args) {
		InetAddress remote_addr = null;
		Socket socket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		
		try {
			remote_addr = InetAddress.getByName("www.naver.com");
			socket = new Socket(remote_addr, 80);
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch(IOException ex) {
			System.err.println("연결 오류 : " + ex.getLocalizedMessage());
			System.exit(-1);
		}
		
		try {
			out.println("GET http://www.naver.com/ HTTP/1.0\r\n\n");
			out.flush();
			
			while (true) {
				String str = in.readLine();
				if(str == null) break;
				System.out.println(str);
			}
			
			socket.shutdownOutput();
			socket.shutdownInput();
			socket.close();
		}catch(IOException ex) {}
		}

}
