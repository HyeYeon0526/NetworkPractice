package n202014089;

import java.io.IOException;
import java.net.ServerSocket;

public class Exam5Server {

	public static void main(String[] args) throws IOException {
		final int PORT = 8086;
		
		try (ServerSocket serverSocket = new ServerSocket(PORT)){
			
			System.out.println("오케이!");
		}catch(Exception ex) {
		}
		
	}

}
