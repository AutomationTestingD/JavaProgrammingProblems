package javaPrograms;

	import java.util.HashSet;
	import java.util.Set;
	
	public class REMOVEDUPLICATEELEMENTS {
		public static void main(String[] args) {
	
			String str = "Dileep Kumar Samudrala";
			
			char[] a = str.toCharArray();
			String str2="";
			
			Set<Character> st = new HashSet<Character>();
			
			for(int i=0;i<str.length(); i++){
					
				if((st.add(a[i]))){
					
					str2+=a[i];		
				}
			}	
			System.out.println(str2);
		}
	}
	

