package seleniumHandson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmessages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button")).click();

		//once alert box is opened, we have to move the control from alert box to normal window
		//Alert is an interface
		Alert alert= driver.switchTo().alert();
		alert.accept(); // to click on ok since we have only one option


		// second task to click on confirm box button

		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.accept();

		//third task: by prompt box

		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button")).click();
		Alert promptBox=driver.switchTo().alert();
		promptBox.sendKeys("Hi");
		promptBox.accept();


		//task 4 line breaks in alert box

		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/button")).click();
		Alert lineBreak=driver.switchTo().alert();
		Thread.sleep(5000);
		lineBreak.accept();







	}

}
