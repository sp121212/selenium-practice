package test_s.phaseone.waitconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameWithWaitConcept {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		By locationLoc=By.id("RESULT_TextField-3");
		By descLoc=By.id("RESULT_TextArea-5");
		
		By frameLoc=By.id("frame-one748593425");
		WebElement frameEle=driver.findElement(frameLoc);
		
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLoc));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameEle));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		
		driver.findElement(locationLoc).sendKeys("Pune");
		driver.findElement(descLoc).sendKeys("YERAWADA");
	}

}
