package seleniumHandson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//using navigate function
		driver.navigate().to("http://www.leafground.com/pages/Link.html");

		//go to home page link
		WebElement homepagelink=driver.findElement(By.partialLinkText("Go to"));
		homepagelink.click();

		//now the control will be in home page window.
		//to bring back to the links page we use the below code
		driver.navigate().back();

		//task2 to identify the page where it goes without clicking it

		WebElement donclickme=driver.findElement(By.partialLinkText("Find where"));
		//we are not going to click the link so we get the <a> tag to check where it goes?
		String pagelink=	donclickme.getAttribute("href");
		System.out.println("The page where it goes without clicking:"+pagelink);

		//task 3 broken link
		WebElement brokenlink=driver.findElement(By.partialLinkText("Verify am"));
		brokenlink.click();
		//it goes to a different page
		String pagetitle=driver.getTitle();
		if(pagetitle.contains("404"))
		{
			System.out.println("The link is broken");
		}
		//it comes to link page

		driver.navigate().back();

		//task 4 go to home page
		//go to home page is similar to task 1 but if we call the same code, it raises 
		//staleelementreferenceexception is thrown bcos the page gets refreshed when we go back and forth.

		WebElement homepagelink1=driver.findElement(By.partialLinkText("Go to"));
		homepagelink1.click();
		driver.navigate().back();
		//to find the no.of links since it is number of links, it should be stored in a list
		List<WebElement> noofLinks=driver.findElements(By.tagName("a"));
		// we get all the links <a> anchor tag in a list and then add size function to get the total and stored in an int
		int totallinks=noofLinks.size();
		System.out.println("The total no. of links: "+totallinks);
		// though we have only five links available in the page, it adds the anchor tag of logo so it displays 6.






	}

}
