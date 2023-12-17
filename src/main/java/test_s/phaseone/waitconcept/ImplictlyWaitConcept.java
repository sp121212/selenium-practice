package test_s.phaseone.waitconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictlyWaitConcept {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://classic.freecrm.com/index.html");
		//Here the program will wait for 30 sec and try to get the webelement if not then give the exception.
		WebElement element=driver.findElement(By.cssSelector("input[placeholder='Username11']")); 
		element.sendKeys("test@gmail.com");
		
		
		
	}

}
