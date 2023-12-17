package test_s.phaseone.windowshandleconcept;

import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindowHandling {


	public static void main(String[] args) throws InterruptedException {
		//Driver setup
		WebDriver driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("open organge hrm web page.");
		Thread.sleep(5000);

		String parentWindowId=driver.getWindowHandle();
		System.out.println("Parent Window ID: "+parentWindowId);

		//click on twitter link,
		WebElement element=driver.findElement(By.cssSelector("a[href*='twitter']"));
		element.click();
		System.out.println("click on twitter");


		Set<String> windowHandles =driver.getWindowHandles();
		Iterator<String>  itr =windowHandles.iterator();

		while(itr.hasNext()) {
			String windowID=itr.next();
			System.out.println("window ids:: "+windowID);
			
			if(!windowID.equals(parentWindowId)) {
				System.out.println("---------------");
				driver.switchTo().window(windowID);
				String getTitle=driver.getTitle();
				System.out.println("Title----: "+getTitle);
				System.out.println("URL----: "+driver.getCurrentUrl());
				Thread.sleep(5000);
				driver.close();
			}
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~`");
		driver.switchTo().window(parentWindowId);
		String getParentTitle=driver.getTitle();
		System.out.println(getParentTitle);
	}

}
