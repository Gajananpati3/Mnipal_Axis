package ProjectWork_02_06_23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_chrome
{
	public static void main(String[] args) 
	{

System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/login.php");

}
}