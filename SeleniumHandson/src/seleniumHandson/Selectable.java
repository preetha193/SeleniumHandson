package seleniumHandson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		// why we select xpath, because we are selecting multiple elements so we go for list.
		//if we give just *[@id=\'selectable\'] as xpath, then it will consider only one item [ol tag] orderedlist tag so we need to give
		// //*[@id=\'selectable\']/li
		List<WebElement> Selectable=driver.findElements(
				By.xpath("//*[@id=\'selectable\']/li"));
		int size=Selectable.size();
		System.out.println("The size of the list is: "+size);
		//task: to select 1-3 items in the list
		 
		//step1: we are pressing control in the keyboard to select
		/*Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(Selectable.get(0)).
		click(Selectable.get(1)).click(Selectable.get(2)).build().perform(); */
		
		//Otherway to select items easy method
		Actions actions=new Actions(driver);
		actions.clickAndHold(Selectable.get(1)).build().perform();;
		actions.clickAndHold(Selectable.get(5)).build().perform();;
		actions.clickAndHold(Selectable.get(6)).build().perform();;
		//actions.build().perform();
		
		
		
		
		
		
		

	}

}
