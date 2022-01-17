package com.saucelab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelab.qa.base.TestBase;

public class SolutionsPage extends TestBase{


	@FindBy(xpath="(//span[contains(text(),'Enterprise')])[2]") WebElement enterprise;
	@FindBy(xpath="(//span[contains(text(),'Start-ups & SMB Teams')])[2]") WebElement startups;
	@FindBy(xpath="(//span[contains(text(),'Open Source Projects')])[2]") WebElement openSourceProjects;
	@FindBy(xpath="(//span[contains(text(),'Continuous Testing')])[2]") WebElement continuousTesting;
	@FindBy(xpath="(//span[contains(text(),'Automated Testing')])[2]") WebElement automatedTesting;
	@FindBy(xpath="(//span[contains(text(),'Live Testing')])[2]") WebElement liveTesting;
	
	
	public SolutionsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getEnterprise() {
		enterprise.click();
	}
	public void getStartups() {
		startups.click();
	}
	public void getOpenSourceProjects() {
		openSourceProjects.click();
	}
	public void getContinuousTesting() {
		continuousTesting.click();
	}
	public void getAutomatedTesting() {
		automatedTesting.click();
	}
	public void getliveTesting() {
		liveTesting.click();
	}
	
	
	
}
