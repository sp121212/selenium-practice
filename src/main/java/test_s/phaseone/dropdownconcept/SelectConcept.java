package test_s.phaseone.dropdownconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectConcept {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		By countryCssSelector=By.cssSelector("select[name='Country'][class='dropdown']");
		WebElement elementCountry=driver.findElement(countryCssSelector);
		
		Select select=new Select(elementCountry);
		
//		select.selectByIndex(5);
//		select.selectByValue("Belgium");
//		select.selectByVisibleText("India");
		
//		List<WebElement> countriesOptions=select.getOptions();
//		System.out.println(countriesOptions.size());
//		
//		
//		for(WebElement countryElement:countriesOptions) {
//			String countryText=countryElement.getText();
//			System.out.println(countryText);
//			if(countryText.equals("India")) {
//				countryElement.click();
//				break;
//			}
//		}
		
	

	}
}
