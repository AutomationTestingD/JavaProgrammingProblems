/*  
// utility function to check for vowel 
    static boolean isVowel(char c) { 
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U'); 
    } 
  
// Function to reverse order of vowels 
static String reverseVowel(String str) { 
    // Start two indexes from two corners 
    // and move toward each other 
    int i = 0; 
    int j = str.length()-1; 
    char[] str1 = str.toCharArray(); 
    while (i < j) 
    { 
        if (!isVowel(str1[i])) 
        { 
            i++; 
            continue; 
        } 
        if (!isVowel(str1[j])) 
        { 
            j--; 
            continue; 
        } 
  
        // swapping 
        char t = str1[i]; 
        str1[i]= str1[j]; 
        str1[j]= t; 
          
  
        i++; 
        j--; 
    } 
    String str2 = String.copyValueOf(str1); 
    return str2; 
} 
  
// Driver function 
    public static void main(String[] args) { 
        String str = "hello world"; 
        System.out.println(reverseVowel(str)); 
    } 
} 

Output: 
hollo werld
Time complexity : O(n) where n = length of string
Auxiliary Space : O(1)
 
 */

package Day3;

public class ReverseOvels {

	public static void main(String[] args) {


		ReverseOvel("aeiou");
		
	}
	
	// utility function to check for vowel 
	static boolean isVowel(char c) { 
        return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I'|| c == 'o' || c == 'O' || c == 'u' || c == 'U'); 
    } 	
	
	// Function to reverse order of vowels 
    static void ReverseOvel(String string) {

		int j=0;
		
    	 // Storing the vowels separately 
    	char[] c =string.toCharArray();
		String vowel ="";		
		
		 // Placing the vowels in the reverse 
        // order in the string 
		for(int i=0; i<string.length(); i++) 
			{		
				if(isVowel(c[i])) 
				{
				    vowel+= c[i];
			    	j++;
			    }		 
	        }
			
		for(int i=0; i<string.length(); i++)
			{	
			
				if(isVowel(c[i]))
				{
					c[i] = vowel.charAt(--j);
		
				}
			}
		
		System.out.println(c);
	
    	}

}



//Time complexity : O(n) where n = length of string
//Auxiliary Space : O(v) where v = number of vowels in string





