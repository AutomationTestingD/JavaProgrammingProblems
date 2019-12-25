package javaPrograms;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		
		String str = "DileepKumarDile";
		
		char[] c = new char[256]; char charact = 0 ;
		
		for(int i = 0; i<str.length();i++) {
			c[str.charAt(i)]++;
			
		}
		 for (int i = 0; i < str.length();  i++) 
	        { 
	            if (c[str.charAt(i)] == 1) 
	            { 
	                 charact = str.charAt(i); 
	                break; 
	            }    
	        }  
		
		System.out.println(charact);

	}

}

/*
 1) Scan the string from left to right and construct the count array.  256 character, increase the count
2) Again, scan the string from left to right and check for count of each
 character, if you find an element who's count is 1, return it.
 * */
