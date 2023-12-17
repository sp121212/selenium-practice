package test_s.phaseone.basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageDimensionConcept {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		
		
//		Dimension dim=new Dimension(500, 700);
//		driver.manage().window().setSize(dim);
		
		
//		driver.manage().window().fullscreen();
	
		driver.get("https://google.com");
		
		
	
	}

}
