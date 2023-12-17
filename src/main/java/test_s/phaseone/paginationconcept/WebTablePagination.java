package test_s.phaseone.paginationconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablePagination {


	public static WebDriver driver=null;
	static WebDriverWait wait=null;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		            
		Thread.sleep(3000);
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementClickInterceptedException.class);
		// Click on the  checkbox if city is Denmark
		String countryName="Hong Kong";
		selectCountry(countryName);


	}


	public static void selectCountry(String countryName) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor) driver; 
		
		js.executeScript("document.body.style.zoom='60%'");
		
		By countryLocator=By.xpath("//table[@id='tablepress-1']//tr/td[@class='column-5' and text()='"+countryName+"']");
		By nextLocator=By.xpath("//a[text()='Next']");  //("//a[@class='paginate_button next']");
		
		By headerLoc=By.xpath("(//h2[contains(text(),'System Distribution Details')])[position()=2]");
		WebElement eleHeader=driver.findElement(headerLoc);
		js.executeScript("arguments[0].scrollIntoView(true)",eleHeader);
		
		By countryTableHeadLoc=By.xpath("//th[text()='Country']");
		WebElement countryTableHeadEle=driver.findElement(countryTableHeadLoc);
		js.executeScript("arguments[0].scrollIntoView(true)",countryTableHeadEle);
		
		
		WebElement locElement=wait.until(ExpectedConditions.visibilityOfElementLocated(nextLocator));
//		js.executeScript("arguments[0].scrollIntoView(true)",locElement);
		Actions  action=new Actions(driver);
		
		action.clickAndHold(locElement).sendKeys(Keys.ARROW_DOWN).build().perform();
		while(true) {

			if(driver.findElements(countryLocator).size()>0) {

				By checkBoxLoc=By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']");
				WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(checkBoxLoc));
				
				ele.click();
				
				break;
			}else {
				Thread.sleep(2000);
				WebElement locElement1=wait.until(ExpectedConditions.visibilityOfElementLocated(nextLocator));
//				locElement1.click();
				action.click(locElement1).build().perform();
			}

		}
	}
}
