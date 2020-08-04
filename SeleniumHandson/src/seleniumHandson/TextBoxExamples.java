package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		//launch the web browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		// enter the email id [text box1
		driver.findElement(By.id("email")).sendKeys("mspreetha86.gmail.com");
		// enter the new text along with the existing one text box2
		//relative xpath will have "//" 
		WebElement appendtext=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendtext.sendKeys("test");
		
	
		//we have to get text from the text box //text box3
		// when we inspect, we could see value = "TestLeaf" so we need to get that using getAttribute function and print that
		// when we mouse hover on find element, it says in which data type the value to be stored.
		String gettext= driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(gettext);
// if two or more elements contains the same name, then go for xpath
		WebElement textclear= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		textclear.clear();
		
		//text box disabled // since we are checking boolen so datatype is boolean
		
		boolean disabledtextBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input")).isEnabled();
		System.out.println(disabledtextBox);  //o/p will be false which means it is disabled.
		




	}

}
