package com.saucelab.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.saucelab.qa.base.TestBase;

public class CareersPage extends TestBase{

	public CareersPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//iframe[@id='careersCurrentPosition']") WebElement frame;
	@FindBy(xpath="//select[contains(@id,'offices-select')]") WebElement offices;
	
	public void getSwitchToFrame() {
		//driver.findElement(frame);
		driver.switchTo().frame(frame);
	}
	public void getSmallScrollDown() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		
	}
	
     public Select selectOffices() {
		
		Select objSelect =new Select(offices);
		return objSelect;
		//objSelect.selectByIndex(5);
	}
}
