package Task.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoDeskstopMenu {
	WebDriver driver;// base class reference

	public DemoDeskstopMenu(WebDriver driver) {// assign the value to variable on line 11 with the value that i will give from
										// test case
		this.driver = driver;
		PageFactory.initElements(driver, this);// initialise the elements
	}
	
	@FindBy(xpath=("//body/div[4]/div[1]/div[2]/ul[1]/li[2]/a[1]"))
	public WebElement Computer;
	
	@FindBy(xpath="//body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	public WebElement Dekstop;
	
	@FindBy(xpath="//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")
	public WebElement Addtocart;
	
	public void Nevigation()
	{
		Computer.click();
		Dekstop.click();
		Addtocart.click();
	}
	
	

}
