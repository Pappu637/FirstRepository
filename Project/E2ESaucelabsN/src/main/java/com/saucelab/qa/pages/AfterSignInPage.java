package com.saucelab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.qa.base.TestBase;

public class AfterSignInPage extends TestBase{

	
	public AfterSignInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Account')]/../div[2]/div/*")
	WebElement account;
	
	@FindBy(xpath="(//span[contains(text(),'Log out')])[2]")
	WebElement logOut;
	
	@FindBy(xpath="(//div[contains(text(),'Help & Support')]/..//div)[3]/*")
	WebElement helpAndSupport;
	
	@FindBy(xpath="(//a[contains(text(),'Status page')])[2]")
	WebElement statusPage;
	
	
	
	
	
	public void clickOnLogOut()
	{
		account.click();
		logOut.click();
	}
	
	public void clickOnStatusPage()
	{
		helpAndSupport.click();
		statusPage.click();
	}
}
