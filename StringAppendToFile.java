package javaPrograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StringAppendToFile {

	public static void main(String[] args) throws IOException {

		usingBufferedWritter();
	}
		public static void usingBufferedWritter() throws IOException {
		try { 
	         String data = " Tutorials Point is a best website in the world";
	         File f1 = new File("C:\\Users\\admin\\Desktop\\right.txt");
	         if(!f1.exists()) {
	            f1.createNewFile();
	         } 
	         FileWriter fileWritter = new FileWriter(f1.getName(),true);
	         BufferedWriter bw = new BufferedWriter(fileWritter);
	         bw.write(data);
	         bw.close();
	         System.out.println("Done");
	      } 
		catch(IOException e){
	         e.printStackTrace();
	      }

	}
}
