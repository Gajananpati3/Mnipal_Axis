package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visible_text {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		
		driver.findElement(By.xpath("//*[text()='Forgot password?']")).click();

	}

}
