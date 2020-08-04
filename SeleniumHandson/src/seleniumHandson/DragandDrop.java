package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		WebElement From=driver.findElement(By.id("draggable"));
		WebElement To=driver.findElement(By.id("droppable"));
		//for drag and drop, we need to use "Actions" class and create an object for it
		Actions actions=new Actions(driver);
		actions.dragAndDrop(From, To).build().perform(); // we have to use build and perform otherwise no actions takes place
		driver.close();
		System.out.println("Drag and drop successful");
		
		

	}

}
