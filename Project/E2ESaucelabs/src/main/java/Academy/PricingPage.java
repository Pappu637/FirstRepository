package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PricingPage {

	public WebDriver driver;
	public PricingPage(WebDriver driver) {
		
		this.driver=driver;
	}
	

	
	By pricingTitle = By.xpath("(//h3[@class='supertitle '])[1]");
	By getStarted = By.xpath("(//div[@class='plan-content'])[2]//span[text()='Get Started']");
	
	public WebElement getPricingTitle() {
	// TODO Auto-generated method stub
		return driver.findElement(pricingTitle);	
	}
	
	public void getScrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}
	
	public WebElement getStarted() {
		// TODO Auto-generated method stub
			return driver.findElement(getStarted);	
		}
	
}
