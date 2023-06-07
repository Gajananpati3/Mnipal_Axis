package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods{

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//FindElement Methods
		System.out.println(driver.getCurrentUrl());
		System.out.print(driver.getTitle());
		System.out.print(driver.getPageSource());
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		
	}

}
