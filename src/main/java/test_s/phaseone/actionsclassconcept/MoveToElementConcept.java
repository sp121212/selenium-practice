package test_s.phaseone.actionsclassconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
/**
 * Actions class is used to perform the user's action. --> Mouse + Key Board
 */
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("http://mrbool.com/search/");
		
		Thread.sleep(2000);
		
		By contentLinkLoc=By.cssSelector("a[class='menulink']");
		By coursesLinkLoc=By.linkText("COURSES");
		parentChildMenu(contentLinkLoc,coursesLinkLoc);
	}
	
	
	public static void parentChildMenu(By parentMenuLoc,By childMenuLoc ) {
		
		Actions actions=new Actions(driver);
		WebElement ContentLinkElement=driver.findElement(parentMenuLoc);
		actions.moveToElement(ContentLinkElement).build().perform();
		
		driver.findElement(childMenuLoc).click();
		
	}
	
}
