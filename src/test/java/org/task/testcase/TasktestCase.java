package org.task.testcase;

import org.openqa.selenium.WebDriver;
import org.task.base.TaskConfiguration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Task.pageObject.DemoDeskstopMenu;
import Task.pageObject.DemoHomePage;
import Task.pageObject.DemoMenuPage;

public class TasktestCase extends TaskConfiguration{
	
	public DemoDeskstopMenu DemoDeskobj;
	public DemoHomePage DemoHomobj;
	public DemoMenuPage DemoMenuobj;
	
	WebDriver driver;
	
	@BeforeMethod
	public void initialsetp()
	{
		driver= getDriver();
		DemoDeskobj=new DemoDeskstopMenu(driver);
		DemoHomobj=new DemoHomePage(driver);
		DemoMenuobj=new DemoMenuPage(driver);
	}
	
	@Test
	public void senarios()
	{
		DemoDeskobj.Nevigation();
		DemoHomobj.Homepagevisible();
		DemoMenuobj.Pagevisible();
		
	}

}
