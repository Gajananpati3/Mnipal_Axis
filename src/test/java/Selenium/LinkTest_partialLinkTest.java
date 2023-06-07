package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest_partialLinkTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html%22");

		driver.findElement(By.linkText("BMI")).click();
		driver.findElement(By.partialLinkText("Pregnancy Conception")).click();

	}
}
		
	


