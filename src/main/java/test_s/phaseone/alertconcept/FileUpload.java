package test_s.phaseone.alertconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		
		WebElement eleFileUpload=driver.findElement(By.cssSelector("input[type='file']"));
		eleFileUpload.sendKeys("C:\\Users\\CEPL\\Downloads\\test (2).xlsx");
		
		WebElement eleEnterFileName=driver.findElement(By.cssSelector("input[type='text']"));
		eleEnterFileName.sendKeys("TEST FILE UPLOAD");
		
		
		WebElement eleEnterPressButton=driver.findElement(By.cssSelector("input[type='submit']"));
		eleEnterPressButton.click();
	}
}
