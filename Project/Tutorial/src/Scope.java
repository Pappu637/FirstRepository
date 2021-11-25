import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1.Give me the counts of links on the page 
		//2.Count of Footer Section
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3.count of links on column section under footer
		WebElement coulumnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coulumnDriver.findElements(By.tagName("a")).size());
		
		//4. click on each link in the column and check if the pages are opening.
		for (int i=1;i<coulumnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnlinkTable = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coulumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnlinkTable);
			Thread.sleep(5000);
		}  // opens all the tab
			
			Set<String> abc =driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext())      // .hasNext() is used to check ... is there any window present ?
			{
				// it.next(); it.next is window id
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
		
		
		

	}

}
