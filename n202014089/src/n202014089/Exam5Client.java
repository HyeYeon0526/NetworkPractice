package n202014089;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Exam5Client {

	public static void main(String[] args) throws UnknownHostException, IOException{
		final String HOST = "localhost";
		final int PORT = 8086;
		
		try (Socket socket = new Socket(HOST,PORT)){
			System.out.println("안녕하세요.");			
		}catch(Exception ex) {
		}
		

	}
}

