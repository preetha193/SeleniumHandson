package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		//when we inspect element, if we see the input type=file, we can use sendkeys option to upload a file.
		//driver.findElement(By.xpath("//*[@id=\'mydiv\']/input")).sendKeys("C:\\Users\\joyka\\Downloads\\test.docx");
		//uploading jpeg file
		driver.findElement(By.xpath("//*[@id=\'mydiv\']/input")).sendKeys("C:\\Users\\joyka\\Pictures\\test.png");
		
		
		

	}

}
