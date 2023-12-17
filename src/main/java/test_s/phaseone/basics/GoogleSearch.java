package test_s.phaseone.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test_s.phaseone.util.BrowserUtil;
import test_s.phaseone.util.ElementUtil;

public class GoogleSearch {
	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {

		BrowserUtil browser=new BrowserUtil();
		driver=browser.launchBrowser("chrome");
		ElementUtil eleUtil=new ElementUtil(driver);
		browser.launchApplication("https://google.com");
		By seachField= By.className("gLFyf");
		By searchOutPut=By.className("wM6W7d");
		eleUtil.search("selenium automation",seachField,searchOutPut,"framework");
	}


	
}
