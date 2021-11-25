package facebook;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class fbLoginTest extends TestBaseTest {
	
	@Test
	public void init() throws InterruptedException
	{
		FbLoginPage loginPage = PageFactory.initElements(driver, FbLoginPage.class);
		loginPage.setEmail("8515095885");
		Thread.sleep(5000);
		loginPage.setPassword("rudratajmahal@1");
		loginPage.clickOnLoginButton();
		Thread.sleep(5000);
		//loginPage.handleBrowserPopup();
		//Thread.sleep(5000);
		
		
		FbHomePage homePage = PageFactory.initElements(driver, FbHomePage.class);
		homePage.handleBrowserPopup();

		//homePage.alertHandelling();
		homePage.clickOnProfileDropdown();
		Thread.sleep(5000);
		homePage.clickOnLogout();
		Thread.sleep(5000);
		
	}

}
