import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Practice
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/ ");
 /*
		driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000L);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		*/
		
		// Code from Udemy
		driver.findElement(By.id("divpaxinfo")).click();

		   Thread.sleep(2000L);

		   /*int i=1;

		while(i<5)

		{

		driver.findElement(By.id("hrefIncAdt")).click();//4 times

		i++;

		}*/

		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

	//	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
