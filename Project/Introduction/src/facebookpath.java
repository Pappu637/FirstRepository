import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebookpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disabled-notifications");
		WebDriver driver = new ChromeDriver(options); 
		driver.get("https://www.facebook.com/");
	/*	driver.findElement(By.xpath("//input[@type='text']"));
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("hello ");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@name='login']")).click();                 ....xpath */
		
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("hello");
		
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8515095885");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("rudratajmahal@1");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	Thread.sleep(5000);
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("disabled-notifications");
//	WebDriver driver2 = new ChromeDriver(options);
	}

}
