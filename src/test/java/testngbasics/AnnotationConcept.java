package testngbasics;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationConcept {
	
	
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS ---  Connection with DB");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT ---  Create user");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC --- launch browser");
	}
	
	
	@BeforeMethod
	public void loginApp() {
		System.out.println("BM ---  Login the application");
	}
	
	@Test
	public void searchItems() {
		System.out.println("Test - Search Item from cart");
	}
	
	@Test
	public void addToCart() {
		System.out.println("Test - Add to cart");
	}
	
	@Test
	public void checkOut() {
		System.out.println("Test - check out");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("AM Loggedout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC Close browser");
	}
	
	@AfterSuite
	public void closeDB() {
		System.out.println("AS close DB");
	}
	

	
	public void closeDB1() {
		System.out.println("AS close DB1");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT Delete user");
	}
}
