package test_s.phaseone.actionsclassconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {


	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		driver.get("https://jqueryui.com/resources/demos/slider/default.html");

		WebElement eleSlider=driver.findElement(By.cssSelector(".ui-slider-handle.ui-corner-all.ui-state-default"));

		Actions act=new Actions(driver);

		act.clickAndHold(eleSlider).moveByOffset(0, 0)
		.release().build().perform();


	}

}
