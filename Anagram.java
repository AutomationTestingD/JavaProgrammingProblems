package Day3;

public class Anagram {

	public static void main(String[] args) {

         System.out.println(isAnagram("SIL45ENT","LIST41EN"));

	}
	
	
	
	public static boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }      
        
        char[] map = new char[256];
            
        for (char c : s.toCharArray()) {
            map[c]++;
            System.out.println(map[c]);
          
        }

        for (char c : t.toCharArray()) {
            map[c]--;
            System.out.println(map[c]);
            if (map[c] < 0) {
                return false;
            }
        }
        return true;
    }

}
