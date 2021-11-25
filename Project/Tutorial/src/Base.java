import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		//implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w =new WebDriverWait(driver,5);
		
		
		String[] itemsNeeded={"Cucumber","Brocolli","Beetroot"}; 
		System.out.println(itemsNeeded[0]);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		Base obj = new Base();
		obj.addItems(driver,itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait
	
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
		System.out.println(	driver.findElement(By.cssSelector("span.promoInfo")).getText());
	
		
		
		
	
	}

		public void addItems(WebDriver driver,String[] itemsNeeded) {
			int j=0;
			//List<WebElement> Products = driver.findElements(By.className("product-name"));
			List<WebElement> Products=driver.findElements(By.cssSelector("h4.product-name"));
			for(int i=0;i<Products.size();i++)
			{
				//Brocolli - 1 kg
				//Brocolli ,       1 kg
				
				 
				String[] name=Products.get(i).getText().split("-");
				String formattedName = name[0].trim();
				//format it to get actual vegetable name
				//check whether name you extracted is present in array or not
				//convert array into arraylist for easy search
				List itemsNeededList = Arrays.asList(itemsNeeded);
				//if(name.contains("Cucumber"))
				if(itemsNeededList.contains(formattedName))
				{
					j++;
					//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					//break;
					if(j==itemsNeeded.length)
						break;
				}
				
				
			}



		}
}
