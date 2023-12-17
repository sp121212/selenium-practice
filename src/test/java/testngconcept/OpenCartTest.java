package testngconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{
	
	
	@Test
	public void getURLTest() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://naveenautomationlabs.com/opencart/");
	}
	
	@Test
	public void getTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Your Store");
	}
	

}
