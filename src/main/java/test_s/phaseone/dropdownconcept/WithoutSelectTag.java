package test_s.phaseone.dropdownconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelectTag {

	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectmenu/");
		Thread.sleep(5000);

		WebElement frameElement=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frameElement);



		//Select A Speed
		By clickOnSelectASpeedOption=By.xpath("//span[@id='speed-button']/span[1]");
		By getAllselctASpeedOptions=By.cssSelector("#speed-menu li[class='ui-menu-item']");
		selectDropdownValues(clickOnSelectASpeedOption,getAllselctASpeedOptions,"Faster");
		
		Thread.sleep(2000);
		//Select a file
		By clickOnSelectAFileDD=By.xpath("//span[text()='jQuery.js']");
		By getAllSelectFileOptions=By.xpath("//div[@class='ui-selectmenu-menu ui-front ui-selectmenu-open']/ul/li/div");
		selectDropdownValues(clickOnSelectAFileDD,getAllSelectFileOptions,"Some unknown file");
		
		Thread.sleep(2000);
		//Select a number
		By clickOnSelectANumber=By.cssSelector("#number-button");
		By getAllSelectNumberOptions=By.cssSelector("ul[aria-labelledby='number-button'] li[class='ui-menu-item']");
		selectDropdownValues(clickOnSelectANumber,getAllSelectNumberOptions,"10");
	
		
		Thread.sleep(2000);
		//Select a title
		By clickOnSelectTitle=By.xpath("//span[text()='Please pick one']");
		By getAllSelectTitleOptions=By.cssSelector("ul[aria-labelledby='salutation-button'] li[class='ui-menu-item']");
		selectDropdownValues(clickOnSelectTitle,getAllSelectTitleOptions,"Prof.");


	}


	public static void selectDropdownValues(By clickOnSelectLocator,By getAllOptionsLocator,String selectOption) {

		WebElement element=driver.findElement(clickOnSelectLocator);
		element.click();

		List<WebElement> options=driver.findElements(getAllOptionsLocator);

		System.out.println(options.size());

		for(WebElement option:options) {
			String text=option.getText();
			System.out.println(text);
			if(text.equals(selectOption)) {
				option.click();
				break;
			}

		}
	}


}
