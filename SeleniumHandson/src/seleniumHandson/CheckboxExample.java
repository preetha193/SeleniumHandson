package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input")).isSelected();

		//confirms selenium is checked

		WebElement selenium=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean flag=selenium.isSelected();
		
			System.out.println("Selenium is selected" +flag);
		
				//deselect the selected checkbox

		WebElement FirstElement=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input"));
		//*[@id='contentblock']/section/div[3]/div[1]
		
		
		if(FirstElement.isSelected())
		{
			FirstElement.click();
		}
		WebElement Secondcheckbox= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
		if (Secondcheckbox.isSelected())
		{
			Secondcheckbox.click();
					
		}
		//click all the options
		WebElement option1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
		option1.click();
		WebElement option2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[2]/input"));
		option2.click();
		WebElement option3=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[3]/input"));
		option3.click();
		






	}

}
