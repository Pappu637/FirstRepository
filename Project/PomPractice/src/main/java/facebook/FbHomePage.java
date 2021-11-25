package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbHomePage {
	
	WebDriver driver;
	
	public FbHomePage(WebDriver driver)
	{
		this.driver=driver;
	}

		@FindBy(how=How.XPATH, using="//div[@class='j83agx80 l9j0dhe7']") WebElement profileDropdown;
		@FindBy(how=How.XPATH, using="//span[text()='Log Out']") WebElement logoutLink;
		
		
		public void clickOnProfileDropdown()
		{
			profileDropdown.click();
		}
		
		public void clickOnLogout()
		{
			logoutLink.click();
		}
		
		public void alertHandelling() {
			// TODO Auto-generated method stub
			driver.switchTo().alert().dismiss();
			
		}
		public void handleBrowserPopup() {
			// TODO Auto-generated method stub
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disabled-notifications");
			
		}

		
}
