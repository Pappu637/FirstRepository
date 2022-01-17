package com.saucelab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.qa.base.TestBase;



public class EnterprisePage extends TestBase{

	public EnterprisePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class='supertitle ']") public WebElement title;
	
	@FindBy(xpath="//span[contains(text(),'Start Testing')]") WebElement startTestingBtn;
	
	public void clickOnStartTesting()
	{
		System.out.println(title.getText());
		startTestingBtn.click();
		
	}
}
