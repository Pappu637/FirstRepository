import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		
		//Boolean monthsChecker =driver.findElement(By.cssSelector("[class=\"datepicker-days\"] [class=\"datepicker-switch\"]")).getText().contains("December"); // it returns a boolean value

		while(!driver.findElement(By.cssSelector("[class=\"datepicker-days\"] [class=\"datepicker-switch\"]")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class=\"datepicker-days\"] [class=\"next\"]")).click();
		}
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		for(int i=0;i<driver.findElements(By.className("day")).size();i++) 
		{
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equals("14"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		
	}

}
