package seleniumHandson;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		// we are checking that once we click on "Download Excel" link, file is downloaded.

		WebElement filedownload=driver.findElement(By.linkText("Download Excel"));
		filedownload.click();
		Thread.sleep(4000);
		//once file downloaded, it gets stored in our local system and we need to verify that as well
		// file will be stored in C:\Users\joyka\Downloads
		
		
		
		
		

		File filelocation=new File("C:\\Users\\joyka\\Downloads");
		//we are checking all files and compare their names to check the downloaded file name
		// we have to declare a variable with respective data type to store all files, so mousehover on listFiles(), we get Files[] so we store it in Files[]

		File[] listofFiles=filelocation.listFiles();
		//now listofFiles contains all files from "C:\\..Downloads" so we are putting in foreach to compare the downloaded file name with all files in the list
		for (File file : listofFiles) {
			if(file.getName().equals("test leaf.xlsx"));
			{
				System.out.println("Downloaded file is available: "+file);
				break;
			}

		}




		driver.close();




	}

}
