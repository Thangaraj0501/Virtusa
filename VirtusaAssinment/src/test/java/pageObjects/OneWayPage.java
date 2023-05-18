package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OneWayPage {

	WebDriver ldriver;
	
	public OneWayPage (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="fromCity")
	@CacheLookup
	WebElement clickFromCity;
	
	@FindBy(xpath="//input[@placeholder='From']")
	@CacheLookup
	WebElement enterFromCity;
	
	@FindBy(xpath="//p[text()='Chennai, India']")
	@CacheLookup
	WebElement selectFromCity;
	
	
	@FindBy(id="toCity")
	@CacheLookup
	WebElement clickToCity;
	
	@FindBy(xpath="//input[@placeholder='To']")
	@CacheLookup
	WebElement enterToCity;
	
	@FindBy(xpath="//p[text()='Mumbai, India']")
	@CacheLookup
	WebElement selectToCity;
	
	public void clickFromCity()
	{
		clickFromCity.click();
	}

	public void enterFromCity(String fromcity)
	{
		enterFromCity.sendKeys(fromcity);
	}
	
	public void selectFromCity()
	{
		selectFromCity.click();
	}

	
	public void clickToCity()
	{
		clickToCity.click();
	}

	public void enterToCity(String tocity)
	{
		enterToCity.sendKeys(tocity);
	}
	
	public void selectToCity()
	{
		selectToCity.click();
	}
}
