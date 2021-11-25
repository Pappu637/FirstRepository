import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllCompleteFlow {

	
	public static String signInXpath = "//span[text()='Sign In ']";
	public static String cstLogInXpath = "//a[text()='Customer Login']";
	public static String frmLogInFormXpath = "(//form[@name='frmLoginForm'])[1]";
	public static String logInCstIdXpath = "//input[@id='txtMobileNumber1']";
	public static String logInCstPassXpath = "//input[@id='txtPassword1']";
	
	public static String originCityXpath = "(//input[@placeholder='Select Origin City'])[1]";
	public static String originCity = "Kolkata";
	public static String destinationCityXpath = "(//input[@placeholder='Select Destination City'])[1]";
	public static String destinationCity = "Mumbai";
	public static String calenderXpath = "//label[@class='datepicker search-date open_sans_fonts mb-0 pointer ng-binding'][@ng-click='DPOnFocus(0);']";
	public static String dateXpath = "(//span[text()='November - 2021']//following::td[text()='21'])[1]";
	public static String travelDropdown = "//p[@ng-click='TravellerDropdown()']";
	public static String adult = "(//a[@ng-click='AdultIncrement(2);'])[1]";
	public static String child = "(//a[@ng-click='ChildIncrement(1);'])[1]";
	public static String infant = "(//a[@ng-click='InfantIncrement(0);'])[1]";
	public static String firstClass = "(//a[text()='First Class'])[1]";
	public static String done = "(//input[@value='Done'])[1]";
	public static String search = "//input[@value='Search']";
	
	public static String cstId = "6291205593";
	public static String cstPass = "Gvdjea+023";
	
		
		public static String modalBodyXpath = "(//div[@class='modal-body'])[1]";
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.happyfares.in/");
			Thread.sleep(2000);
			click(driver,signInXpath);
			click(driver,cstLogInXpath);
			click(driver,frmLogInFormXpath);
			sendValue(driver,logInCstIdXpath,cstId);
			sendValue(driver,logInCstPassXpath,cstPass);		
			driver.findElement(By.id("btnLogin")).click();
			
			Thread.sleep(5000);
			click(driver,originCityXpath);
			Thread.sleep(2000);
			sendValue(driver,originCityXpath,originCity);
			Thread.sleep(2000);
			sendValue(driver,originCityXpath,Keys.TAB);
			//driver.findElement(By.xpath("(//input[@placeholder='Select Origin City'])[1]")).sendKeys(Keys.TAB);
			click(driver,destinationCityXpath);
			Thread.sleep(2000);
			sendValue(driver,destinationCityXpath,destinationCity);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Select Destination City'])[1]")).sendKeys(Keys.TAB);
			
			
			
			
		
			
			click(driver,calenderXpath);
			click(driver,dateXpath);
			Thread.sleep(2000);
			click(driver,travelDropdown);
			
			click(driver,adult);
			click(driver,child);
			click(driver,infant);

			click(driver,firstClass);
			click(driver,done);
			click(driver,search);
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[text()='Book'])[1]")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//span[text()='I have read and understood the important note.']")).click();
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			String price = driver.findElement(By.xpath("//h5[text()='Total Fare']//following::span[1]")).getText();
			System.out.println(price);
			

			
			
			
			
			
		}
		
		

	
	
	private static void click(WebDriver driver, String xPath) {
		driver.findElement(By.xpath(xPath)).click();
		
	}
	private static void sendValue(WebDriver driver, String xPath, String value) {
		driver.findElement(By.xpath(xPath)).sendKeys(value);
		
	}
	private static void sendValue(WebDriver driver, String xPath, Keys value) {
		driver.findElement(By.xpath(xPath)).sendKeys(value);
		
	}

}
