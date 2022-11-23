package n202014089;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Random;

public class Exam7Client {
	static Random random = new Random();
	static String[] a = {"one", "two", "three", "four", "five"};
	
	static class Echo implements Runnable{

		@Override
		public void run() {
			final int PORT = 8087;
			final String HOST = "localhost";
			
			try(Socket socket = new Socket(HOST,PORT)){
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
				String s1 = a[random.nextInt(a.length)];
				writer.write(s1);
				writer.write("\r\n");
				writer.flush();
				String s2 = reader.readLine();
				System.out.println(s1);
			
			}catch (Exception ex) {
			}
		}
		
	}
	public static void main(String[] args) {
		for (int i = 0; i < a.length; i++) {
			new Thread(new Echo()).start();
		}
	}

}
