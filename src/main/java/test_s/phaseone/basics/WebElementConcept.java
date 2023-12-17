package test_s.phaseone.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import test_s.phaseone.util.BrowserUtil;
import test_s.phaseone.util.ElementUtil;

public class WebElementConcept {
	public static WebDriver driver=null;
	static String browserName="chrome";
	static String appUrl="https://naveenautomationlabs.com/opencart/index.php?route=account/login";
	
	public static void main(String[] args) throws InterruptedException {
		
		
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		BrowserUtil driverUtil=new BrowserUtil();
		
		driver=driverUtil.launchBrowser(browserName);
		driverUtil.launchApplication(appUrl);
		
		ElementUtil elementUtil=new ElementUtil(driver);
		
		//1st
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2nd
//		WebElement email=driver.findElement(By.id("input-email"));
//		WebElement pass=driver.findElement(By.id("input-password"));
//		email.sendKeys("test@gmail.com");
//		pass.sendKeys("test@123");
		
		//3rd
//		By email=By.id("input-email");
//		By pass=By.id("input-password");
//		
//		WebElement emailId=driver.findElement(email);
//		WebElement password=driver.findElement(pass);
//		
//		emailId.sendKeys("test@123");
//		password.sendKeys("test@gamil.com");
		
		
//		//4th 
//		By email=By.id("input-email");
//		By pass=By.id("input-password");
//
//		WebElement emailId=getWebElements(email);
//		WebElement password=getWebElements(pass);
//		
//		emailId.sendKeys("test@123");
//		password.sendKeys("test@gamil.com");
		
		//5th
		
//		By email=By.id("input-email");
//		By pass=By.id("input-password");
//		
//		doSendkeys(email,"test@gmail.com");
//		doSendkeys(pass,"test@123");
		
		
		//6th WebElement Util Approch
//		By email=By.id("input-email");
//		By pass=By.id("input-password");
//		
//		elementUtil.doSendkeys(email,"test@gmail.com");
//		elementUtil.doSendkeys(pass,"test@123");
		
		//7th Browser Util + ElementUtil
		By email=By.id("input-email");
		By pass=By.id("input-password");
		
		elementUtil.doSendkeys(email,"test@gmail.com");
		elementUtil.doSendkeys(pass,"test@123");
		
		//8h Approach NOT RECOMENDED
//		String emailLoc="input-email";
//		String passLoc="input-password";
//		By email=getBy(emailLoc);
//		By pass=getBy(passLoc);
//		
//		elementUtil.doSendkeys(email,"test@gmail.com");
//		elementUtil.doSendkeys(pass,"test@123");
		
		Thread.sleep(2000);
		driver.quit();
		
		
		// 9th Page Object Model
		
	}

	public static By getBy(String locator) {
		return By.id(locator);
	}
	
}
