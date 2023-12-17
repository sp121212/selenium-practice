package test_s.phaseone.windowshandleconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleSelenium4AdvFeature {
	
	public static void main(String[] args) throws InterruptedException {
		//Driver setup
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("open organge hrm web page.");
		Thread.sleep(5000);
		
		
		String parentWindowId=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		driver.quit();
		
	}
	

}
