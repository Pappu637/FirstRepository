import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
//	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver(); 
//	driver.get("https://rahulshettyacademy.com/dropdownsPractise/ ");
//	//drowdown with select tag  ---static dropdown
//	WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//	
//	Select dropdown = new Select(staticDropdown);
//	dropdown.selectByIndex(2);
//	System.out.println(dropdown.getFirstSelectedOption().getText());
//	dropdown.selectByVisibleText("USD");
//	System.out.println(dropdown.getFirstSelectedOption().getText());
//	driver.findElement(By.cssSelector("ui-state-default.ui-state-highlight.ui-state-active")).click();
//	
	
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/ ");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//Using Index ......Video 48
		
		/*driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); */
		
		
		
		//Using Parent-child relationship locator.....Video 49
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='GAU']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='CCU']")).click();
		
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//driver.findElement(By.className("ui-state-default ui-state-highlight ui-state-active"));
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']"));
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		
	}
}
