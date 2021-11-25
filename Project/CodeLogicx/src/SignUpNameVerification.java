
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpNameVerification {
	public static String btnSignup = "//span[text()='Sign Up ']";
	public static String custSignUp = "//a[text()='Customer Signup']";
	public static String frmSignup = "(//form[@name='frmSignupForm'])[1]";
	public static String firstNameXpath = "(//input[@ng-model='Signup.FirstName'])[1]";
	public static String firstName = " ";
	public static String frmSignupForm = "(//form[@name='frmSignupForm'])[1]";
	public static String lastNameXpath = "(//input[@ng-model='Signup.LastName'])[1]";
	public static String lastName = "Sharma";
	public static String customerMobileXpath = "(//input[@ng-model='Signup.CustomerMobile'])[1]";
	public static String mobileNo = "6291205593";
	public static String customerEmailXpath = "(//input[@ng-model='Signup.EmailID'])[1]";
	public static String emailId = "mondalpappu637@gmail.com";
	public static String modalBodyXpath = "(//div[@class='modal-body'])[1]";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.happyfares.in/");
		click(driver,btnSignup);
		click(driver,custSignUp);
		click(driver,frmSignup);
		
		WebElement element =driver.findElement(By.xpath("(//select[@id='txtName'])[1]"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("Mr");
		
		sendValue(driver,firstNameXpath,firstName);
		sendValue(driver,lastNameXpath,lastName);
		sendValue(driver,customerMobileXpath,mobileNo);
		sendValue(driver,customerEmailXpath,emailId);
		driver.findElement(By.id("btnsignUp")).click();
		click(driver,modalBodyXpath);

		
//		String msg = driver.findElement(By.xpath("//div[@class='modal-body']//following::b")).getText();
//		System.out.println(msg);
		
//		driver.switchTo().alert();
		
	}
	private static void click(WebDriver driver, String xPath) {
		driver.findElement(By.xpath(xPath)).click();
		
	}
	private static void sendValue(WebDriver driver, String xPath, String value) {
		driver.findElement(By.xpath(xPath)).sendKeys(value);
		
	}

}

