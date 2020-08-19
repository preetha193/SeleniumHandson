package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Image.html");
		//click the first image
		WebElement imageclick=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		imageclick.click();
		driver.navigate().back();
		
		//task2 : check whether broken or corrupted image
		
		WebElement brokenimage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		//naturalWidth=0 naturalwidth is a css property helps in identifying the image is gud or corrupted/broken image.
		
		if(brokenimage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("The image is broken");
		} 

	}

}
