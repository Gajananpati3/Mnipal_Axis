package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{

	public static void main(String[] args) 
	{

System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	
	driver.manage().window().maximize();
	
	//simple Dropdown
	//WebElement ddown =driver.findElement(By.id("animals"));
	Select select = new Select(driver.findElement(By.id("animals")));
    select.selectByVisibleText("Avatar");
    select.selectByValue("avatar");
    select.selectByIndex(3);
	
	
	
	
	}

}
 