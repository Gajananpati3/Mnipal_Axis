package Task.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DemoHomePage {
	WebDriver driver;// base class reference

	public DemoHomePage(WebDriver driver) {// assign the value to variable on line 11 with the value that i will give from
										// test case
		this.driver = driver;
		PageFactory.initElements(driver, this);// initialise the elements
	}

	@FindBy(xpath="//*[text()='Register']")
	public WebElement Register;
	
	@FindBy(xpath="//*[text()='Log in']")
	public WebElement Login;
	
	@FindBy(xpath="//*[text()='Shopping cart'][1]")
	public WebElement Shoppingcart;
	
	@FindBy(xpath="//*[text()='Wishlist'][1]")
	public WebElement Wishlist;
	
	
	public void Homepagevisible()
	{
		System.out.println(Register.isDisplayed());
		System.out.println(Login.isDisplayed());
		System.out.println(Shoppingcart.isDisplayed());
		System.out.println(Wishlist.isDisplayed());
		
		Assert.assertTrue(Register.isDisplayed(),"Register is not Displayed");
		Assert.assertTrue(Login.isDisplayed(),"Login is not Displayed");
		Assert.assertTrue(Shoppingcart.isDisplayed(),"Shoppingcart is not Displayed");
		Assert.assertTrue(Wishlist.isDisplayed(),"Wishlist is not Displayed");
	}
	
	

}
