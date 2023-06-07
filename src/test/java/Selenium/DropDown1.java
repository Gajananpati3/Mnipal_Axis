package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		//Dropdown

		Select select = new Select(driver.findElement(By.name("country")));
	    select.selectByVisibleText("ANDORRA");
	    select.selectByValue("ANDORRA");
	    select.selectByIndex(3);
	}

}
