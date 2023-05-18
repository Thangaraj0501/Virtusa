package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.OneWayPage;

public class MakeMyTripFireFox extends BaseClass {


	@Test
	public void checkLogo() {	
		
		boolean isDisplayed= driver.findElement(By.xpath("//a[@data-cy='mmtLogo']")).isDisplayed();
		if (isDisplayed) {
			System.out.println("Logo Displayed");
		} else {
			System.out.println("Logo NOT dislayed");			
		}
		
	}

}
