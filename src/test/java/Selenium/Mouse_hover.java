package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_hover {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 
		 Actions obj= new Actions(driver);
		//action.moveToElement(driver.findElement(By.id("nav_ya_signin").contextClick(driver.findElement(By.xpath("//*[text()='Your Account'])[2]"))).build().perform();
		
WebElement accountSignIn=driver.findElement(By.id("nav-link-accountList"));
WebElement yourAccount=(WebElement) (By.xpath("//*[text()='Your Account'])[2]"));

  obj.moveToElement(accountSignIn).contextClick(yourAccount).build().perform();
	}

}
