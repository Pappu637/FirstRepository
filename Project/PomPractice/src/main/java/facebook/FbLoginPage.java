package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbLoginPage {
	
	WebDriver driver;
	
	public FbLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	@FindBy(how=How.XPATH, using="//input[@id='email']") WebElement emailTextBox;
	@FindBy(how=How.XPATH, using="//input[@id='pass']") WebElement passwordTextBox;
	@FindBy(how=How.XPATH, using="//button[@name='login']") WebElement signInButton;
	
	public void setEmail(String strEmail)
	{
		emailTextBox.sendKeys(strEmail);
	}
	
	public void setPassword(String strPassword)
	{
		passwordTextBox.sendKeys(strPassword);
	}
	
	public void clickOnLoginButton()
	{
		signInButton.click();
	}

	public void handleBrowserPopup() {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disabled-notifications");
		WebDriver driver = new ChromeDriver(options);
		
	}
	
}
