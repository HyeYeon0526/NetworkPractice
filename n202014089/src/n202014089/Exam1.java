package n202014089;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Exam1 {

	public static void main(String[] args) throws IOException{
		File file = new File("/Users/kimhyeyeon/temp/exam1.txt");
		
		OutputStream out = new FileOutputStream(file);
		OutputStreamWriter writer = new OutputStreamWriter(out,"UTF-8");
		writer.write("202014089 \n");
		writer.write("김혜연 \n");
		writer.close();

	}

}
