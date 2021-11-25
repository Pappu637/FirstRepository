

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class SuccessfullCompleteFlow {

	public static String originCityXpath = "(//input[@placeholder='Select Origin City'])[1]";
	public static String originCity = "Kolkata";
	public static String destinationCityXpath = "(//input[@placeholder='Select Destination City'])[1]";
	public static String destinationCity = "Mumbai";
	public static String calenderXpath = "//label[@class='datepicker search-date open_sans_fonts mb-0 pointer ng-binding'][@ng-click='DPOnFocus(0);']";
	public static String dateXpath = "(//span[text()='November - 2021']//following::span[text()='21'])[1]";
	public static String travelDropdown = "//p[@ng-click='TravellerDropdown()']";
	public static String adult = "(//a[@ng-click='AdultIncrement(2);'])[1]";
	public static String child = "(//a[@ng-click='ChildIncrement(1);'])[1]";
	public static String infant = "(//a[@ng-click='InfantIncrement(0);'])[1]";
	public static String firstClass = "(//a[text()='Business'])[1]";
	public static String done = "(//input[@value='Done'])[1]";
	public static String search = "//input[@value='Search']";
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.happyfares.in/");
		
		
		click(driver,originCityXpath);
		Thread.sleep(2000);
		sendValue(driver,originCityXpath,originCity);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Select Origin City'])[1]")).sendKeys(Keys.TAB);
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
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("(//span[@class='text-center lbl-medium lbl-bold mt-4'])[1]")).click();
//		String msg1 = driver.findElement(By.xpath("((//span[@class='text-center lbl-medium lbl-bold mt-4'])[1]//span)[1]")).getText();
//		String msg2 = driver.findElement(By.xpath("((//span[@class='text-center lbl-medium lbl-bold mt-4'])[1]//span)[2]")).getText();
//		System.out.println(msg1);
//		System.out.println(msg2);
		
		driver.findElement(By.xpath("((//div[@class='col col-md-12 mt-1'])[1]//following::button[text()='Book'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='I have read and understood the important note.']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(2000);
driver.findElement(By.xpath("//div[@ng-show='ShowHidePromo']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//div[text()='Applied']")).click();
		
		
		
		
	}
	private static void click(WebDriver driver, String xPath) {
		driver.findElement(By.xpath(xPath)).click();
		
	}
	private static void sendValue(WebDriver driver, String xPath, String value) {
		driver.findElement(By.xpath(xPath)).sendKeys(value);
		
	}
}
