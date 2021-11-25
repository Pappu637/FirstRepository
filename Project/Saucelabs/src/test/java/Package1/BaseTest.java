package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

public static WebDriver driver = null;
	
	@BeforeSuite
	public void initialize()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://saucelabs.com/");
		
		
//		@AfterSuite
//		public void TeardownTest()
//		{
//			TestBaseTest.driver.quit();
//		}
	}
}
