package javaProg;

import java.util.HashMap;
import java.util.Iterator;

public class FindDuplicateCharInString {

	public static void main(String[] args) {
		
		String str = "testingisylife";
				
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();	
				
		for (int i=0;i<str.length()-1;i++) {
			char c = str.charAt(i);
			
			if(hm.get(c)!=null) 
			{			
			hm.put(c, hm.get(c)+1);
			}
			else
				hm.put(c, 1);		
					
		}
		System.out.println(hm);
		
		Iterator<Character> itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			
			char ch = itr.next();
			
			if(hm.get(ch)>1) {
				
				System.out.print("'"+ch+"' is repeated "+ hm.get(ch)+" times; ");
			}
			
		}

	}

}
