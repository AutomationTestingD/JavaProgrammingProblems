package javaPrograms;

import java.util.Scanner;

public class MaximumOccuringChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.next();
		System.out.println(MaxChar(str));
					
	}
	
	public static String MaxChar(String str) {
		
		int[] count = new int[256];		
		
		for(int i=0; i<str.length(); i++) 
		{
			
			count[str.charAt(i)]++;							
		}				
		
		int max=0; char result = 0;
		
		for(int i=0; i<str.length(); i++) 
		{
		
		if (max < count[str.charAt(i)])
		  {
			max = count[str.charAt(i)];
			result = str.charAt(i);
    	  }			
		
	}
		String a = result +" has occured "+ max +" times";
		return a;

	}
	
}
