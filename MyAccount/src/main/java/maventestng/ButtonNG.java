package maventestng;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ButtonNG {
		WebDriver driver;
		@BeforeSuite
		public void launchBrowser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
			//launch the web browser
			driver=new ChromeDriver();

		}

		@AfterSuite
		public void closebrowser()
		{
			driver.quit();

		}
		@Test
		public void buttonexample()
		{
			try
			{

				driver.get("http://www.leafground.com/pages/Button.html");
				//click on the button
				driver.findElement(By.xpath("//*[@id=\'home\']")).click();
				//to navigate to the prev page
				driver.navigate().back();

				WebElement Buttonposition=driver.findElement(By.id("position"));
				//to get the position we use Point class

				Point xypoint=Buttonposition.getLocation();
				int x=xypoint.getX();
				int y=xypoint.getY();
				System.out.println("X value: " + x + "Y value: " +y); 

				//to get the color of the button
				// to get the color, we are using css property
				WebElement ButtonColor= driver.findElement(By.id("color"));
				String color=ButtonColor.getCssValue("background-color");
				System.out.println(color);

			}
			catch(Exception e)

			{
				e.printStackTrace();
			}
		}



	}


