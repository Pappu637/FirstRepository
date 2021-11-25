import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.linkText("Help")).click();
		System.out.println(driver.getTitle());
		
		Set<String> ids =driver.getWindowHandles(); //[Parentid,childid]
		Iterator<String> it =ids.iterator();
		String Parentid= it.next();
		String childid= it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.className("helpcenter-title")).getText());

	}

}
