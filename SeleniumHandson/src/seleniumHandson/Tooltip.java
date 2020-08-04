package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		// get the id of the text box
		 WebElement name=driver.findElement(By.id("age"));
		 //title is displayed along with the input id "age" so we get the title and store it in tooltip string variable.
		 String Tooltip=name.getAttribute("title");
		 System.out.println("The tool tip is: "+Tooltip);
		 driver.close();
		 
		
		

	}

}
