package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.findElement(By.xpath("//*[@id=\'yes\']")).click();
		driver.findElement(By.xpath("//*[@id=\'no\']")).click();
		WebElement checkedbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		boolean radiobuttonchecked=checkedbox.isEnabled();
		System.out.println("the radio button is checked: "+radiobuttonchecked);
		// third radio button selection

		WebElement checkedbutton=driver.findElement(By.name("age"));
		checkedbutton.click();
		System.out.println("radiobutton session over");


	}

}
