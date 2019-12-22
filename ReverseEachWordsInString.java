package javaProg;

public class ReverseEachWordsInString {

	public static void main(String[] args) {
		
		
		String str1 = "This is my Test";
		
		
		String[] words = str1.split(" ");
		String RevWords ="";
		
		for(int i=0;i<words.length;i++) {
			
			String word = words[i];
			String Revword = "";
			
			for(int j=word.length()-1; j>=0;j--) {
				
				Revword = Revword+word.charAt(j);
				
			}
			RevWords = RevWords+Revword+" ";
			
		}
		System.out.println(RevWords);

	}

}
