package seleniumHandson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		WebElement input=driver.findElement(By.id("tags"));
		input.sendKeys("s");
		Thread.sleep(5000);
		// after giving the input "s" we have to list all the elements available to select, so we 
		// list all the elements and store it in List <Web Elements>
		List <WebElement> inputlist=driver.findElements(By.xpath("//*[@id=\"tags\"]/li"));
		
		//now once it is listed, we have to match the input with available list say
		// we give "s" and it auto selects "Webservices" which contains "s"
		
		//in order to list the elements we go for for each loop
		// this is the logic but due to some mistakes, it is not displaying or selecting selenium, need to refer other examples
		for (WebElement webElement : inputlist) {
			if(webElement.getText().equals("Selenium"))
				webElement.click();
			System.out.println("The current selected element is : "+webElement);
			break;
		}
		driver.close();
		
				
		

	}

}
