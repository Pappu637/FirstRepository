package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void ploan() {
		System.out.println("Day2's method");
	}
	
	@Test(groups= {"smoke"})
	public void p2loan() {
		System.out.println("Day3's method");
	}
	
	@AfterMethod                  //it's work in class level, It will invoke first among the all methods in the class
	public void aftMethod() {
		System.out.println("after method");
	}
	
	@BeforeMethod
	public void bfrMethod() {
		System.out.println("before method");
	}
}
