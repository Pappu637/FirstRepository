package Academy;

import java.io.IOException;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import pageObjects.LandingPage;
//import pageObjects.LoginPage;
import resources.Base;

public class HomePageTest extends Base{
	public WebDriver driver;
	@BeforeTest
	public void initiallize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test
	public void basepageNavigation() throws IOException, InterruptedException
	{
//		driver = initializeDriver();
//		driver.get(prop.getProperty("url"));
		//driver.get("https://saucelabs.com/");
		LandingPage l= new LandingPage(driver);
		l.getSignIn().click();
		Thread.sleep(5000);
		SignInPage sp = new SignInPage(driver);
		sp.getUsername().sendKeys("mondalpapputest1999@gmail.com");
		sp.getPassword().sendKeys("Test@12345");
		sp.getLogIn().click();
		Thread.sleep(5000);
		//AfterSignInPage asp =  AfterSignInPage(driver); 
		AfterSignInPage asp = new AfterSignInPage(driver);
		//asp.getHello();
		
		asp.getAccount().click();
		//asp.getLogOut().click();
		Thread.sleep(5000);
		asp.getSauceApps().click();
		asp.getVisual().click();
		Thread.sleep(5000);
		asp.switchToChildWindow();
		Thread.sleep(5000);
		asp.getRequestDemo().click();
		
		//asp.getDesktopMobile().click();

	
	}
	
	
	
	//@AfterTest
	public void teardown()
	{
		driver.close();
	}
}

