package practice_Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class project1 {

	
	public static void generateCharacter(OutputStream out) throws IOException {
		int firstPrintableCharacter = 33;
		int lastPrintableCharacter = 126;
		for(int ch = firstPrintableCharacter; ch <= lastPrintableCharacter; ++ch)
			out.write(ch);
		out.write('\n');
		out.write('\r');
	}
	public static void main(String[] args) throws IOException {
		generateCharacter(System.out);
		generateCharacter(new FileOutputStream("./Desktop/for_vscode/t.txt"));

	}
	
	

}
