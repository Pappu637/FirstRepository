package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test
	public void Demo()
	{
		System.out.println("HI......");
		Assert.assertTrue(false);
	}
	
	@Test
	public void Demo2()
	{
		System.out.println("HELLO......");
	}
	
	@BeforeTest             //it's work in xml file, it's called before all test cases
	public void BefrTest()
	{
		System.out.println("I am first");
	}
	
	@AfterTest
	public void AftTest()
	{
		System.out.println("I am last");
	}

}
