package test_s.phaseone.actionsclassconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Right Click= ContextClick
 * @author CEPL
 *
 */
public class ContextClickConcept {

	public static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions actions=new Actions(driver);
		
		By RightClickloc=By.xpath("//span[text()='right click me']");
		WebElement rightClickEle=driver.findElement(RightClickloc);
		
		actions.contextClick(rightClickEle).perform();
		
		selectActions("Quit");
	}
	
	public static void selectActions(String actionPerformed) throws InterruptedException {
		By optionsLoc=By.cssSelector("li.context-menu-icon > span");
		List<WebElement> optionsEle=driver.findElements(optionsLoc);
		
		
		Thread.sleep(2000);
		
		for(WebElement optionEle:optionsEle) {
			 String optionsText=optionEle.getText();
			System.out.println(optionsText);
			if(optionsText.equalsIgnoreCase(actionPerformed)) {
				optionEle.click();
				break;
			}
			
		}
	}
	
}
