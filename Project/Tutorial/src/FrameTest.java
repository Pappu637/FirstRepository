import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.className("demo-frame")).size());
		driver.switchTo().frame(0);//Using index
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));//using webElement
		//driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();// back in defaultContent......back in previous mode
		driver.findElement(By.linkText("Accept")).click();
		

	}

}
