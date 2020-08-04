package seleniumHandson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;



public class DropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		// select the data from dropdown1 using index
		WebElement dropdown1=driver.findElement(By.id("dropdown1"));
		//most of the dropdown in selenium comes under "Select" class
		//dropdown1 is a webelement that needs to be passed here in the select class
		Select select= new Select(dropdown1);
		// index starts from 0 and if we pass 0, first element will be selected and based on the index.
		select.selectByIndex(3);
		select.selectByValue("2"); // since its string, we give it in quotes
		select.selectByVisibleText("Selenium");
	

		// how to get the number of options in dropdown box, to get all the options we cannot use single variable so we use list
		List<WebElement> NoofOptions= select.getOptions();
		int NoofElementsinDropdown=NoofOptions.size();
		System.out.println("Total no of elements in Dropdown: " +NoofElementsinDropdown);


		// we are going to use sendkeys
		dropdown1.sendKeys("LoadRunner");
		

		//multiselect
		////*[@id=\'contentblock\']/section/div[6]/select" should be the xpath cos wen we select the option, it might get extended as //*[@id="contentblock"]/section/div[6]/select/option[2]
		WebElement multiselect= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		//go for select class since we are selecting
		Select multipleoptions= new Select(multiselect);
		multipleoptions.selectByIndex(1);
		multipleoptions.selectByIndex(2);
		multipleoptions.selectByIndex(3);





	}

}
