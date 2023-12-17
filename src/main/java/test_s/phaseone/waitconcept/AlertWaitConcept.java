package test_s.phaseone.waitconcept;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWaitConcept {
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		alert.getText();
		alert.accept();
		
		System.out.println("TEST");
		
	}

}
