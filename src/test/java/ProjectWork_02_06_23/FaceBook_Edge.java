package ProjectWork_02_06_23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceBook_Edge {

	public static void main(String[] args) 
	{
		
System.setProperty("webdriver.edge.driver","E:\\Axis\\Selenium\\Web Drivers\\edgedriver_win32\\edgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com/login.php");

	}

}
