package test_s.phaseone.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcepts {

	/**
	 * 
	 * To get multiple pages
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://amazon.com");
		
//	    List<WebElement> allLinks=driver.findElements(By.tagName("a"));
//	    System.out.println("size: "+ allLinks.size());
//	    for(WebElement link:allLinks) {
//	    	if(link.getText().length()!=0) {
//	    	System.out.println(link.getText() + " :: "+link.getAttribute("href"));
//	    	}
//	    }
	    
		 List<WebElement> allImages=driver.findElements(By.tagName("img"));
		    System.out.println("size: "+ allImages.size());
		  
//		    for(WebElement image:allImages) {
//		    	if(image.getAttribute("alt").length()!=0) {
//		    	System.out.println(image.getAttribute("alt") + " :: "+image.getAttribute("src"));
//		    	}
//		    }
		    
		    
		    for(int i=0;i< allImages.size();i++) {
		    	WebElement element=allImages.get(i);
		    	String src=element.getAttribute("src");
		    	String alt=element.getAttribute("alt");
		    	if(alt.length()!=0) {
		    		System.out.println(alt+" ::::  "+src);
		    		System.out.println("\n --- \n");
		    	}
		    }
		
	}
	
}
