package test_s.phaseone.framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(2000);
		
		
		
		WebElement frameNavbar=driver.findElement(By.xpath("//frame[@name='navbar']"));
		
		
		driver.switchTo().frame(frameNavbar);		
		WebElement element=driver.findElement(By.xpath("//a[text()='No frames']"));
		element.click();
	}

}
