package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CustomerSignUp {
	//Required xPath
	public static String btnSignup = "//span[text()='Sign Up ']";
	public static String custSignUp = "//a[text()='Customer Signup']";
	public static String frmSignup = "(//form[@name='frmSignupForm'])[1]";
	public static String firstNameXpath = "(//input[@ng-model='Signup.FirstName'])[1]";
	public static String frmSignupForm = "(//form[@name='frmSignupForm'])[1]";
	public static String lastNameXpath = "(//input[@ng-model='Signup.LastName'])[1]";
	public static String customerMobileXpath = "(//input[@ng-model='Signup.CustomerMobile'])[1]";
	public static String customerEmailXpath = "(//input[@ng-model='Signup.EmailID'])[1]";
	public static String modalBodyXpath = "(//div[@class='modal-body'])[1]";
	public static String title = "(//select[@id='txtName'])[1]";

	
	//Required Data
	public static String dtfirstName = "Ravi";
	public static String dtlastName = "Sharma";
	public static String dtmobileNo = "6291205593";
	public static String dtemailId = "mondalpappu637@gmail.com";
	public static String dtTitle = "Mr";
	public static String dtmobileNo2 = "9291205593";
	
	private static void click(WebDriver driver, String xPath) {
		driver.findElement(By.xpath(xPath)).click();
		
	}
	private static void sendValue(WebDriver driver, String xPath, String value) {
		driver.findElement(By.xpath(xPath)).sendKeys(value);
		
	}
	
	private void selectByDropdown(WebDriver driver, String xPath, String value) {
		WebElement element =driver.findElement(By.xpath(xPath));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(value);
		
	}
	@Test
	public void existingSignUp() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.happyfares.in/");
		click(driver,btnSignup);
		click(driver,custSignUp);
		click(driver,frmSignup);
		selectByDropdown(driver,title,dtTitle);
		sendValue(driver,firstNameXpath,dtfirstName);
		sendValue(driver,lastNameXpath,dtlastName);
		sendValue(driver,customerMobileXpath,dtmobileNo);
		sendValue(driver,customerEmailXpath,dtemailId);
		driver.findElement(By.id("btnsignUp")).click();
		click(driver,modalBodyXpath);
		String msg = driver.findElement(By.xpath("//div[@id='DivErrorMsg']//b[1]")).getText();
		System.out.println(msg);
			
	}
	
	
	@Test
	public void newSignUp() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.happyfares.in/");
		click(driver,btnSignup);
		click(driver,custSignUp);
		click(driver,frmSignup);
		selectByDropdown(driver,title,dtTitle);
		sendValue(driver,firstNameXpath,dtfirstName);
		sendValue(driver,lastNameXpath,dtlastName);
		sendValue(driver,customerMobileXpath,dtmobileNo2);
		sendValue(driver,customerEmailXpath,dtemailId);
		driver.findElement(By.id("btnsignUp")).click();
		click(driver,modalBodyXpath);
		String msg = driver.findElement(By.xpath("//div[@id='DivErrorMsg']//b[1]")).getText();
		System.out.println(msg);
			
	}
	
	

}
