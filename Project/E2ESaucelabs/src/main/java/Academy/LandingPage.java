package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By signIn = By.xpath("//span[text()='Sign in']");
	By pricing = By.xpath("(//span[text()='Pricing'])[2]");
	By tryItFree = By.xpath("(//span[text()='Try it free'])[1]");
	By solutions = By.xpath("(//a[text()='Solutions'])[2]");
	By solountionEnterPrise = By.xpath("(//a[text()='Solutions']//following::span[text()='Enterprise'])[2]");
	By platform = By.xpath("(//a[text()='Platform'])[2]");
	By platformMobileApptesting = By.xpath("(//span[text()='Mobile App Testing'])[1]']");
	
	
	
	
	
	
	public WebElement getSignIn() {
		// TODO Auto-generated method stub
		return driver.findElement(signIn);		
	}

	public WebElement getPricing() {
		// TODO Auto-generated method stub
		return driver.findElement(pricing);		
	}
	
	public WebElement getTryItFree() {
		// TODO Auto-generated method stub
		return driver.findElement(tryItFree);		
	}
	
	public WebElement getSolutions() {
		// TODO Auto-generated method stub
		return driver.findElement(solutions);		////p[text()='Solutions']//following::span[text()='Enterprise']
	}
	public void getScrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,7500)", "");
	}
	public WebElement getEnterprise() {
		// TODO Auto-generated method stub
		return driver.findElement(solountionEnterPrise);		
	}
	public WebElement getPlatform() {
		// TODO Auto-generated method stub
		return driver.findElement(platform);		
	}
	public WebElement getMobileAppTesting() {
		// TODO Auto-generated method stub
		return driver.findElement(platformMobileApptesting);		
	}

	
}
