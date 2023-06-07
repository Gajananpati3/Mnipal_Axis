package Manipal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MobilePage {
WebDriver driver;
	
	public MobilePage(WebDriver driver) {//assign the value to variable on line 11 with the value that i will give from test case
       
        this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="(//*[text()='Mobile & Accessories'])[1]")
	public WebElement MobileHeader;
	
	public void verifyMobileHeader()
	{
		Assert.assertEquals(MobileHeader.isDisplayed(),true);
	}
}
