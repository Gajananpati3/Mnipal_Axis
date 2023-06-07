package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_box {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.id("vfb-6-0")).click();
		driver.findElement(By.id("vfb-6-1")).click();
		driver.findElement(By.id("vfb-6-2")).click();

	}

}
