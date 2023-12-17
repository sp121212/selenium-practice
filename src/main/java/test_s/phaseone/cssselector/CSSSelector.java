package test_s.phaseone.cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static  WebDriver driver=null;
	
	
	public static void main(String[] args) {

		driver=new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		By  cssEmail=By.cssSelector("#input-email");
//		By cssEmail=By.cssSelector("input[id='input-email']");
//		By cssEmail=By.id("input-email");
//		By cssEmail=By.cssSelector("input[class='form-control'][name='email']");
//		By cssEmail=By.cssSelector("#input-email.form-control");
		
		
		//Contains *
//		By cssEmail=By.cssSelector("input[placeholder*='E-Mail']");
		
		//Starts with ^
//		By cssEmail=By.cssSelector("input[placeholder^='E']");
		
		//Ends with $
//		By cssEmail=By.cssSelector("input[placeholder$='ress']");
//		driver.findElement(cssEmail).sendKeys("test@123");
		
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		// Parent to child >
		
//		By cssCountry=By.cssSelector("select[name='Country'] > option");
		
		
		
		/**
		 * Indexing
		 * 
		 */
		//select first option.
		By cssCountry=By.cssSelector("select[name='Country']>option:first-child");
		
		// select last option
//		select[name='Country']>option:last-child
		
		//5th child
//		select[name='Country']>option:nth-child(5)
		
		// get the options that are in even index
//		select[name='Country']>option:nth-child(even)
		//get the options list that are in odd index
//		select[name='Country']>option:nth-child(odd)
		
		
		
		
		
		
	}
}
