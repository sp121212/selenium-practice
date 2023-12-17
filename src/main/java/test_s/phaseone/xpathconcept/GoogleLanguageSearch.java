package test_s.phaseone.xpathconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageSearch {

	public static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();

		driver.get("https://google.com");

		List<WebElement> allLanguages=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));

		for(WebElement lang:allLanguages) {
			System.out.println(lang.getText());
//			if(lang.getText().equals("मराठी")) {
//				lang.click();
//				break;
//			}
		}

		driver.quit();
	}

}
