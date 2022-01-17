package com.saucelab.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucelab.qa.base.TestBase;
import com.saucelab.qa.pages.AfterSignInPage;
import com.saucelab.qa.pages.LandingPage;
import com.saucelab.qa.pages.SignInPage;

public class AfterSignInTest extends TestBase{
	LandingPage landingPage;
	SignInPage signInPage;
	AfterSignInPage afterSignInPage;
	
	public AfterSignInTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
		Thread.sleep(5000);
		 landingPage = new LandingPage();
		 landingPage.clickSignIn();
		 Thread.sleep(3000);
		 signInPage = new SignInPage();
		 afterSignInPage = new AfterSignInPage();
		 afterSignInPage = signInPage.logIn();
		 Thread.sleep(7000);
		
	}
	
	@Test(priority=1)
	public void helpASupportStatusPage()
	{
		afterSignInPage.clickOnStatusPage();
	}
	
	@Test(priority=2)
	public void signOut() throws InterruptedException
	{
		afterSignInPage.clickOnLogOut();
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
