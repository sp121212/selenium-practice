package test_s.phaseone.shadowdom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {
	public static void main(String[] args) {

		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");

		
		WebElement eleFrame=driver.findElement(By.xpath("//iframe[@id='pact']"));
		driver.switchTo().frame(eleFrame);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		String jsScriptTea="return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		WebElement eleTea=(WebElement) js.executeScript(jsScriptTea);
		eleTea.sendKeys("Masala Tea");
	}
}
