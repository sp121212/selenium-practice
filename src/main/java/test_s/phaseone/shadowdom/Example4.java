package test_s.phaseone.shadowdom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {
	
	
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://books-pwakit.appspot.com/");
		
		
		String jsSearch="return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")";
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement eleSearch=(WebElement) js.executeScript(jsSearch);
		
		eleSearch.sendKeys("India will win 2023 World cup today only!!");
	}

}
