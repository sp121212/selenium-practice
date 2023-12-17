package test_s.phaseone.basics;

import org.openqa.selenium.WebDriver;

import test_s.phaseone.util.BrowserUtil;

public class WebDriverConcept {

	public static WebDriver driver=null;
	
	public static void main(String[] args) {
		BrowserUtil browser=new BrowserUtil();
		driver=browser.launchBrowser("chrome");
		
		browser.launchApplication("https://google.com");
		
		String getTitle=browser.getPageTitle();
		System.out.println(getTitle);
		
		String getUrl=  browser.getPageUrl();
		System.out.println(getUrl);
		
		browser.closeBrowser();
		
		browser.quitBrowser();
		
	
	}
	
}
