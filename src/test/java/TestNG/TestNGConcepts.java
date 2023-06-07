package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGConcepts {

	@Test
	public void testSceanio1()
	{
		System.out.println("Gajanan Patil");
	}
		
		@BeforeMethod
		public void beforemethod()
		{
			System.out.println("I am before Method");
		}
		
		@AfterMethod
		public void aftermethod()
		{
			System.out.println("I am After Method");
		}
	    @BeforeClass
	    public void beforeclass()
	    {
	    	System.out.println("I am Before class");
	    }
	    @AfterClass
	    public void Afterclass()
	    {
	    	System.out.println("I am After class");	
	    }
	
	}

