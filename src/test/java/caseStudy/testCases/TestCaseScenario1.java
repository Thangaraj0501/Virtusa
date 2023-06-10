package caseStudy.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import caseStudy.pageObjects.Scenario1AutomationPanda;

public class TestCaseScenario1 extends BaseClass{
	
	@Test
	public void Scenario_1() throws InterruptedException, IOException {
		Scenario1AutomationPanda test=new Scenario1AutomationPanda(driver);
		test.clickContactLink();
		if ((driver.getTitle()).equals("Contact | Automation Panda")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
		test.enterName("Thangaraj Arumugam");
		test.enterEmail("thangaraja@virtusa.com");
		test.enterMessage("Test Message");
		test.clickContactMe();
		if ((test.confirmCheck()).equals("Your message has been sent")) {
			
			Assert.assertTrue(true);
		}
			
		else {
			Assert.assertTrue(false);
		} 
}
}
