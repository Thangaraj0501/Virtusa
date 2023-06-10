package caseStudy.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Scenario2Flipkart {

	WebDriver ldriver;
	
	public Scenario2Flipkart(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 60), this);
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	WebElement closeLogin;

	@FindBy(xpath="//img[@title='Flipkart']")
	WebElement imgCheck;
	
	@FindBy(name="q")
	WebElement enterSearchValue;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickSearch;
	
	@FindBy(xpath="//div[@class = '_4rR01T']")
	List <WebElement> listOfProducts;
	
	@FindBy(xpath="//h1")
	WebElement getTextOpenLink;
	
	public void closeLogin () {
		closeLogin.click();
	}
	
	public boolean imgCheck () {
		return imgCheck.isDisplayed();
	}
		
	public void enterSearchValue (String searchval) {
		enterSearchValue.sendKeys(searchval);
	}
	
	public void clickSearch () {
		clickSearch.click();
	}
	
	public int searchCount () {
		return listOfProducts.size();
	}
	
	public void clickFirstResult () {
		listOfProducts.get(0).click();
	}
	
	public String getTextFirstLink () {
		return listOfProducts.get(0).getText();
	}
	
	public String getTextFirstOpenLink () {
		return getTextOpenLink.getText();
	}
	
	
}
