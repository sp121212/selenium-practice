package test_s.phaseone.basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	/*
	 * It handle browser simulation
	 * 1. to
	 * 2. back
	 * 3. forward;
	 * 4. refresh
	 * 
	 */


	public static WebDriver driver=null;


	public static void main(String[] args) throws MalformedURLException {
	
		driver=new ChromeDriver();
			
		driver.get("https://google.com");
		URL url=new  URL("https://amazon.com");
		driver.navigate().to(url);
		
		driver.navigate().back();
		
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
//		driver.quit();
	}


}
