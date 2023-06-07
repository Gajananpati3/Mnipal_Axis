package org.manipal.testcase;

import org.manipal.base.BaseConfigurations;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.BaseAnnotation;

import Manipal.pageObjects.HomePage;
import Manipal.pageObjects.Menupage;
import Manipal.pageObjects.MobilePage;

public class Basetestcase extends BaseConfigurations{
	// 1. Declare page Objects
	// 2. we will initialize the page object
	// 3. implement inheritance concept
	// 4. Create Test case
	// 5. Create Webdriver reference

	/*
	 * HomePage homeObj=new HomePage(); 
	 * MenuPage menuObj=new MenuPage(); MobilePage
	 * mobileObj=new MobilePage();
	 */
	//Declear the page object
	
	public HomePage homeobj;
	public Menupage menuobj;
	public MobilePage mobileobj;
	
	WebDriver driver;
	
	//initialize the object
	
	@BeforeMethod
	public void initialSetup()
	{
		driver= getDriver();
		homeobj=new HomePage(driver);
		menuobj=new Menupage(driver);
		mobileobj=new MobilePage(driver);
	}
    @Test
    public void senario1()
    {
    	homeobj.verifyHomeLaunchSuccess();
    	menuobj.menuNavigation();
    	mobileobj.verifyMobileHeader();
    }
    
}
