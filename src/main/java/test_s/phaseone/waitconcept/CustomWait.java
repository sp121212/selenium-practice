package test_s.phaseone.waitconcept;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import test_s.phaseone.util.AppException;

public class CustomWait {

	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();

		driver.get("https://classic.freecrm.com/index.html");

		By userIdLocator=By.xpath("//input[@type='text11']");
		
		WebElement ele=WaitForRetringElement(userIdLocator,20);

		ele.sendKeys("test");

	} 

	public static WebElement  WaitForRetringElement(By locator,int timeout) throws InterruptedException {
		WebElement element=null;
		int attempt=0;

		while(attempt<timeout) {
			
			try {
				element=driver.findElement(locator);
				System.out.println("Element found...");
				break;
			}catch(NoSuchElementException e) {
				Thread.sleep(1000);
				System.out.println("Element not yet found:"+ attempt);
			}
			
			attempt++;

			
		}
		if(element==null) {
			throw new AppException("Element not found after "+attempt+" #of attempt.");
		}
		return element;


	}
}
