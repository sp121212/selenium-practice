package test_s.phaseone.framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-and-nested-iframe/");
		
		Thread.sleep(2000);
		
		WebElement eleFirstText= driver.findElement(By.id("inp_val"));
		eleFirstText.sendKeys("1st crush");
				
				
		Thread.sleep(2000);
		
//		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.cssSelector("#pact2")));
		
		WebElement ele2ndText=driver.findElement(By.id("jex"));
		ele2ndText.sendKeys("2nd crush");
		
		Thread.sleep(2000);
		
//		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.cssSelector("#pact3")));
		
		driver.findElement(By.cssSelector("#glaf")).sendKeys("3rd crush");
		
		
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();		
		driver.switchTo().defaultContent();		
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(2000);
		
		eleFirstText.clear();
		Thread.sleep(2000);
		eleFirstText.sendKeys("1st Crush Modified");
	
	}

}
