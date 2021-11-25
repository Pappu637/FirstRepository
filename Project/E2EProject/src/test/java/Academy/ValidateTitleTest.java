package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class ValidateTitleTest extends Base{

	
	@BeforeTest
	public void initiallize() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://qaclickacademy.com");
	}
	
	@Test
	public void basepageNavigation() throws IOException, InterruptedException
	{
//		driver = initializeDriver();
//		driver.get("https://qaclickacademy.com");
		
		LandingPage l= new LandingPage(driver);
		Thread.sleep(5000);
		//l.getTitle();
		//Assert.assertEquals(l.getTitle().getText(),"Featured Courses");
		//Assert.assertEquals(l.getTitle().getText(), "Featured Courses");
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	
}
