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

public class ContactTest extends Base{
	
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
		
		l.getContact().click();
		Thread.sleep(5000);
		l.getGeneralInquiries().click();
		Thread.sleep(5000);
		ContactPage c = new ContactPage(driver);
		c.getfirstName().sendKeys("Pappu");
		c.getLastName().sendKeys("Mondal");
		c.getCompany().sendKeys("Codelogicx Technologies Pvt. Ltd.");
		c.getBusinessEmail().sendKeys("mondalpapputest1999@gmail.com");
		c.selectCompanySize();
		Thread.sleep(5000);
		c.selectCountry().selectByVisibleText("India");
		c.getPhone().sendKeys("6291205593");
		Thread.sleep(5000);
		//c.getScrollDown();
		Thread.sleep(5000);
		c.getProductInterest().click();
		c.getScrollDown();
		c.sendComments().sendKeys("qqqqqqqqqqqqqqqqqqqqqqqqqqqq");
		Thread.sleep(5000);
		c.getScrollDown();
		Thread.sleep(5000);
		c.getPrivacyPolicy().click();
		c.getSubmit().click();
	}
	
	


	//@AfterTest
	public void teardown()
	{
		driver.close();
	}
}

