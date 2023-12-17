package test_s.phaseone.xpathconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	/**
	 * Xpath is the address of a weblemenst inside a HTML DOM
	 * 
	 * Absolute Path - Full path starts from the HTML.
	 * It's recomended to use, as it start from the origin and if there is small chnages happened on the html page,
	 * then the Abs path will not work.
	 * 
	 * 
	 * Relative Path:
	 * 
	 * Using Element Attributes+ Xpath function.
	 * syntax //div[@id='email-id']
	 */
	
	
	public static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		
		driver=new ChromeDriver();
		
		/**
		 * Formula 1: //htmltag[@attr='value']
		 **/		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Test xpath");
		
		
		
		/**
		 * Formula 2: //htmltag[@attr1='value1' and @attr2='value2']
		 */
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='E-Mail Address']"));
		
		
		
		
		/**
		 * Formula 3: text()
		 */
		//label[text()='E-Mail Address']
		//h2[text()='Returning Customer']
		//label[@class='control-label' and text()='Password']
		
		
		/***
		 * formula 4:contains
		 */
		//p[contains(text(),'By creating')]
		//input[contains(@placeholder,'E-Mail')]
		
		
		/**
		 * 5. start-with
		 */
		//input[starts-with(@id,'input-p')]
		
		//p[starts-with(text(),'By creating')]
		
		/**
		 * 6. normalize-space()
		 */
		//label[normalize-space()='Yes']
		
	/**
	 *   7. indexing	
	 */		
//		((//div[@class='navFooterVerticalRow navAccessibility']/div)[last()]//a)[last()]
		
		
		/**
		 * backword traversing
		 */
		//input[@type='text']/parent::div/label[@for='input-email']
		//input[@type='text']/parent::div/child::label
//		(//input[@type='text']/ancestor::div)[1] //not recomended
				
		
		//preceding-sibling
		
		//input[@type='text']/preceding-sibling::label
				
		//following sibling
		//label[@for='input-email']/following-sibling::input
		
		
	}
	

}
