package test_s.phaseone.dropdownconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import test_s.phaseone.util.ElementUtil;

public class MultiSelection {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		By multiSelect=By.xpath("//select");
		WebElement elementSelect=driver.findElement(multiSelect);
		
		Select select=new Select(elementSelect);
		
		boolean isMul=select.isMultiple();
		System.out.println(isMul);
		
//		if(select.isMultiple()) {
//			select.selectByVisibleText("American flamingo");
//			select.selectByVisibleText("Greater flamingo");
//			select.selectByVisibleText("James's flamingo");
//			select.selectByVisibleText("Lesser flamingo");
//		}
		
		List<WebElement> options =select.getOptions();
		System.out.println("Option Size:"+ options.size());
		
		for(WebElement option:options) {
			Thread.sleep(500);
			option.click();
		}
		
		
		
		
		Thread.sleep(4000);
		select.deselectAll();
		
	}

}
