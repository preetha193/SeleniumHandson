package seleniumHandson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/frame.html");
	
	//since we are working with frames, we need to switch the control to the frame.
	//task1
	driver.switchTo().frame(0);//since we dont know about the frame name or id, we give 0.
		WebElement button1= driver.findElement(By.id("Click"));
	button1.click();
	//once button clicked, new text is given. 
	String text=driver.findElement(By.id("Click")).getText();
	System.out.println("The text after button clicked is : "+text);
	
	//task2
	// to switch to the next upcoming frame, it started with 0 and for second frame it is 1
	driver.switchTo().defaultContent(); //in frames, we use default content to bring back to orignial window
	driver.switchTo().frame(1);
	driver.switchTo().frame("frame2"); // get the id of the frame from inspect element
	
	
	WebElement button2=driver.findElement(By.id("Click1"));
	button2.click();
	String text1=driver.findElement(By.id("Click1")).getText();
	System.out.println("The text after button2 clicked: "+text1);
	
	//task 3 count the frames
	
	driver.switchTo().defaultContent(); 
	// more than one element so we use list
	List <WebElement> totalsize=driver.findElements(By.tagName("iframe"));
	int size=totalsize.size();
	System.out.println("The total number of frames: "+size);
	
			
	
	
	
	}

}
