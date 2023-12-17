package test_s.phaseone.svgelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElementConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("https://petdiseasealerts.org/forecast-map");

		WebElement ele=driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));

		Thread.sleep(3000);


		driver.switchTo().frame(ele);

		String svgXPath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']";


		List<WebElement> stateLists=
				driver.findElements(By.xpath(svgXPath));

		System.out.println("#of states in USA: "+stateLists.size());

		Actions act=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].scrollIntoView(true)",eleState);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight/2)");
		
		for(WebElement eleState:stateLists) {
			act.moveToElement(eleState).perform();
			
			String getStateName=eleState.getAttribute("id");
			System.out.println(getStateName);
			Thread.sleep(1000);
			if("TEXAS".equalsIgnoreCase(getStateName)) {
				eleState.click();
				break;
			}

		}
	}

}
