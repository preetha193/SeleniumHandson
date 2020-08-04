package seleniumHandson;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/");
		WebElement Windows=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[11]/a/h5"));
		Windows.click();
		String parentwindow=driver.getCurrentUrl();
		//to get the control on the parent window we use windowhandle method
		String oldWindow=driver.getWindowHandle(); // since its return type is string we store it in string.
		System.out.println("The current window is: "+parentwindow);
		//task 1 click button to open home page. so it opens the home page where it contains all the elements say edit, textbox, alert
		WebElement homepagebutton=driver.findElement(By.id("home"));
		homepagebutton.click();
		// once we click that homepagebutton, it takes to the child window so we need to move the control to the next window
		Set<String> handles= driver.getWindowHandles(); //since its return type is string set we store it in the same
		//handles will have both new and old wnd so we store it in set
		// in order to move the control to new wnd we use for each, for first iteration the window will be in "New Window"
		for (String NewWindow : handles) {
			driver.switchTo().window(NewWindow); // now the control will be in new window
		}

		WebElement EditBox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5"));
		EditBox.click();
		Thread.sleep(5000);
		driver.close(); // it closes only new window
		//once the new window is closed, we need to bring the control to the old window
		driver.switchTo().window(oldWindow);
		//task 2 open multiple windows and count it

		WebElement multiplewindows=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multiplewindows.click(); // it opens two windows now so we need to display the no. of opened windows

		//to count the opened windows we use getwindowHandles
		int noofOpenWindows=driver.getWindowHandles().size();
		System.out.println("The no. of open windows: "+noofOpenWindows);

		

		
		//task 3, close all child windows and leave the parent

		WebElement donotcloseparent=driver.findElement(By.id("color"));
		donotcloseparent.click(); //it opens two child windows and now we close only those child windows
		//now the child windows are open and we have to close that and retain the parent window
		Set <String> childwindows =driver.getWindowHandles(); // getwindowhandles stores all windows
		for (String allchildwindows : childwindows) {// from the above set, it stores all the windows in childwindows string
			if(!allchildwindows.equals(oldWindow))	{//now it iterates and checks if the window is not parent, then close.
				driver.switchTo().window(allchildwindows);
				driver.close();
			}
		}

		/*explanation of for each loop
		 * 1. once getwindowhandles stores all windows in childwindows variable
		 * we define a new string in for each loop and store it in "allchildwindows" variable
		 * then allchildwindows is compared with the oldwindow variable and it checks whether it is the parent window, if not it closes.
		 * 
		 * 
		 */
	







}

}
