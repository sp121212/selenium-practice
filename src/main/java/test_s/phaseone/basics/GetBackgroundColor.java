package test_s.phaseone.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBackgroundColor {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html?e=1");
		
		WebElement ele=driver.findElement(By.xpath("//input[@type='submit']"));
		
		String text=ele.getCssValue("background-color");
		
		System.out.println(text);
	}

}
