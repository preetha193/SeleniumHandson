package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
//import org.testng.annotations.Test;

public class Firstclass {
//@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.close();

	}

}
