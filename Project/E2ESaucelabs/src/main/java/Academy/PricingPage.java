package Academy;

import java.util.List;

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
	
	By allPlans = By.xpath("//div[@id='template__pricing']/section[4]/div/div//form");
	By planTitle = By.xpath("//div[@id='template__pricing']/section[4]/div/div//form//div[@class='plan-title']");
	
	By getStartedButton = By.xpath("//span[text()='Get Started']");
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
	public void getAllPlans(String planName) {
		List<WebElement> allPlanTitle = driver.findElements(planTitle);	
		System.out.println(allPlanTitle.size());
		for(int i=0;i<allPlanTitle.size();i++)
		{
			if(allPlanTitle.get(i).getText().contentEquals(planName))
			{
				//allPlanTitle.get(i).click();
				System.out.println(allPlanTitle.get(i).getText());
				driver.findElement(getStartedButton).click();	
				break;
			}
			//System.out.println(allPlanTitle.get(i).getText());
			//driver.findElement(planTitle);
			
		}
		}
	
}
