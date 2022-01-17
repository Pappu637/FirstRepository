package com.saucelab.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucelab.qa.base.TestBase;
import com.saucelab.qa.pages.AfterSignInPage;
import com.saucelab.qa.pages.LandingPage;
import com.saucelab.qa.pages.SignInPage;

public class SignInTest extends TestBase{
	LandingPage landingPage;
	SignInPage signInPage;
	AfterSignInPage afterSignInPage;
	
	public SignInTest()
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
	}
	@Test
	public void signIn() throws InterruptedException
	{
		signInPage = new SignInPage();
		afterSignInPage = signInPage.logIn();
		
	}
	
	//@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
