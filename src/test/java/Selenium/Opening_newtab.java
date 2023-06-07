package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opening_newtab {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//open a new tab in window
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.CONTROL,Keys.RETURN);
	}

}
