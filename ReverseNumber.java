package Day3;

public class ReverseNumber {

	public static void main(String[] args) {
		
		ReverseNum(443754988);

	}

	private static void ReverseNum(int n) {
		
		int Rev =0,Reminder;
		for(int i=0; n>0;i++) {
			
			Reminder = n%10;
			Rev =(Rev*10)+Reminder;
			n=n/10;
			
			System.out.println(Rev);
		}
		
	}

}
