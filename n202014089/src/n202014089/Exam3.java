package n202014089;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


class Student extends Exam2{
	String studentNo;
	String name;
	
	public Student() {
		studentNo = "202014089 \n";
		name = "김혜연 \n";
	}
	
	public String toString() {
		return("202014089\n 김혜연 ");
	}
	
}

public class Exam3 {

	public static void main(String[] args)throws IOException{
		File file = new File("/Users/kimhyeyeon/temp/exam3.dat");
		
		OutputStream out = new FileOutputStream(file);
		OutputStreamWriter writer = new OutputStreamWriter(out,"UTF-8");
		Student std = new Student();
		
		writer.write(std.toString());
		writer.close();
	}

}
