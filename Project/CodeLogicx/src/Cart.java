import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		String[] dressNeeded={"Printed Summer Dress"};
		driver.findElement(By.id("search_query_top")).sendKeys(dressNeeded[0]);
		driver.findElement(By.name("submit_search")).click();
		//List<WebElement> allDresses = driver.findElements(By.cssSelector(".replace-2x.img-responsive"));
		List<WebElement> allDresses = driver.findElements(By.cssSelector(".product-name"));
		
		for(int i=0;i<allDresses.size();i++)
		{
		
			String[] name = new String[5];
			 name=allDresses.get(i).getText().split(" ");
			String formattedName = name[0];
			System.out.println(formattedName);
			List dressNeededList = Arrays.asList("Printed Summer Dress");
			
			//if((dressNeededList.contains(dressNeeded[0])))
			if(dressNeededList.contains(allDresses))
			{
				System.out.println("Inside...");
				//driver.findElements(By.cssSelector(".product-name")).get(i).click();
				driver.findElements(By.xpath("(//div[@class=\"product-container\"]) //a[@title=\"Blouse\"][@xpath=\"3\"]")).get(i).click();
				
				//driver.findElement(By.linkText("Add to cart")).click();
				//driver.findElements(By.xpath("//img[@title='Printed Summer Dress']")).get(i).click();
				//String c =driver.findElements(By.xpath("//img[@title='Printed Summer Dress']")).get(i).getText();
				//System.out.println(c);
				break;
			}
		}

	}

}
