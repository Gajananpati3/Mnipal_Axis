package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions obj=new Actions(driver);
		WebElement Source=driver.findElement(By.id("credit"));
		WebElement Target=driver.findElement(By.id("amt8"));
		
		//obj.dragAndDrop.(driver.findElement(By.id("credit"))),driver.findElement(By.id("amt8")).build().perform();
		
		obj.dragAndDrop(Source,Target).build().perform();
	}

}
