package test_s.phaseone.windowshandleconcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		//Driver setup
		WebDriver driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("open organge hrm web page.");
		Thread.sleep(5000);

		String parentWindowId=driver.getWindowHandle();
		System.out.println("Parent Window ID: "+parentWindowId);

		//click on twitter link,
		WebElement eleTwitter=driver.findElement(By.cssSelector("a[href*='twitter']"));
		eleTwitter.click();
		System.out.println("click on twitter");
		Thread.sleep(2000);
		
		
		//click on linkedin link,
		WebElement eleLinkedIn=driver.findElement(By.cssSelector("a[href*='linkedin']"));
		eleLinkedIn.click();
		System.out.println("click on Linkedin");
		Thread.sleep(2000);
		
		//click on youtube link,
		WebElement eleYoutube=driver.findElement(By.cssSelector("a[href*='youtube']"));
		eleYoutube.click();
		System.out.println("click on youtube");
		Thread.sleep(2000);
		
		
		//click on facebook link,
		WebElement eleFacebook=driver.findElement(By.cssSelector("a[href*='facebook']"));
		eleFacebook.click();
		System.out.println("click on facebook");
		Thread.sleep(2000);

		Set<String> windowHandles =driver.getWindowHandles();
		Iterator<String>  itr =windowHandles.iterator();

		while(itr.hasNext()) {
			String windowID=itr.next();
			System.out.println("window id:: "+windowID);

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
