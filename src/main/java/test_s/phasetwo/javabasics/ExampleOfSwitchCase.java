package test_s.phasetwo.javabasics;

public class ExampleOfSwitchCase {
	public static void main(String[] args) {
		
		String browserName="chrome";
		
		switch(browserName.trim().toLowerCase()) {
		
		case "chrome":
			System.out.println("Browser name is :"+ browserName);
			break;
			
		case "firefox":
			System.out.println("Browser name is :"+ browserName);
			break;
			
		case "edge":
			System.out.println("Browser name is :"+ browserName);
			break;
			
		case "safari":
			System.out.println("Browser name is :"+ browserName);
			break;	
			
		default:
			System.out.println("Invalid browser name "+browserName);
		}
		
		
		
		
	}

}
