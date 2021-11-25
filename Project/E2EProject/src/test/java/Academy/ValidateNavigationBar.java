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

public class ValidateNavigationBar extends Base{

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
		//System.out.println(prop.getProperty("url"));
		Thread.sleep(5000);
		LandingPage l= new LandingPage(driver);
		//l.getLogin().click();
		Thread.sleep(5000);
		//l.getTitle();
		
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	
}
