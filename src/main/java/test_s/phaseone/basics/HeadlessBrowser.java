package test_s.phaseone.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	/**
	 * -- No active browser window
	 * -- No actiev UI
	 * -- The testing happening behind the scene
	 * -- It's slightly better perform that UI testing mode
	 * -- 
	 * 
	 * Cons
	 * -- If may fails during complex UII scenarios
	 *
	 *When to use:
	 *
	 *CI CD -- Cloud AWS -- Linux - Jenkins
	 */

	
	public static void main(String[] args) {
		
		ChromeOptions co=new ChromeOptions();
		
//		co.addArguments("--headless");
//		co.addArguments("--incognito");
		WebDriver  driver=new ChromeDriver(co);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}
		
	
}
