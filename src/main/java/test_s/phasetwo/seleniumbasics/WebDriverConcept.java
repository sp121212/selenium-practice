package test_s.phasetwo.seleniumbasics;

import java.util.Set;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverConcept {

	public static void main(String[] args) {

		//ChromeDriver driver=new ChromeDriver();      //VALID BUT NOT RECOMEND
		//ChromiumDriver driver=new ChromeDriver();    //VALID BUT NOT RECOMEND
		//ChromiumDriver driver=new EdgeDriver();      //VALID BUT NOT RECOMEND
		//ChromiumDriver driver=new FirefoxDriver();   //INVALID
		//SearchContext driver=new  ChromeDriver();    // INVALID
		//RemoteWebDriver driver=new ChromeDriver(); //VALID AND REMOMENDED 
		WebDriver driver=new ChromeDriver();  //VALID AND RECOMENDED
		driver.get("https://www.google.com/");

//		driver.close(); //Invalid Session ID No such session exception Command: [0e601281e14c17c86ff886e2da00e79b, get {url=https://www.google.com/}]
//		driver.quit();  // Session ID is null  						   Command: [null, get {url=https://www.google.com/}]
		
//		driver.get("https://www.google.com/");
		
		
//		String pageSource=driver.getPageSource();
//		System.out.println(pageSource);
		
		String ParentWindow=driver.getWindowHandle();
		System.out.println(ParentWindow);
		
		Set<String> winHandles=  driver.getWindowHandles();
		System.out.println(winHandles);
		
		driver.get("");
		driver.navigate();
	}

}
