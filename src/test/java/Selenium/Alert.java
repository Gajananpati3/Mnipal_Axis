package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		driver.manage().window().maximize();
		
		//simple alert
		driver.findElement(By.name("alertbox")).click();
		Alert simpleAlert1 = (Alert) driver.switchTo().alert();
		((org.openqa.selenium.Alert) simpleAlert1).accept();
		System.out.println(((WebElement) simpleAlert1).getText());
		
	

	}

}
