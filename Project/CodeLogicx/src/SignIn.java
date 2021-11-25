import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {

	public static String signInXpath = "//span[text()='Sign In ']";
	public static String cstLogInXpath = "//a[text()='Customer Login']";
	public static String frmLogInFormXpath = "(//form[@name='frmLoginForm'])[1]";
	public static String logInCstIdXpath = "//input[@id='txtMobileNumber1']";
	public static String logInCstPassXpath = "//input[@id='txtPassword1']";
	public static String cstId = "6291205593";
	public static String cstPass = "Gvdjea+023";
	
	public static void main(String[] args) throws InterruptedException {

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
		

	}
	
	private static void click(WebDriver driver, String xPath) {
		driver.findElement(By.xpath(xPath)).click();
		
	}
	private static void sendValue(WebDriver driver, String xPath, String value) {
		driver.findElement(By.xpath(xPath)).sendKeys(value);
		
	}

}
