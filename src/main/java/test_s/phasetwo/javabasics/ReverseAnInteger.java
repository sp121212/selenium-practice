package test_s.phasetwo.javabasics;

public class ReverseAnInteger {
	
	public static void main(String[] args) {
		
		int num=1902;
		
		int rev=0;
		
		while(num!=0) {
			
			int reminder=num%10;
			System.out.println(reminder);
			
			rev=rev*10+reminder;
			num=num/10;
		}
		
		System.out.println(rev);
	}

}
