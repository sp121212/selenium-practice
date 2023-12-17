package test_s.phaseone.actionsclassconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Signatures {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver  driver=new ChromeDriver();
		driver.get("https://signature-generator.com/draw-signature/");
		Thread.sleep(4000);
		Actions act=new Actions(driver);
		
		WebElement ele=driver.findElement(By.id("signature-pad"));
		
		
		act.click(ele)
			.moveToElement(ele, 10, 30)
			.clickAndHold(ele)
			.moveByOffset(20, -45)
			.moveByOffset(10, 110)
			.moveByOffset(25,-100)
			.moveByOffset(2,2)
			.release(ele)
			.build().perform();
		
		System.out.println("DONE");
	}

}
