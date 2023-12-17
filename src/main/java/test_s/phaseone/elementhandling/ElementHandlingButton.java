package test_s.phaseone.elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementHandlingButton {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/register/");
		
		WebElement eleSubmit=driver.findElement(By.xpath("//button[@id='submitButton']"));
		System.out.println(eleSubmit.isDisplayed());
		System.out.println(eleSubmit.isEnabled());
//		eleSubmit.click(); // org.openqa.selenium.ElementClickInterceptedException
		
		Actions  act=new Actions(driver);
		
		act.click(eleSubmit).click().perform(); // No Exception
		
		System.out.println("DONE...");
	}

}
