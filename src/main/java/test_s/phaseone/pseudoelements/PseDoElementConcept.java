package test_s.phaseone.pseudoelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseDoElementConcept {
	
	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		String script="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')";
		String mandField=js.executeScript(script).toString();
		
		System.out.println(mandField);
		
		if(mandField.contains("*")) {
			driver.findElement(By.id("input-firstname")).sendKeys("Hey There!! pseudo element!");
		}else {
			System.out.println("element not found!");
		}
		
	}

}
