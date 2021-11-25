import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteFlow {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("Printed summer dress");
		driver.findElement(By.id("submit_search")).click();
		List<WebElement> listOfDresses = driver.findElements(By.xpath("//div[@class=\"product-container\"]"));
		System.out.println(listOfDresses.size());
	}
}
