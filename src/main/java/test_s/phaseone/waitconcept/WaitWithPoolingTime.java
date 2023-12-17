package test_s.phaseone.waitconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitWithPoolingTime {

	public static WebDriver driver=null;
	
	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		
		By userNameLoc=By.cssSelector("input[name='username1']");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20),Duration.ofSeconds(2));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(userNameLoc)).sendKeys("test@gmail.com");
		
		System.out.println("DONE");
		

	}


}
