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

public class CompanyTest extends Base{
	
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
		
		l.getCompany().click();
		Thread.sleep(5000);
		l.getcompanyCareers().click();
		Thread.sleep(10000);
		//l.getAboutUs().click();
		CompanyPage company= new CompanyPage(driver);
		Assert.assertEquals(company.getCompanyCareerTitle().getText(),"CAREERS");
		Thread.sleep(5000);
		company.getSmallScrollDown();
		Thread.sleep(5000);
		//company.getSmallScrollDown();
		company.getSwitchToFrame();
		company.selectOffices().selectByIndex(3);
		company.getSupportEngineer().click();
		
		//company.getFullstackEngineer().click();
		//company.getCompanyCareerTitle().getText();
	
	}
	
	


	//@AfterTest
	public void teardown()
	{
		driver.close();
	}
}

