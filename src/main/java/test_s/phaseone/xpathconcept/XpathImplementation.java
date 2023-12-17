package test_s.phaseone.xpathconcept;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathImplementation {
	public static WebDriver driver=null;
	public static void main(String[] args) {

		driver=new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		String name="Garry.White";
		clickCheckBox(name);
		List<String> userdetails=  getUserDetails(name);
		System.out.println(userdetails);
	}


	public static void clickCheckBox(String name) {
		By xpathCheckBox=By.xpath("//a[text()='"+name+"']/parent::td/preceding-sibling::td/input[@type='checkbox']");
		driver.findElement(xpathCheckBox).click();
	}


	public static List<String> getUserDetails(String name) {
		//getUserDetails
		By xpathUserDetail=By.xpath("//a[text()='"+name+"']/parent::td/following-sibling::td");
		List<WebElement> userDetails  =driver.findElements(xpathUserDetail);
		List<String> userDetail=new ArrayList<String>();
		for(WebElement user:userDetails) {
			userDetail.add(user.getText());
		}
		return userDetail;
	}
}
