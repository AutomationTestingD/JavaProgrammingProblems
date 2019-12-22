package javaProg;
import java.util.HashMap;
import java.util.Iterator;

public class FindingDuplicateWords {

	public static void main(String[] args) {
		
		String str = "This is is my java java java program to to find dup";
		
		String[] str1 = str.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();		
		
		for (String element:str1) {
			
		if (hm.get(element)!= null) 
		{
			hm.put(element, hm.get(element)+1);	
		}			
		else hm.put(element, 1);				
		}		
		System.out.println(hm);				
	
	Iterator<String> itr = hm.keySet().iterator();
	
	while(itr.hasNext()) {
		
		String temp = itr.next();
	
		if(hm.get(temp)>1) {
		System.out.print("'"+temp+"' is repeated "+ hm.get(temp)+ " times ; ");
		}
	}
	}

}
