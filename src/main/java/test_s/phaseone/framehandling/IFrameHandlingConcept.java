package test_s.phaseone.framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandlingConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//img[contains(@title,'Vehicle')]")).click();
		
		WebElement  eleFrame=driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]"));
		driver.switchTo().frame(eleFrame);
//		driver.switchTo().frame(0);
		
//		WebElement ele=driver.findElement(By.xpath("//div[@id='imageTemplateContainer']"));
//		ele.click();
		
		Thread.sleep(2000);
		WebElement eleProposalTitle=driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']"));
		eleProposalTitle.sendKeys("Selenium Automation");
		
		driver.switchTo().defaultContent();
	}

}
