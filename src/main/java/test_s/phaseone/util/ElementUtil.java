package test_s.phaseone.util;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver=null;

	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getElements(By locator) {
		return driver.findElement(locator);
	}

	public void doSendkeys(By locator,String values) {
		getElements(locator).sendKeys(values);
	}
	
	public void doClick(By locator) {
		getElements(locator).click();
	}
	

	public void search(String searchText,By searchLocator,By searchOutput,String targetSearch) throws InterruptedException {
		doSendkeys(searchLocator, searchText);

		Thread.sleep(2000);

		List<WebElement>  listElement= driver.findElements(searchOutput);
		System.out.println(listElement.size());

		for(WebElement element:listElement) {
			String text=element.getText();
			System.out.println(text);
			if(text.contains(targetSearch)){
				element.click();
				break;
			}
		}
	}
	
	
	/******************************* WAIT UTILS *****************/
	public WebElement waitforPresenceofElement(By locator) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement elementWithWait=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return elementWithWait;
	}
	
	public WebElement waitVisibilityofElement(By locator) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement elementWithWait=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return elementWithWait;
	}
	
	public List<WebElement> waitVisibilityofAllElement(By locator) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		List<WebElement> elementWithWait=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		return elementWithWait;
	}
	
	public List<WebElement> waitPresenceofAllElement(By locator) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		List<WebElement> elementWithWait=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		return elementWithWait;
	}
	
	public void doClickWithWait(By locator) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement elementWithWait=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		elementWithWait.click();
	}
	
	public void doSendKeysWithWait(By locator,String input) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement elementWithWait=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		elementWithWait.sendKeys(input);
	}
	
	
}
