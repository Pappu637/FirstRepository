package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SauceLabsLoginPage {

	WebDriver driver ;
	
	
	public void SauceLabsLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(how=How.XPATH, using="//span[text()='Sign in']") WebElement SignInLink; 
	@FindBy(how=How.XPATH, using="//input[@placeholder='User Name']") WebElement UserName;
	@FindBy(how=How.XPATH, using="//input[@placeholder='Password']") WebElement Password;
	@FindBy(how=How.XPATH, using="//input[@id='loginButton_0']") WebElement LoginButton;
	@FindBy(how=How.XPATH, using="//div[text()='Account']") WebElement account;
	
	public void clickOnLogin() 
	{
		SignInLink.click();
	}

	public void sendUserName(String strUserName) {
		// TODO Auto-generated method stub
		UserName.sendKeys(strUserName);
		
	}

	public void sendPassword(String strPassword) {
		// TODO Auto-generated method stub
		Password.sendKeys(strPassword);
		
	}

	public void clickOnLoginButton() {
		// TODO Auto-generated method stub
		LoginButton.click();
		
	}

	public void clickOnAccount() {
		// TODO Auto-generated method stub
		account.click();
		System.out.println("HI........");
		
	}
}
