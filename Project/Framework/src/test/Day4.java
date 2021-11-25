package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day4 {

	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHomeLoan");
	}
	
	@Test(groups= {"smoke"})
	public void MobLoginHomeLoan()
	{
		System.out.println(" MobLoginHomeLoan......");
	}
	
	@BeforeSuite
	public void BfrSuite()
	{
		System.out.println(" I am no 1");
	}

}
