package test_s.phaseone.actionsclassconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeysConcept {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		Actions actions=new Actions(driver);

		String name="santanu";
		By userNameLoc=By.cssSelector("input[type='submit'].btn.btn-primary ");
		WebElement userNameEle=driver.findElement(userNameLoc);
		actions.sendKeys(userNameEle,"santanu").build().perform();
	

	}
}
