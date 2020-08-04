import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		// we are using link text and give the name of the link
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		// to use partial link it searches for partial content and it operates, cos sometimes content might be changed by dev
	//	driver.findElement(By.partialLinkText("home"));
		
	}

}
