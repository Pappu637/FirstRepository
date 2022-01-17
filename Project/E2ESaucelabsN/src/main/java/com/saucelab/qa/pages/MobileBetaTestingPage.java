package com.saucelab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.qa.base.TestBase;

public class MobileBetaTestingPage extends TestBase{

	public MobileBetaTestingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[contains(text(),'Try it free')])[2]")
	WebElement firstTryItFreeBtn;
	
	public void clickOnTreeItFreeBtn()
	{
		firstTryItFreeBtn.click();
	}
}
