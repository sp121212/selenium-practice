package test_s.phaseone.elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementHandlingTextbox {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		WebElement ele=driver.findElement(By.xpath("//input[@name='lname' and @id='pass']"));
		
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isEnabled());
		
//		ele.sendKeys("test"); // org.openqa.selenium.ElementNotInteractableException
		
		Actions  act=new Actions(driver);
		act.sendKeys("text").perform();
		
		
		System.out.println("DONE");
		
	}
}
