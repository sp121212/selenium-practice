package test_s.phaseone.shadowdom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowdomExample {
	
	public static void main(String[] args) throws InterruptedException {
		//Example using chrome settings
		
		WebDriver driver=new ChromeDriver();
		driver.get("chrome://settings/");
		
		
		Thread.sleep(2000);
		
		String jsScript="return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		

		
		WebElement search=	(WebElement) js.executeScript(jsScript);
		
		search.sendKeys("downloads");
		
		
	}

}
