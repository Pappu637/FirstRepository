package com.saucelab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.qa.base.TestBase;

public class AutomatedTestingPage extends TestBase{

	public AutomatedTestingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class='supertitle ']") public WebElement title;
	
	@FindBy(xpath="(//span[contains(text(),'Try it free')])[2]") WebElement tryItFreeBtn;
	
	public void clickOnTryItFree()
	{
		System.out.println(title.getText());
		tryItFreeBtn.click();	
	}
}