package testngbasics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAttributes {
	
	public static WebDriver driver=null;
	
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/");
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}
	
	
	@Test(enabled = true, invocationCount = 10)
	public void logoVisibilityTest() {
		boolean flag=driver.findElement(By.xpath("//img[@alt='naveenopencart']")).isDisplayed();
		Assert.assertEquals(flag, true);
	
	}
	
	@Test(expectedExceptions = {ArithmeticException.class})
	
	public void getTitleTest() {
		String title=driver.getTitle();
		Assert.assertEquals("Your Store", title, "Title testing");
		int a=10/1;
		System.out.println("A:  "+ a);
	}
	
	@Test(dependsOnMethods = {"getTitleTest"})
	public void getURLTest() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals("https://naveenautomationlabs.com/opencart/", url, "URL testing");
	}

}
