package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactPage {

	public WebDriver driver;
	public ContactPage(WebDriver driver) {
		
		this.driver=driver;
	}
	

	By firstName = By.xpath("//input[@id='FirstName']");
	By lastName = By.xpath("//input[@id='LastName']");
	By company = By.xpath("//input[@id='Company']");
	By Email = By.xpath("(//input[@id='Email'])[1]");
	By companySize = By.xpath("//select[contains(@id,'Company_Size__c')]");
	By country = By.xpath("//select[contains(@id,'Country')]");
	By phone = By.xpath("//input[@id='Phone']");
//	By productInterest = By.xpath("//label[text()='Cross-browser Testing']");
	By productInterest = By.xpath("//input[@value='Cross-browser Testing']");
	By comments = By.xpath("//textarea[contains(@id,'Comments')]");
	//By checkbox = By.xpath("//input[@name='sauceLabsContactConsent']/../label");
	//By checkbox = By.xpath("//input[@name='sauceLabsContactConsent']");
	//By checkbox = By.xpath("//label[@id='LblmktoCheckbox_27587_0']");
	By privacyPolicy = By.xpath("//input[@name='sauceLabsContactConsent']");
	By Submit = By.xpath("(//button[text()='Submit'])[1]");
	
	
	public WebElement getfirstName() {
		return driver.findElement(firstName);
	}
	public WebElement getLastName() {
		return driver.findElement(lastName);
	}

	public WebElement getCompany() {
		// TODO Auto-generated method stub
		return driver.findElement(company);
		
	}
	public WebElement getBusinessEmail() {
		// TODO Auto-generated method stub
		return driver.findElement(Email);
		
	}
	public void selectCompanySize() {
		Select objSelect =new Select(driver.findElement(companySize));
		objSelect.selectByIndex(5);
		
	}

	
	public Select selectCountry() {
		Select objSelect =new Select(driver.findElement(country));
		return objSelect;
		//objSelect.selectByIndex(5);
	}
	public WebElement getPhone() {
		return driver.findElement(phone);
	}
	public WebElement getProductInterest() {
		return driver.findElement(productInterest);
	}
	public WebElement sendComments() {
		return driver.findElement(comments);
	}
	public WebElement getPrivacyPolicy() {
		return driver.findElement(privacyPolicy);
	}
	public void getScrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
	}
	public WebElement getSubmit() {
		// TODO Auto-generated method stub
		return driver.findElement(Submit);
	}
	
	
	
}
