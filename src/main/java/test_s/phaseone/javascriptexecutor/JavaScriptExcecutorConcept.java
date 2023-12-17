package test_s.phaseone.javascriptexecutor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcecutorConcept {

	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		JavascriptExecutor jsExeutor = (JavascriptExecutor) driver;

		/*
		 * //get title String title1=driver.getTitle(); System.out.println(title1);
		 * 
		 * String title=jsExeutor.executeScript("return document.title").toString();
		 * System.out.println(title);
		 * 
		 * 
		 * //get url String url=driver.getCurrentUrl(); System.out.println(url);
		 * 
		 * String
		 * getUrlJs=jsExeutor.executeScript("return document.baseURI").toString();
		 * System.out.println(getUrlJs);
		 */

		/***
		 * Alert handing in JS
		 */

		/*
		 * System.out.println("--  Alert Handles using JS--------"); //alert
		 * jsExeutor.executeScript("alert('hey world')");
		 * 
		 * Thread.sleep(3000); driver.switchTo().alert().accept();
		 * System.out.println("alert-- accepted");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * jsExeutor.executeScript("confirm('Are you want to stop this service?')");
		 * Thread.sleep(3000); driver.switchTo().alert().dismiss();
		 * System.out.println("confirm --- dismissed");
		 * 
		 * 
		 * jsExeutor.executeScript("prompt('Enter user-name')"); Thread.sleep(3000);
		 * Alert alert=driver.switchTo().alert(); Thread.sleep(3000);
		 * alert.sendKeys("santanu"); Thread.sleep(3000); alert.accept();
		 * System.out.println("prompt --- name entered");
		 */

		/***
		 * 
		 * history
		 * 
		 */

//		driver.findElement(By.xpath("//a[contains(@href,'signup')]")).click();
//		
//		jsExeutor.executeScript("history.go(0)");  //refresh
//		
//		Thread.sleep(5000);
//		
//		jsExeutor.executeScript("history.go(-1)");  //back
//		
//		Thread.sleep(5000);
//		
//		jsExeutor.executeScript("history.go(1)");  //forword

		/**
		 * get all data from a HTML DOM in string format.
		 * 
		 **/
//		String text=jsExeutor.executeScript("return document.documentElement.innerText").toString();
//		System.out.println(text);

		/***
		 * 
		 * Scrolling using JS
		 * 
		 */

		/*
		 * //driver.get("https://www.amazon.in/"); //top to buttom Thread.sleep(2000);
		 * jsExeutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 * 
		 * //buttom to top Thread.sleep(2000);
		 * jsExeutor.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		 * 
		 * 
		 * //middle of the page Thread.sleep(2000);
		 * jsExeutor.executeScript("window.scrollTo(0,document.body.scrollHeight/2)");
		 * 
		 * 
		 * //partial scrolling Thread.sleep(2000);
		 * jsExeutor.executeScript("window.scrollTo(0,500)");
		 * 
		 * Thread.sleep(1000); jsExeutor.executeScript("window.scrollTo(500,0)");
		 * 
		 * Thread.sleep(5000);
		 * 
		 * 
		 * //scroll up to a particulat element WebElement
		 * element=driver.findElement(By.xpath("//div[text()='Connect with Us']"));
		 * jsExeutor.executeScript("arguments[0].scrollIntoView(true)",element);
		 */

		/***
		 * 
		 * Zoom in and out
		 * 
		 * document.body.style.zoom="200%"
		 */

//		jsExeutor.executeScript("document.body.style.zoom=\"200%\"");
//
//		Thread.sleep(3000);
//		jsExeutor.executeScript("document.body.style.zoom=\"80%\"");

		/***
		 * 
		 * Draw border
		 * 
		 *//*
			 * WebElement eleUserName=driver.findElement(By.cssSelector("#username"));
			 * 
			 * jsExeutor.executeScript("arguments[0].style.border='3px solid red'",
			 * eleUserName);
			 */
		
		
		/***
		 * Flash
		 * 
		 */
		/*
		 * WebElement loginEle=driver.findElement(By.cssSelector("#username")); String
		 * bgColor=loginEle.getCssValue("background-color"); String
		 * bgColor1="rgb(155,200,100)";
		 * 
		 * for(int i=0;i<=10;i++) { Thread.sleep(500);
		 * jsExeutor.executeScript("arguments[0].style.backgroundColor='"+bgColor1+"'",
		 * loginEle); System.out.println("---"); Thread.sleep(500);
		 * jsExeutor.executeScript("arguments[0].style.backgroundColor='"+bgColor+"'",
		 * loginEle); }
		 */
		
		
		//do sendkeys
		jsExeutor.executeScript("document.getElementById('username').value='test@cl.com'");
		
		Thread.sleep(2000);
		
		jsExeutor.executeScript("document.getElementById('password').value='pwd.com'");
		
		Thread.sleep(2000);
		//do click
		WebElement eleButton=driver.findElement(By.cssSelector("#loginBtn"));
		
		jsExeutor.executeScript("arguments[0].click()",eleButton);
		
		
		
	}
	
	
	
}
