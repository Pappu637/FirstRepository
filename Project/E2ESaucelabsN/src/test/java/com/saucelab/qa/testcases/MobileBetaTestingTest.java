package com.saucelab.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucelab.qa.base.TestBase;
import com.saucelab.qa.pages.CompanyPage;
import com.saucelab.qa.pages.LandingPage;
import com.saucelab.qa.pages.MobileBetaTestingPage;

public class MobileBetaTestingTest extends TestBase{

	LandingPage landingPage;
	MobileBetaTestingPage mobileBetaTesting;
	
	public MobileBetaTestingTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
		Thread.sleep(5000);
		 landingPage = new LandingPage();
		 mobileBetaTesting= new MobileBetaTestingPage();
		 
		
	}
	@Test
	public void carriers() throws InterruptedException
	{
		Thread.sleep(3000);
		landingPage.getSmallScrollDown();
		Thread.sleep(3000);
		landingPage.clickMobileBetaTesting();
		mobileBetaTesting.clickOnTreeItFreeBtn();
	}
	
	//@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
}
