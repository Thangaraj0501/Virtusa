package caseStudy.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class BaseClass {
	public WebDriver	driver;
	
	@Parameters("URL")
	@BeforeSuite
	public void setUp(String url) {
		
		driver= new ChromeDriver();	
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void tearDown() {
	driver.quit();
		}
		
}
