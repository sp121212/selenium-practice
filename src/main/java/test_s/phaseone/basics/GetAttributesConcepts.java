package test_s.phaseone.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributesConcepts {
	
	// fetch a value or multiple from Web, using selenium getAttribute() and  findElements.
	// This concept is alos called WebScrapping.
	public static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement email=driver.findElement(By.id("input-email"));
		
		email.sendKeys("Santanu");
		
		System.out.println("Place Holder: "+email.getAttribute("placeholder"));
		
		System.out.println("Type : "+email.getAttribute("type"));
		
		System.out.println("value : "+email.getAttribute("value"));
		
		
	}
	
	

}
