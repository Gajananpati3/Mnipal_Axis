package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_selemium {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nseindia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='tab1Loser']/tbody/tr[1]/td[1]/dsdsdsd")).getText();
		
		

	}

}
