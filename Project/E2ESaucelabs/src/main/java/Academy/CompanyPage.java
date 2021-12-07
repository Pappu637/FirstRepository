package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CompanyPage {

	public WebDriver driver;
	public CompanyPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By offices= By.xpath("//select[contains(@id,'offices-select')]");
	By fullstackEngineer= By.xpath("//a[text()='Full Stack Engineer ']");
	By supertitle= By.xpath("//h1[@class='supertitle ']");
	By frame= By.xpath("//iframe[@id='careersCurrentPosition']");
	By supportEngineer= By.xpath("//a[text()='Support Engineer']");
	
	
	public void getScrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
	}
	public Select selectOffices() {
		
		Select objSelect =new Select(driver.findElement(offices));
		return objSelect;
		//objSelect.selectByIndex(5);
	}
	public WebElement getFullstackEngineer() {
		return driver.findElement(fullstackEngineer);
	}
	public void getSmallScrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}
	public WebElement getCompanyCareerTitle() {
		return driver.findElement(supertitle);
	}
	public void getSwitchToFrame() {
		//driver.findElement(frame);
		driver.switchTo().frame(driver.findElement(frame));
	}
	public WebElement getSupportEngineer() {
		return driver.findElement(supportEngineer);
	}
	
	
}
