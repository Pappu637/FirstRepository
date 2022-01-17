package com.saucelab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.qa.base.TestBase;

public class OpenSourceProjectsPage extends TestBase{

	public OpenSourceProjectsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class='supertitle ']") public WebElement title;
	
	@FindBy(xpath="(//span[contains(text(),'Get Open Sauce')])[1]") WebElement getOpenSauceBtn;
	
	public void clickOnGetOpenSauce()
	{
		System.out.println(title.getText());
		getOpenSauceBtn.click();	
	}
}