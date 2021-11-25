package Academy;

import java.io.IOException;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import pageObjects.LandingPage;
//import pageObjects.LoginPage;
import resources.Base;

public class PlatformTest extends Base{
	
	@BeforeTest
	public void initiallize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	
	@Test
	public void basepageNavigation() throws IOException, InterruptedException
	{

		LandingPage l= new LandingPage(driver);
		
		l.getPlatform().click();
		Thread.sleep(5000);
		l.getMobileAppTesting().click();
		

	
	}
	
	


	//@AfterTest
	public void teardown()
	{
		driver.close();
	}
}

