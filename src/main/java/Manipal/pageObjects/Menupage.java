package Manipal.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menupage {
	
WebDriver driver;
	
	public Menupage(WebDriver driver) {//assign the value to variable on line 11 with the value that i will give from test case
       
        this.driver=driver;
        PageFactory.initElements(driver, this);//initialise the elements
	}
	
	
	@FindBy(id="nav-hamburger-menu")
	public WebElement hamburgerMenu;

    @FindBy(xpath="//*[text()='Mobile, Computers']")
    public WebElement MobileComputerMenu;
    
    @FindBy(xpath="//*[twxt()='All Mobile Phones']")
    public WebElement allMobile;
    
    public void menuNavigation()
    
    {
    	hamburgerMenu.click();
    	MobileComputerMenu.click();
    	allMobile.click();
    	
    }
    
    
}
