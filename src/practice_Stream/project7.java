package practice_Stream;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class project7 {

	public static void main(String[] args) {
		final int PORT = 26;
		try(ServerSocket serverSocket = new ServerSocket(PORT)){
			while (true) {
				try(Socket socket = serverSocket.accept()){
					Writer out = new OutputStreamWriter(socket.getOutputStream(),"UTF-8");
					Date now = new Date();
					out.write(now.toString());
					out.write("\n\n");
					out.flush();
				} catch(IOException ex) {
				}
			}
			}catch(IOException ex) {
			System.err.println(ex);
		}
	}

}
