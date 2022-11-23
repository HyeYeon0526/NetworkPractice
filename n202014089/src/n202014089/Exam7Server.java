package n202014089;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam7Server {

	public static void main(String[] args) throws IOException {
		final int PORT = 8087;
		try(ServerSocket serverSocket = new ServerSocket(PORT)){
			ExecutorService executor = Executors.newFixedThreadPool(10);
			while (true) {
				try {
					Socket socket = serverSocket.accept();
					executor.submit(new Echo(socket));
				} catch(IOException ex) {
				}
			}
		}catch(IOException ex){
		}

	}
	
	static class Echo implements Runnable{
		Socket socket;
		
		public Echo(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try (Socket autoClose = socket) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(autoClose.getInputStream(), "UTF-8")); 
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(autoClose.getOutputStream(), "UTF-8")); 
				String s = reader.readLine(); 
				writer.write(s.toUpperCase()); 
				writer.write("\r\n"); 
				writer.flush();
			} catch (Exception ex) {
	
			}
		}
		
	}

}
