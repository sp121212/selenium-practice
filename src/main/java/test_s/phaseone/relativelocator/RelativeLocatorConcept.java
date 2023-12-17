package test_s.phaseone.relativelocator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RelativeLocatorConcept {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(5000);
		
		WebElement ele=driver.findElement(By.linkText("Langley, Canada"));
		
		
		//get right element
		WebElement rightEle=driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(ele));
		String textRIght=rightEle.getText();
		System.out.println(textRIght);
		
		//get left ele
		WebElement leftEle=driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(ele));
		System.out.println(leftEle.getText());
		
		
		//above
		WebElement aboveEle=driver.findElement(RelativeLocator.with(By.tagName("a")).above(ele));
		System.out.println(aboveEle.getText());
		
		//below
		WebElement belowEle=driver.findElement(RelativeLocator.with(By.tagName("a")).below(ele));
		System.out.println(belowEle.getText());
		
		
		//near
		WebElement eleNear=driver.findElement(RelativeLocator.with(By.tagName("a")).near(ele));
		System.out.println(eleNear.getText());
		
		System.out.println("------------------------------------");
		// Export all below cities
		List<WebElement> belowEles=driver.findElements(RelativeLocator.with(By.xpath("(//div[@id='most_pollutedCitiesRank']) [position()=1]/p")).below(ele));
		for(WebElement belowEl:belowEles) {
			System.out.println(belowEl.getText());
		}
		
		System.out.println(belowEle.getText());
		
		
		System.out.println("DONE");
		
	}
}
