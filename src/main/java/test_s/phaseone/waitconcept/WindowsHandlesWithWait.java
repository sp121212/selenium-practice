package test_s.phaseone.waitconcept;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHandlesWithWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentID=driver.getWindowHandle();
		System.out.println(parentID);

		By linkedInLoc=By.xpath("//a[contains(@href,'linkedin')]");
		driver.findElement(linkedInLoc).click();

		Set<String>  winHandles   =driver.getWindowHandles();
		for(String winHandle:winHandles) {
			System.out.println(winHandle);
			if(!winHandle.equals(parentID)) {
				driver.switchTo().window(winHandle);
				String url=	driver.getCurrentUrl();
				System.out.println(url);
				Thread.sleep(2000);
				WebDriverWait  wait=new WebDriverWait(driver, Duration.ofSeconds(15));

				boolean flag=wait.until(ExpectedConditions.numberOfWindowsToBe(2));
				if(flag) {
					driver.getTitle();
					Thread.sleep(5000);
					driver.close();
				}
			}

		}
		driver.switchTo().window(parentID);

	}

}
