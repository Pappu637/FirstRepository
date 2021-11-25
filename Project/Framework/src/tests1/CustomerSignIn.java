package tests1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CustomerSignIn {
	
	//Required xPath
	public static String signInXpath = "//span[text()='Sign In ']";
	public static String cstLogInXpath = "//a[text()='Customer Login']";
	public static String frmLogInFormXpath = "(//form[@name='frmLoginForm'])[1]";
	public static String logInCstIdXpath = "//input[@id='txtMobileNumber1']";
	public static String logInCstPassXpath = "//input[@id='txtPassword1']";
	
	//Required data
	public static String dcstId = "6291205593";
	public static String dcstId2 = "6291205591";
	public static String dcstPass = "Gvdjea+023";
	public static String dcstPass2 = "Gvdjea+024";
	
	private static void click(WebDriver driver, String xPath) {
		driver.findElement(By.xpath(xPath)).click();	
	}
	private static void sendValue(WebDriver driver, String xPath, String value) {
		driver.findElement(By.xpath(xPath)).sendKeys(value);	
	}
	
	@Parameters({"URL"})
	@Test
	public void successfullyLogin(String urlName) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(urlName); //https://www.happyfares.in/
		Thread.sleep(2000);
		click(driver,signInXpath);
		click(driver,cstLogInXpath);
		click(driver,frmLogInFormXpath);
		sendValue(driver,logInCstIdXpath,dcstId);
		sendValue(driver,logInCstPassXpath,dcstPass);		
		driver.findElement(By.id("btnLogin")).click();	
	}
	@Test
	public void passwordVerification() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.happyfares.in/");
		Thread.sleep(2000);
		click(driver,signInXpath);
		click(driver,cstLogInXpath);
		click(driver,frmLogInFormXpath);
		sendValue(driver,logInCstIdXpath,dcstId);
		sendValue(driver,logInCstPassXpath,dcstPass2);		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		String errMsg = driver.findElement(By.xpath("//div[@id='DivErrorMsg']//b[1]")).getText();
		System.out.println(errMsg);
	}
	
	@Test
	public void mobileNumberVerification() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.happyfares.in/");
		Thread.sleep(2000);
		click(driver,signInXpath);
		click(driver,cstLogInXpath);
		click(driver,frmLogInFormXpath);
		sendValue(driver,logInCstIdXpath,dcstId2);
		sendValue(driver,logInCstPassXpath,dcstPass);		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		String errMsg = driver.findElement(By.xpath("//div[@id='DivErrorMsg']//b[1]")).getText();
		System.out.println(errMsg);
	}

}
