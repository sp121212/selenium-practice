package test_s.phaseone.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	private WebDriver driver=null;

	public WebDriver launchBrowser(String browserName) {

		switch(browserName.toLowerCase()) {

		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		default	:
			throw new AppException("invalid browser name");
		}

		return driver;
	}

	
	public void launchApplication(String url) {
		if(url==null) {
			throw new AppException("url can't be null");
		}
		
		if(url.indexOf("http")!=0) {
			throw new AppException("url is not valid! Given url is: "+ url);
		}
		
		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
		System.out.println("browser is closed!");
	}
	
	public void quitBrowser() {
		driver.quit();
		System.out.println("browser is closed!");
	}
}
