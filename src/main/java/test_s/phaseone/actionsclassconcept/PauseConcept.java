package test_s.phaseone.actionsclassconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PauseConcept {

	public static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.cssSelector("#input-firstname"));
		
		String firstName="Santanu";
		
		char[] name=firstName.toCharArray();
		
		for(char c:name) {
			
			act.sendKeys(element,String.valueOf(c))
				.pause(1000).build().perform();
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}