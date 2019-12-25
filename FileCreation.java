package javaPrograms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("test.txt");
		file.createNewFile();
		if(file.exists()) {
			
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			System.out.println(file.canExecute());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.err.println(file.getTotalSpace());
			System.out.println(file.getUsableSpace());
			System.out.println(file.length());
		}
		
		FileWriter fw = new FileWriter(file);
		
		fw.append("Hi this is dileep Kumar Samudrala");
		fw.append("\n"+"Dileep kUmar");
		fw.close();
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext())
		 {
			
			System.out.print(sc.next()+" ");
		}

		
		
	}

}
