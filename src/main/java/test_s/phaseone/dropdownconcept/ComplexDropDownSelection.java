package test_s.phaseone.dropdownconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComplexDropDownSelection {

	public static WebDriver driver=null;

	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");


		By clickOnDropDownMenu=By.cssSelector("input[id='justAnInputBox']");
		By getAllOptionsLoc=By.cssSelector("span[class='comboTreeItemTitle']");
//				selectMutipleOptions(clickOnDropDownMenu,getAllOptionsLoc,"choice 2","choice 5","choice 6 2 3");
		selectMutipleOptions(clickOnDropDownMenu,getAllOptionsLoc,"all");

	}


	public static void selectMutipleOptions(By clickonDropDownMenu,By getAllOptionsLoc,String... selectedOptions) {
		driver.findElement(clickonDropDownMenu).click();
		List<WebElement> getAllOptions=driver.findElements(getAllOptionsLoc);
		System.out.println("size: "+getAllOptions.size());


		if(selectedOptions[0].equalsIgnoreCase("all")) {
			for(WebElement option:getAllOptions) {
				if(option.getText().length()>1) {
				option.click();
				}
			}
			
		}else {
			for(WebElement option:getAllOptions) {

				String text=option.getText();
				System.out.println(text);

				for(String selectedOption:selectedOptions) {

					if(text.equals(selectedOption)) {
						option.click();
						break;
					}
				}
			}
		}
	}

}
