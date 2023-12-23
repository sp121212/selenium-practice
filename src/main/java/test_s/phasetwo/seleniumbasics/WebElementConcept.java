package test_s.phasetwo.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebElementConcept {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		RemoteWebDriver  driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		By loginTest=By.xpath("(//span[text()='Login'])[position()=2]");
		
		String loginText=driver.findElement(loginTest).getText();
		if(loginText.equals("Login")) {
			By loginButton=By.xpath("//span[@role='button']");
			driver.findElement(loginButton).click();
			
			
		}
		
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[title='Search for Products, Brands and More']")).sendKeys("Mens wear fashion");
		
		
		
	}

}
