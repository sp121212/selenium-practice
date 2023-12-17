package test_s.phaseone.actionsclassconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BigbasketMenus {

	public static  WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		By shopByCategoryMenuLoc=By.xpath("(//button/div/span[text()='Shop by']) [2]");
		WebElement ShopByCategoryEle=driver.findElement(shopByCategoryMenuLoc);
		ShopByCategoryEle.click();
		
		Thread.sleep(2000);
		System.out.println("TEST");
		
		List<WebElement> listOfMenus=driver.findElements(By.cssSelector("li[class='jsx-1259984711']"));
		
		for(WebElement ele:listOfMenus) {
			
			String text=ele.getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
//		By menuLoc=By.linkText("Foodgrains, Oil & Masala");
//		By subMenuLoc=By.linkText("Rice & Rice Products");
//		By subSubMenuLoc=By.linkText("Basmati Rice");
//		
//		moveandClickonsubSubMenu(menuLoc,subMenuLoc,subSubMenuLoc);
	
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

	public static void moveandClickonsubSubMenu(By menuLoc,By subMenuLoc,By subSubMenuLoc) {
		Actions actions=new Actions(driver);
		
		WebElement menu=driver.findElement(menuLoc);
		actions.moveToElement(menu).pause(500).perform();
		
		WebElement subMenu=driver.findElement(subMenuLoc);
		actions.moveToElement(subMenu).pause(500).perform();
		
		WebElement subSubMenu=driver.findElement(subSubMenuLoc);
		actions.moveToElement(subSubMenu).pause(500).perform();
		
		subSubMenu.click();
	}
	
	


}
