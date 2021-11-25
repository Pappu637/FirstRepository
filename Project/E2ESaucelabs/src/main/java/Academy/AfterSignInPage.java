package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AfterSignInPage {
			
	WebDriver driver;
	public AfterSignInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	//By account = By.xpath("//div[(text()='Account')]/..//div//div/*");//div[contains(text(),'Account')]/..//div//div/*
	By account = By.xpath("//div[contains(text(),'Account')]/..//div//div/*");
	//By account = By.xpath("//div[@id='app']//following::div[text()='Account']");
	By desktopAndMobile = By.xpath("//button[text()='Desktop and mobile browsers']");
	
	public WebElement getAccount() {
		return driver.findElement(account);
	}
	public void getHello() {
		System.out.println("Hello.........");
	}
	public WebElement getDesktopMobile() {
		return driver.findElement(desktopAndMobile);
	}
}
