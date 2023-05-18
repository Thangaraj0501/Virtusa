package Test;

import org.testng.annotations.Test;

import pageObjects.OneWayPage;

public class MakeMyTripChrome extends BaseClass{

	@Test
	public void searchFlight() {
		OneWayPage page = new OneWayPage(driver);
		page.clickFromCity();
		page.enterFromCity("MAA");
		page.selectFromCity();
		page.clickToCity();
		page.enterToCity("BOM");
		page.selectToCity();
	}
}
