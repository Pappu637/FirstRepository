package com.saucelab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.qa.base.TestBase;

public class ContactPage extends TestBase{

	
	@FindBy(xpath="(//span[contains(text(),'Contact Sales')])[2]") WebElement contactSales;
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public SalesPage clickContactSales()
	{
		contactSales.click();
		return new SalesPage();
	}
}

