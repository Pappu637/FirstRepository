import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/ ");
		Thread.sleep(2000);
		Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@name,'SeniorCitizenDiscount')]")).isSelected());
		//System.out.println(driver.findElement(By.xpath("//input[contains(@name,'SeniorCitizenDiscount')]")).isSelected());
		driver.findElement(By.xpath("//input[contains(@name,'SeniorCitizenDiscount')]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@name,'SeniorCitizenDiscount')]")).isSelected());
		//System.out.println(driver.findElement(By.xpath("//input[contains(@name,'SeniorCitizenDiscount')]")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[contains(@type,'checkbox')]")).size());

	}

}
