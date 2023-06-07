package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover1 {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 
		 Actions obj =new Actions(driver);
		WebElement button= driver.findElement(By.id("nav_cs_help"));
		 
		 obj.contextClick(button);

	}

}
