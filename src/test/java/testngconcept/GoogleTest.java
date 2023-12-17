package testngconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	
	@Test
	public void getURLTest() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.co.in/");
	}
	
	@Test
	public void getTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Google");
	}
}