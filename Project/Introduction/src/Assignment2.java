import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment2 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.cleartrip.com/");
//driver.findElement(By.id("DepartDate")).click();
driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']/button")).click();
//driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
//WebElement adult=driver.findElement(By.id("Adults"));
//Select s =new Select(adult);
//s.selectByIndex(2);
//WebElement ch=driver.findElement(By.id("Childrens"));
//Select s1 =new Select(ch);
//s1.selectByIndex(2);
//driver.findElement(By.xpath("//a[@title='More search options']")).click();
//driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
//driver.findElement(By.id("SearchBtn")).click();
//System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
}
}
