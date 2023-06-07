package Task.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DemoMenuPage {
	WebDriver driver;// base class reference

	public DemoMenuPage(WebDriver driver) {// assign the value to variable on line 11 with the value that i will give from
										// test case
		this.driver = driver;
		PageFactory.initElements(driver, this);// initialise the elements
	}
	
	@FindBy(id="main-product-img-72")
	public WebElement Page;
	
	public void Pagevisible()
	{
		System.out.println(Page.isDisplayed());
		Assert.assertTrue(Page.isDisplayed(),"Page is not Displayed");
	}

}
