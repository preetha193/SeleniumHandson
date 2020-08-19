package seleniumHandson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/sortable.html");
		// we are getting the entire list of elements in a list and have "/li"
		
		List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		
		// we are replacing the item1 with item 7
		
		WebElement fromelement=elements.get(4); //[0 to 6]
		WebElement toelement=elements.get(0);
		// dragging item7 to item 1 so its keyboard activity so we need actions class
		Actions actions=new Actions(driver);
		actions.clickAndHold(fromelement);
		// we are clicking and holding the fromelement i.e item 7 in web page and 
		//moving to first element item 1
		actions.moveToElement(toelement);
		//we are releasing the control in first element.
		actions.release(toelement);
		actions.build().perform();
		
		
		
	}

}
