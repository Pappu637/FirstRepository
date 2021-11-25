package Package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SaucelabsDashboardPage {
	
	WebDriver driver;
	public void SaucelabsDashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//span[text()='Java']") WebElement sampleProject;//div[text()='Account']
	@FindBy(how=How.XPATH, using="//div[text()='Account']") WebElement account;//div[text()='Account']
	

	public void selectSampleProject() {
		
		sampleProject.click();
		// TODO Auto-generated method stub
		
	}


	public void scrollDown() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("HI........");
		
	}


	public void clickOnAccount() {
		// TODO Auto-generated method stub
		account.click();
		System.out.println("HI........");
		
	}

}
