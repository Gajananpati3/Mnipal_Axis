package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_AlongTabs {

	public static void main(String[] args) 
	{
		
       System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//open a new tab in window
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.CONTROL,Keys.RETURN);
		 
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> windowsID= driver.getWindowHandles();
		Iterator<String> it= windowsID.iterator();
		
		while (it.hasNext()) {
			Object child;
			if (!parent.equals(child));
			{
				driver.switchTo().window((String) (child);
				
			}
			
				}
		driver.findElement(By.xpath("//*[@data-action='sign in']")).click();
		driver.switchTo().window(parent);
			}
	
		
	}

