package com.saucelab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.qa.base.TestBase;


public class StartUpsPage extends TestBase{

	public StartUpsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class='supertitle ']") public WebElement title;
	
	@FindBy(xpath="//span[contains(text(),'See the plans')]") WebElement SeeThePlansBtn;
	
	public void clickOnSeeThePlans()
	{
		System.out.println(title.getText());
		SeeThePlansBtn.click();
		
	}
}