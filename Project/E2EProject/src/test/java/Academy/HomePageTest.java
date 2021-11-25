package Academy;

import java.io.IOException;

import org.junit.After;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePageTest extends Base{
	
	//@BeforeTest
	public void initiallize() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://qaclickacademy.com");
	}
	
	
	@Test(dataProvider="getData")
	public void basepageNavigation(String username,String password) throws IOException, InterruptedException
	{
		driver = initializeDriver();
		driver.get("https://qaclickacademy.com");
		LandingPage l= new LandingPage(driver);
		l.getLogin().click();
		Thread.sleep(5000);
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		Thread.sleep(5000);
		lp.getPassword().sendKeys(password);
		lp.getlogin().click();
	
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0] = "restricteduser@gmail.com";
		data[0][1] = "123456";
		
		
		data[1][0] = "nonrestricteduser@gmal.com";
		data[1][1] = "1234567";
		
		
		return data;
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}

