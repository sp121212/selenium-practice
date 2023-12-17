package test_s.phaseone.xpathconcept.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolHtmlTables {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		int noRecords=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		for(int i=2;i<=noRecords;i++) {
			String compName=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(compName);
			
			String compHeader=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/preceding-sibling::tr/child::th[1]")).getText();
		
			System.out.println(compHeader+" :: "+ compName);
		}
		
		System.out.println("ALL data exported!");
		Thread.sleep(7000);
		driver.quit();
	}

}
