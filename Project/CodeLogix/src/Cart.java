import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("printed dress");
		driver.findElement(By.name("submit_search")).click();

	}

}
