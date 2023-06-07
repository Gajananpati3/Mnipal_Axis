package ProjectWork_02_06_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_Order {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Axis\\Selenium\\Web Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Maximize screen
        driver.manage().window().maximize();
        
        //login process
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        //Add product in cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        
        //click on cart button
        driver.findElement(By.className("shopping_cart_link")).click();
        
        //Remove product from cart
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
        driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.id("remove-sauce-labs-onesie")).click();
        driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
        
        //Go to back slide
        driver.findElement(By.id("continue-shopping")).click();
        
        //Nevigate to cart
        driver.findElement(By.className("shopping_cart_link")).click();
        
        //Click on Checkout
        driver.findElement(By.id("checkout")).click();
        
        //Enter user data
        driver.findElement(By.id("first-name")).sendKeys("Gajanan");
        driver.findElement(By.id("last-name")).sendKeys("Patil");
        driver.findElement(By.id("postal-code")).sendKeys("416502");
        
      //Click on Continue
        driver.findElement(By.id("continue")).click(); 
        
        // Click on finish
        driver.findElement(By.id("finish")).click(); 
        
        //close website 
        driver.close();	}

}
