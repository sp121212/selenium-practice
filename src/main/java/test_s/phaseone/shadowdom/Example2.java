package test_s.phaseone.shadowdom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		String pizzaJSScript="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
				
		WebElement elePizza=(WebElement) js.executeScript(pizzaJSScript);
		
		elePizza.sendKeys("Farmhouse large");
		
	}

}
