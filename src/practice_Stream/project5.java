package practice_Stream;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class project5 {

	public static void main(String[] args) {
		File[] roots = File.listRoots();
		for(File root : roots) {
			System.out.print(root + "\t");
		}
		System.out.println();
		System.out.println();
		
		File dir = new File("/Users/kimhyeyeon/Desktop/hihi");
		File dir2 = new File(dir + File.separator +"src");
		File[] list = dir2.listFiles((directory, name) -> directory.exists() && name.endsWith(".java"));
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for(int n = 0; n < list.length; ++n) {
			System.out.print(n + " : " + list[n].getName());
			System.out.print("\tExec(" + list[n].canExecute() + ")");
			System.out.print("\tRead(" + list[n].canRead() + ")");
			System.out.println("\tWrite(" + list[n].canWrite() + ")");
			System.out.println("(Date : " + format.format(new Date(list[n].lastModified()))+")");
		}

	}

}
