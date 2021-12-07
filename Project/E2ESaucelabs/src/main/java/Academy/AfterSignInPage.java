package Academy;

import java.util.Iterator;
import java.util.Set;

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
	By desktopAndMobile = By.xpath("//button[text()='Desktop and mobile browsers']");//div[text()='Account']/../../ul/li[5]
	By logOut = By.xpath("//div[text()='Account']/../../ul/li[5]");
	By sauceApps = By.xpath("//div[text()='Sauce Apps']/../../*[2]");
	By sauceAppsVisual = By.xpath("//div[text()='Visual']");
	By requestDemo = By.xpath("(//a[text()='Request a demo'])[1]");
	
	public WebElement getAccount() {
		return driver.findElement(account);
	}
	public void getHello() {
		System.out.println("Hello.........");
	}
	public WebElement getDesktopMobile() {
		return driver.findElement(desktopAndMobile);
	}
	public WebElement getLogOut() {
		return driver.findElement(logOut);
	}
	public WebElement getSauceApps() {
		return driver.findElement(sauceApps);
	}
	public WebElement getVisual() {
		return driver.findElement(sauceAppsVisual);
	}
	public WebElement getRequestDemo() {
		return driver.findElement(requestDemo);
	}
	public void switchToChildWindow()
	{
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
	}
}



