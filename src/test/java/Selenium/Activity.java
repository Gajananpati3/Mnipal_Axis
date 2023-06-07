package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 
		driver.manage().window().maximize();
		//verify sign in button
		
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
		//click on hamburger
		driver.findElement(By.className("hm-icon nav-sprite")).click();
		//Click on Mobile,Computer
		driver.findElement(By.className("hmenu-item")).click();
		//Click on All Mobile Phones
		driver.findElement(By.className("hmenu-item")).click();
		//Verify the header Mobiles & Accessories is visible
		
		

	}

}
