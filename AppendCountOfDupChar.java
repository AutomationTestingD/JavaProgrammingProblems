package javaPrograms;
public class AppendCountOfDupChar {

	public static void main(String[] args) {


		String str = "AAAbCCDDDD ";
		
		char[] c = str.toCharArray();
		String str2= ""; int count=1;
		
		for(int i=0; i<c.length-1;i++) {
			
			if (!(c[i]==c[i+1])){
				str2+=Integer.toString(count)+c[i];
				count=1;				
			}
			else				
				count++;   		    
		}
		System.out.println(str2);	
	}
}
