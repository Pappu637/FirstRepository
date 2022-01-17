package com.saucelab.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucelab.qa.base.TestBase;
import com.saucelab.qa.pages.ContactPage;
import com.saucelab.qa.pages.LandingPage;
import com.saucelab.qa.pages.SalesPage;
import com.saucelab.qa.pages.SignInPage;

public class ContactTest extends TestBase{
	LandingPage landingPage;
	SignInPage signInPage;
	ContactPage contactPage;
	SalesPage salesPage;
	
	public ContactTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
		Thread.sleep(5000);
		 landingPage = new LandingPage();
		 landingPage.clickContact();
		 Thread.sleep(3000);
		 contactPage = new ContactPage();
		 salesPage = new SalesPage();
	}
	@Test
	public void sales() throws InterruptedException
	{
		
		salesPage = contactPage.clickContactSales();
		salesPage.submitContactSales();
	}
	
	//@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
