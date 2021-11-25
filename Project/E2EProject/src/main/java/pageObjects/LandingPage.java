package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;

	
	//By signIn = By.cssSelector("a[href='sign in']");
	By signIn = By.xpath("//span[text()='Login']");
	By title = By.xpath("(//div[@class='container']//following::h2)[1]");
	By navbar = By.xpath("//div[@class='navbar-header']//following::nav//ul");
	//By navbar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getLogin() 
	{	
		return driver.findElement(signIn);
	}
	public WebElement getTitle() 
	{	
		 return driver.findElement(title);
	}
	public WebElement getNavigationBar() 
	{
		 return driver.findElement(navbar);
	}
	
}
