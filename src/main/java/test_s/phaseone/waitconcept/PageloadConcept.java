package test_s.phaseone.waitconcept;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageloadConcept {

	static WebDriver  driver=null;
	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://classic.freecrm.com/index.html");
	

	}

	
	public static boolean isPageLoaded(int timeout) {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		String flag=wait.until(ExpectedConditions.jsReturnsValue("return document.readyState")).toString();
		
		return Boolean.parseBoolean(flag);
	}
}
