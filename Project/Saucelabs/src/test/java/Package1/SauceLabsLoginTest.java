package Package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SauceLabsLoginTest extends BaseTest{

	@Test
	public void init() throws InterruptedException
	{
	SauceLabsLoginPage firstLoginPage = PageFactory.initElements(driver, SauceLabsLoginPage.class);
	firstLoginPage.clickOnLogin();
	Thread.sleep(5000);
	firstLoginPage.sendUserName("mondalpapputest1999@gmail.com");
	firstLoginPage.sendPassword("Test@12345");
	firstLoginPage.clickOnLoginButton();
	Thread.sleep(5000);
	firstLoginPage.clickOnAccount();
	

//	SaucelabsDashboardPage dashboardPage = PageFactory.initElements(driver, SaucelabsDashboardPage.class);
//	Thread.sleep(5000);
//	dashboardPage.clickOnAccount();

	
	//dashboardPage.scrollDown();
	//dashboardPage.selectSampleProject();
	
	}
}
