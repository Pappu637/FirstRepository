package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

	public WebDriver driver;
	public SignInPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By userName = By.xpath("//input[@placeholder='User Name']");
	By password = By.xpath("//input[@placeholder='Password']");//input[@value='Log in']
	By logIn = By.xpath("//input[@value='Log in']");
	
	public WebElement getUsername() {
		return driver.findElement(userName);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLogIn() {
		return driver.findElement(logIn);
	}
	
}
