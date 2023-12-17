package test_s.phaseone.waitconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test_s.phaseone.util.ElementUtil;

public class ExplictWaitConcept {
	
	static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		ElementUtil eleUtil=new ElementUtil(driver);
		driver.get("https://classic.freecrm.com/index.html");
				
		By userNameLoc=By.xpath("//input[@placeholder='Username']");
		By userPassLoc=By.xpath("//input[@placeholder='Password']");
		By loginLoc=By.xpath("//input[@type='submit']");
	
		
		eleUtil.doSendKeysWithWait(userNameLoc,"test@gmail.com");
		eleUtil.doSendKeysWithWait(userPassLoc,"test123");
		eleUtil.doClickWithWait(loginLoc);
		
	}

	
	
}
