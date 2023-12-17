package testngconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookTest extends BaseTest{

	
	@Test
	public void getURLTest() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/login/");
	}
	
	@Test
	public void getTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Log in to Facebook");
	}
}
