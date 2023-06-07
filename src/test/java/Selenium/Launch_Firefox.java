package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","E:\\Axis\\Selenium\\Web Drivers\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com/");


	}

}
