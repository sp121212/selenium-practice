package test_s.phaseone.actionsclassconcept;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionScrolling {
	
	
	public static WebDriver driver=null;;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("https://app.cloudlex.net/#/main/launcher");
		
		Thread.sleep(8000);
		
		Actions act=new Actions(driver);
		
		// refresh a page
		System.out.println("start");

		act.keyDown(Keys.CONTROL).sendKeys(Keys.chord("R")).keyUp(Keys.CONTROL).build().perform();
		
		System.out.println("done");
		
		// slightly down
		/*
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.PAGE_UP).perform();
		
		Thread.sleep(2000);

		act.sendKeys(Keys.PAGE_UP).perform();
		
		Thread.sleep(2000); */
		
		
		// Full scroll
//		act.keyDown(Keys.CONTROL).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyUp(Keys.CONTROL);;
//		Thread.sleep(2000);
//		
//		
//		act.keyDown(Keys.CONTROL).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).keyUp(Keys.CONTROL);;
//		Thread.sleep(2000);
		
//		act.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_UP).keyUp(Keys.CONTROL);
		
		
	
		
	}

}
