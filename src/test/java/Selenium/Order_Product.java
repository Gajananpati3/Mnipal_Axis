package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order_Product {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		driver.findElement(By.xpath("//*[@class xmlns='\"http://www.w3.org/2000/svg\']")).click();
	
	    driver.findElement(By.xpath("//*[@type='text']")).sendKeys("9767800761");
	}

}
