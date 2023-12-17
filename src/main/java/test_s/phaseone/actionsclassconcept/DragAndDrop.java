package test_s.phaseone.actionsclassconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {


	public static WebDriver driver=null;
	
	
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		By dragTextLoc=By.cssSelector("div[id='draggable']");
		By dropTextLoc=By.cssSelector("div[id='droppable']");
		
		WebElement dragElement=driver.findElement(dragTextLoc);
		WebElement dropElement=driver.findElement(dropTextLoc);
		Actions acts=new Actions(driver);
		
//		acts.clickAndHold(dragElement)
//				.pause(500).moveToElement(dragElement)
//					.release(dropElement)
//						.build().perform();
		
		
		
		acts.dragAndDrop(dragElement, dropElement).pause(2000).perform();
		
		
		
	}
	
}
