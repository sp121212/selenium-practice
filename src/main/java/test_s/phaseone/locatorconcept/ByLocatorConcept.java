package test_s.phaseone.locatorconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test_s.phaseone.util.BrowserUtil;

public class ByLocatorConcept {


	/*
	 * 1. id
	 * 2. className
	 * 3. name
	 * 
	 * 4. xpath
	 * 5. css selector
	 * 
	 * 6. link
	 * 7. partial link
	 * 
	 * 8. tagName
	 * 
	 */

	public static WebDriver driver=null;

	public static void main(String[] args) {

		BrowserUtil browser= new BrowserUtil();

		driver=browser.launchBrowser("chrome");
		browser.launchApplication("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//1. Id
		//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");

		//2. name
		//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");

		//3. classname
		//		driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");

		//4. Xpath
		//		driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys("test@gmail.com");

		//5. css selector
		//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");

		//6. LinkText
//		List<WebElement> listElements=driver.findElements(By.tagName("a"));
//		for(WebElement element:listElements) {
//			System.out.println(element.getText() +" :::: "+element.getAttribute("href"));
//		}
		
//		driver.findElement(By.linkText("Gift Certificates")).click();

		
		//7. Partial Linktext
//		driver.findElement(By.partialLinkText("Gift")).click();
		
		//8. Tag name
//		String str=driver.findElement(By.tagName("h2")).getText();
//		System.out.println(str);
		
		// When invalid locator passed then org.openqa.selenium.NoSuchElementException: exception will occur.
//		driver.findElement(By.name("abcd"));
		
		
		//When the sendkeys pass as null; Ilegal argument exception, Keys tos end should be a not null char seqence.
//		driver.findElement(By.name("email")).sendKeys(null);
		
		// if interger is passed in sendkeys Complietime err
//		driver.findElement(By.name("email")).sendKeys(123);
		
		// StringBuffer and StringBuilder also accepted in sendkeys and they are belongs from Char Sequence.
		
//		StringBuilder sb=new StringBuilder("1212");
//		sb.append(" Santanu");
//		driver.findElement(By.name("email")).sendKeys(sb);
		
//		StringBuffer sb=new StringBuffer(" 1212");
//		
//		sb.reverse().append(" UNAS");
//		driver.findElement(By.name("email")).sendKeys(sb);
	}

}
