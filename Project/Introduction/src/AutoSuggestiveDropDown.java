

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/ ");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		//using Enhanced for loop
		//Syntax :  for(int i:List_name)
		//System.out.println(options.size());
		for(WebElement option :options)
		{
		    //System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("India"))
			{
				System.out.println(option.getText());
				option.click();
				//System.out.println("hello.....");
				break;
			}
		    
		} 

		
		


	}

}
