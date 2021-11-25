import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code-
			//Create Driver object for chrome  Browser
			//We will strictly implement methods of webdriver
		/*	Class name = X
					 
					X driver = new X();*/
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("This is my first code");
	}

}
 