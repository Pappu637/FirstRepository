package com.saucelab.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.saucelab.qa.base.TestBase;

public class SalesPage extends TestBase{


//	By firstName = By.xpath("//input[@id='FirstName']");
//	By lastName = By.xpath("//input[@id='LastName']");
//	By company = By.xpath("//input[@id='Company']");
//	By Email = By.xpath("(//input[@id='Email'])[1]");
//	By companySize = By.xpath("//select[contains(@id,'Company_Size__c')]");
//	By country = By.xpath("//select[contains(@id,'Country')]");
//	By phone = By.xpath("//input[@id='Phone']");
////	By productInterest = By.xpath("//label[text()='Cross-browser Testing']");
//	By productInterest = By.xpath("//input[@value='Cross-browser Testing']");
//	By comments = By.xpath("//textarea[contains(@id,'Comments')]");
//	//By checkbox = By.xpath("//input[@name='sauceLabsContactConsent']/../label");
//	//By checkbox = By.xpath("//input[@name='sauceLabsContactConsent']");
//	//By checkbox = By.xpath("//label[@id='LblmktoCheckbox_27587_0']");
//	By privacyPolicy = By.xpath("//input[@name='sauceLabsContactConsent']");
//	By Submit = By.xpath("(//button[text()='Submit'])[1]");
	@FindBy(xpath="//input[@id='FirstName']") WebElement firstName;
	@FindBy(xpath="//input[@id='LastName']") WebElement lastName;
	@FindBy(xpath="//input[@id='Company']") WebElement company;
	@FindBy(xpath="(//input[@id='Email'])[1]") WebElement email;
	@FindBy(xpath="//select[contains(@id,'Company_Size__c')]") WebElement companySize;
	@FindBy(xpath="//select[contains(@id,'Country')]") WebElement country;
	@FindBy(xpath="//input[@id='Phone']") WebElement phone;
	//@FindBy(xpath="//label[text()='Cross-browser Testing']") WebElement productInterest;
	//input[@value='Cross-browser Testing']
	@FindBy(xpath="	//input[@value='Cross-browser Testing']") WebElement productInterest;
	@FindBy(xpath="//textarea[contains(@id,'Comments')]") WebElement comments;
	@FindBy(xpath="//input[@name='sauceLabsContactConsent']") WebElement privacyPolicy;
	@FindBy(xpath="(//button[text()='Submit'])[1]") WebElement Submit;
	
	
	public SalesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void submitContactSales() throws InterruptedException 
	{
		firstName.sendKeys("Pappu");
		lastName.sendKeys("Mondal");
		company.sendKeys("Codelogicx Technologies Pvt. Ltd.");
		email.sendKeys("mondalpapputest1999@gmail.com");
		Select objSelect =new Select(companySize);
		objSelect.selectByIndex(5);
		Select objSelect2 =new Select(country);
		objSelect2.selectByVisibleText("India");
		phone.sendKeys("6291205593");
		Thread.sleep(3000);
		getScrollDown();
		Thread.sleep(3000);
		productInterest.click();
		comments.sendKeys("aaaaaaaaaa");
		privacyPolicy.click();
		Thread.sleep(3000);
		getScrollDown();
		Thread.sleep(3000);
		Submit.click();
	}
	public void getScrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}
}

