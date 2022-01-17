package com.saucelab.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucelab.qa.base.TestBase;
import com.saucelab.qa.pages.AutomatedTestingPage;
import com.saucelab.qa.pages.ContinuousTestingPage;
import com.saucelab.qa.pages.EnterprisePage;
import com.saucelab.qa.pages.LandingPage;
import com.saucelab.qa.pages.LiveTestingPage;
import com.saucelab.qa.pages.OpenSourceProjectsPage;
import com.saucelab.qa.pages.SolutionsPage;
import com.saucelab.qa.pages.StartUpsPage;

public class SolutionsTest extends TestBase{
	LandingPage landingPage;
	SolutionsPage sol;
	public SolutionsTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
		Thread.sleep(5000);
		 landingPage = new LandingPage();
		 landingPage.clickSolutions();
		 Thread.sleep(3000);
	}
	@Test
	public void solutions()
	{
		sol = new SolutionsPage();
		sol.getEnterprise();
		EnterprisePage ent = new EnterprisePage();
		Assert.assertEquals(ent.title.getText(),"ENTERPRISE SOLUTIONS");
		ent.clickOnStartTesting();
	}
	@Test
	public void startups()
	{
		sol = new SolutionsPage();
		sol.getStartups();
		StartUpsPage sta = new StartUpsPage();
		Assert.assertEquals(sta.title.getText(),"STARTUPS / SMB TEAM SOLUTIONS");
		sta.clickOnSeeThePlans();
	}
	@Test
	public void openSourceProjects()
	{
		sol = new SolutionsPage();
		sol.getOpenSourceProjects();
		OpenSourceProjectsPage opn = new OpenSourceProjectsPage();
		Assert.assertEquals(opn.title.getText(),"OPEN SOURCE PROJECTS");
		opn.clickOnGetOpenSauce();
	}
	@Test
	public void continuousTesting()
	{
		sol = new SolutionsPage();
		sol.getContinuousTesting();
		ContinuousTestingPage con = new ContinuousTestingPage();
		Assert.assertEquals(con.title.getText(),"CONTINUOUS TESTING");
		con.clickOnTryItFree();
		
	}
	@Test
	public void automatedTesting()
	{
		sol = new SolutionsPage();
		sol.getAutomatedTesting();
		AutomatedTestingPage Aut = new AutomatedTestingPage();
		Assert.assertEquals(Aut.title.getText(),"AUTOMATED TESTING");
		Aut.clickOnTryItFree();
	}
	@Test
	public void liveTesting()
	{
		sol = new SolutionsPage();
		sol.getliveTesting();
		LiveTestingPage liv = new LiveTestingPage();
		Assert.assertEquals(liv.title.getText(),"LIVE TESTING");
		liv.clickOnTryItFree();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
