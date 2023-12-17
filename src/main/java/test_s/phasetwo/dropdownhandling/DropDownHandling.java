package test_s.phasetwo.dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		WebElement eleCountry=driver.findElement(By.xpath("//select[@name='Country']"));

		Select  select=new Select(eleCountry);

		//		select.selectByIndex(10);
		//		select.selectByValue("Afghanistan");
		//		select.selectByVisibleText("Afghanistan");


		List<WebElement>  countryList=	select.getOptions();
//		System.out.println(countryList);
		for(WebElement ele:countryList) {
			String countryName=ele.getText();
			System.out.println(countryName);
			if(countryName.equals("Afghanistan")) {
				ele.click();
				System.out.println("Clicked on the selected country");
				break;
			}
		}

	}

}
