package javaPrograms;

import java.util.Scanner;

public class Matrics {

	public static void main(String[] args) {
	
	
         int[][] a = new int[3][3];
         
		mat(a);
		
           for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
			System.out.println();			
		}
		
	}
	
	
	public static int[][] mat(int[][] a){
		
		Scanner sc = new Scanner(System.in);
		
         for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {   
				
		      a[i][j] = sc.nextInt();
				      
			}}
		return a;
	}

}
