package n202014089;

import java.io.IOException;

public class Exam4 extends Exam2{

	public static void main(String[] args)throws IOException{
		String s = Student.readFile("exam3.dat", "UTF-8");
		System.out.println(s);
	}

}
