package test_s.phaseone.alertconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpConcept {

	public static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		System.out.println(alert.getText());
		alert.dismiss();
		
		Thread.sleep(2000);
		WebElement elePrompt=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		elePrompt.click();
		Thread.sleep(2000);
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.sendKeys("santanu panda");
		alert1.accept();
		Thread.sleep(3000);
		
		
		
		
		
	}
	
}
