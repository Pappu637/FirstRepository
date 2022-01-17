package com.saucelab.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucelab.qa.base.TestBase;
import com.saucelab.qa.pages.CareersPage;
import com.saucelab.qa.pages.CompanyPage;
import com.saucelab.qa.pages.ContactPage;
import com.saucelab.qa.pages.LandingPage;
import com.saucelab.qa.pages.SalesPage;

public class CompanyTest extends TestBase{

	LandingPage landingPage;
	CompanyPage companyPage;
	CareersPage careersPage;
	public CompanyTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
		Thread.sleep(5000);
		 landingPage = new LandingPage();
		 landingPage.clickCompany();
		 Thread.sleep(3000);
		 companyPage = new CompanyPage();
		 careersPage = new CareersPage();
	}
	@Test
	public void carriers()
	{
		companyPage.clickOnCareers();
		careersPage.getSwitchToFrame();
		careersPage.getSmallScrollDown();
		careersPage.selectOffices().selectByIndex(3);
	}
	
	//@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
}
