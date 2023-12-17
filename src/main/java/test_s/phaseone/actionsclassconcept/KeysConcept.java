package test_s.phaseone.actionsclassconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysConcept {

	
	public static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions action=new Actions(driver);
		
		
		WebElement firstNameEle=driver.findElement(By.cssSelector("#input-firstname"));
		WebElement lastNameEle=driver.findElement(By.cssSelector("#input-lastname"));
		WebElement emailEle=driver.findElement(By.cssSelector("#input-email"));
		action.sendKeys(firstNameEle,"Test")
			.sendKeys(Keys.TAB)
				.sendKeys(lastNameEle,"1233")
					.sendKeys(Keys.TAB)
						.sendKeys(emailEle,"test@gmail.com")
						 	.sendKeys(Keys.TAB)
				.build().perform();
		
		
		
		
	}
}
