package com.saucelab.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

import com.saucelab.qa.base.TestBase;

public class LandingPage extends TestBase{

//	public WebDriver driver;
//	public LandingPage(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver;
//	}
	
//	By signIn = By.xpath("//span[text()='Sign in']");
//	//By pricing = By.xpath("(//span[text()='Pricing'])[2]");
//	By tryItFree = By.xpath("(//span[text()='Try it free'])[1]");
//	//By solutions = By.xpath("(//a[text()='Solutions'])[2]");
//	By solountionEnterPrise = By.xpath("(//a[text()='Solutions']//following::span[text()='Enterprise'])[2]");
//	//(//a[text()='Solutions']//following::span[text()='Enterprise'])[1]
//	//By platform = By.xpath("(//a[text()='Platform'])[2]");
//	By platformMobileApptesting = By.xpath("(//span[contains(text(),'Mobile App')])[2]");
//	//By resources = By.xpath("(//a[text()='Resources'])[2]");	
//	By communitySelenium = By.xpath("((//span[text()='Community'])[2]/../..//span)[4]");
//	//By company = By.xpath("(//a[text()='Company'])[2]");
//	By companyAboutUs = By.xpath("(//span[contains(text(),'About')])[2]");
//	//By contact = By.xpath("(//a[text()='Contact'])[2]");
//	By contactGeneralInquiries = By.xpath("(//span[contains(text(),'General')])[2]");
//	By companyCareers= By.xpath("(//span[text()='Careers'])[2]");
//			
	@FindBy(xpath="(//a[text()='Solutions'])[2]")		
	WebElement solutions;
	
	@FindBy(xpath="(//span[text()='Pricing'])[2]")		
	WebElement pricing;
	
	@FindBy(xpath="(//a[text()='Platform'])[2]")		
	WebElement platform;
	
	@FindBy(xpath="(//a[text()='Resources'])[2]")		
	WebElement resources;
	
	@FindBy(xpath="(//a[text()='Company'])[2]")		
	WebElement company;
	
	@FindBy(xpath="(//a[text()='Contact'])[2]")		
	WebElement contact;
	
	@FindBy(xpath="//span[contains(text(),'Sign in')]")		
	WebElement signIn;
	
	@FindBy(xpath="(//span[contains(text(),'Contact sales')])[2]")		
	WebElement buildYourBusinessContactSales;
	
	@FindBy(xpath="//h2[contains(text(),'Mobile Beta Testing')]")		
	WebElement mobileBetaTesting;
	

	
	
	public LandingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickContact()
	{
		contact.click();
	}
	public void clickSolutions()
	{
		solutions.click();
	}
	public void clickBuildYourBusinessContactSales()
	{
		buildYourBusinessContactSales.click();
	}
	public void getScrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,7500)", "");
	}
	public void clickSignIn()
	{
		signIn.click();
	}
	public void clickMobileBetaTesting()
	{
		mobileBetaTesting.click();
	}

	public void clickCompany() {
		// TODO Auto-generated method stub
		company.click();
		
	}

	public void getSmallScrollDown() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		
	}

	
	
//	
//	public WebElement getSignIn() {
//		return driver.findElement(signIn);		
//	}
//
//	public WebElement getPricing() {
//		return driver.findElement(pricing);		
//	}
//	
//	public WebElement getTryItFree() {
//		return driver.findElement(tryItFree);		
//	}
//	
//	public WebElement getSolutions() {
//		return driver.findElement(solutions);	
//	}
//	public void getScrollDown()
//	{
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,7500)", "");
//	}
//	public WebElement getEnterprise() {
//		return driver.findElement(solountionEnterPrise);		
//	}
//	public WebElement getPlatform() {
//		return driver.findElement(platform);		
//	}
//	public WebElement getMobileAppTesting() {
//		return driver.findElement(platformMobileApptesting);		
//	}
//	public WebElement getResources() {
//		return driver.findElement(resources);		
//	}
//	public WebElement getSelenium() {
//		return driver.findElement(communitySelenium);		
//	}
//	public WebElement getCompany() {
//		return driver.findElement(company);		
//	}
//	public WebElement getAboutUs() {
//		return driver.findElement(companyAboutUs);		 
//	}
//	public WebElement getContact() {
//		return driver.findElement(contact);		
//	}
//	public WebElement getGeneralInquiries() {
//		return driver.findElement(contactGeneralInquiries);		 
//	}
//	public WebElement getcompanyCareers() {
//		return driver.findElement(companyCareers);		
//	}
//	public WebElement getAllDepartment() {
//		return driver.findElement(allDepartment);		
//	}
	
	
}
