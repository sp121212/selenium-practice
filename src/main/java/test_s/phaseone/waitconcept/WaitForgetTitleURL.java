package test_s.phaseone.waitconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForgetTitleURL {
	public static WebDriver driver=null;

	public static void main(String[] args) {
		driver=new ChromeDriver();

		driver.get("https://classic.freecrm.com/index.html");


		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		System.out.println(driver.getTitle());
		
		//Title Contains
		String titleFlag=wait.until(ExpectedConditions.titleContains("Free CRM software")).toString();
		System.out.println(titleFlag);	
		
		
		//titleIs
		boolean flag=wait.until(ExpectedConditions.titleIs("Free CRM software for customer relationship management, sales, and support."));
		
		if(flag==true) {
			System.out.println("Title is correct");
		}
		
		
	}
}
