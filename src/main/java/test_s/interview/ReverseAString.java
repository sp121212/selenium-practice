package test_s.interview;

public class ReverseAString {
	
	
	public static void main(String[] args) {
		
		String name="santanu";
		
		String a=getReverse(name);
		System.out.println(a);
	}
	
	
	public static String getReverse(String input) {
		
		int len=input.length();
		String reverse = "";
		for(int j=len-1;j>=0;j--) {
			
			char reverse1=input.charAt(j);
			reverse=reverse+reverse1;
		}
		
		System.out.println(reverse);
		
		return reverse;
		
	}

}
