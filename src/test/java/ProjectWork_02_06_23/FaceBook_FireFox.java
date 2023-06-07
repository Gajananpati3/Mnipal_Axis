package ProjectWork_02_06_23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook_FireFox {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.gecko.driver","E:\\Axis\\Selenium\\Web Drivers\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/login.php");

	}

}
