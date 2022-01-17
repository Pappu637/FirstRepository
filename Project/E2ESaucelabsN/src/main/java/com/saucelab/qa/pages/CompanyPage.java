package com.saucelab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.qa.base.TestBase;

public class CompanyPage extends TestBase{

	public CompanyPage()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//span[contains(text(),'About Us')])[2]") WebElement aboutUs;
	@FindBy(xpath="(//span[contains(text(),'Our Team')])[2]") WebElement ourTeam;
	@FindBy(xpath="(//span[contains(text(),'Careers')])[2]") WebElement careers;
	@FindBy(xpath="(//span[contains(text(),'Security')])[2]") WebElement security;
	@FindBy(xpath="(//span[contains(text(),'News')])[2]") WebElement news;
	@FindBy(xpath="(//span[contains(text(),'Partners')])[2]") WebElement partners;
	
	public CareersPage clickOnCareers()
	{
		careers.click();
		return new CareersPage();
	}
	
}
