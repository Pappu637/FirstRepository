package com.saucelab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.qa.base.TestBase;

public class SignInPage extends TestBase{

	
	
	@FindBy(xpath="//input[@placeholder='User Name']")
	WebElement userName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement logInBtn;
	
	public SignInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public AfterSignInPage logIn() throws InterruptedException
	{
		userName.sendKeys(prop.getProperty("username"));
		//Thread.sleep(3000);
		String userPass = prop.getProperty("pass");
		password.sendKeys(userPass.trim());
		logInBtn.click();
		return new AfterSignInPage();
		
	}
	
	
}
