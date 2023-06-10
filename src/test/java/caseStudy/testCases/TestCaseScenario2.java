package caseStudy.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import caseStudy.pageObjects.Scenario2Flipkart;

public class TestCaseScenario2 extends BaseClass{
	
	@Test
	public void Scenario_2() throws InterruptedException, IOException {
		Scenario2Flipkart test=new Scenario2Flipkart(driver);
		test.closeLogin();
		if (test.imgCheck()) {
			System.out.println("Flipkart logo is present on the left side of the top.");
			Assert.assertTrue(true);
		} else {
            System.out.println("Flipkart logo is not present on the left side of the top.");
            Assert.assertTrue(false);
		}
		test.enterSearchValue("iphone 14");
		test.clickSearch();		
		System.out.println("Search result in first page: " + test.searchCount());
		test.clickFirstResult();
		String linkname = test.getTextFirstLink();
		
		String winHandleBefore = driver.getWindowHandle();

		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		//Verify that navigated to the right page and title of the Page.

		Assert.assertEquals(linkname,test.getTextFirstOpenLink());
	

		// Close the new window, if that window no more required
		driver.close();

		
		driver.switchTo().window(winHandleBefore);

		
	
}
}
