package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;

	
	//By signIn = By.cssSelector("a[href='sign in']");
	By email = By.xpath("//input[@id='user_email']");
	By password = By.xpath("//input[@id='user_password']");
	By login = By.xpath("//input[@value='Log In']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getEmail() {
		// TODO Auto-generated method stub
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		// TODO Auto-generated method stub
		return driver.findElement(password);
	}


	public WebElement getlogin() {
		// TODO Auto-generated method stub
		return driver.findElement(login);
		
	}
}
