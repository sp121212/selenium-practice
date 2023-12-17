package test_s.phaseone.actionsclassconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSendKeys {
	
	public static WebDriver driver=null;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		Actions actions=new Actions(driver);
		
		By userNameLoc=By.cssSelector("#input-email");
		WebElement userNameEle=driver.findElement(userNameLoc);
		actions.sendKeys(userNameEle,"santanu").build().perform();
		
		By passwordLoc=By.cssSelector("#input-password");
		WebElement passwordEle=driver.findElement(passwordLoc);
		actions.sendKeys(passwordEle,"santanu@123").build().perform();
		
		By loginLoc=By.cssSelector("input[value='Login']");
		WebElement loginEle=driver.findElement(loginLoc);
		actions.click(loginEle).build().perform();
		
		


	}

}
