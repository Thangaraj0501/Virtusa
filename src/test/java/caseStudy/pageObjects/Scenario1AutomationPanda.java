package caseStudy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class Scenario1AutomationPanda {

public WebDriver ldriver;
	
	public Scenario1AutomationPanda(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(new AjaxElementLocatorFactory(rdriver, 60), this);
	}
	
	@FindBy(xpath="//a[text()='Contact']")
	WebElement clickContactLink;
	
	@FindBy(name="g3-name")
	WebElement setName;
	
	@FindBy(name="g3-email")
	WebElement setEmail;
	
	@FindBy(name="g3-message")
	WebElement setMessage;
		
	@FindBy(xpath="//strong[text()='Contact Me']")
	WebElement ClickContactMe;
	
	@FindBy(id="contact-form-success-header")
	WebElement confirmMessage;
		
	public void clickContactLink() {
		clickContactLink.click();
	}
		
	public void enterName(String name) {
		setName.sendKeys(name);
	}
	
	public void enterEmail(String email) {
		setEmail.sendKeys(email);
	}
	
	public void enterMessage(String message) {
		setMessage.sendKeys(message);
	}
		
	public void clickContactMe() {
		ClickContactMe.click();
	}
	
	public String confirmCheck() {
		return confirmMessage.getText();
	}
}
