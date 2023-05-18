package Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
 
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)	{
				
		if (br.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (br.equals("firefox")) {
			driver=new FirefoxDriver();
		} else {
			System.out.println("Pls supply valid browser");
		}

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@title, 'notification-frame')]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("webklipper-publisher-widget-container-notification-close-div"))).click();	
		driver.switchTo().defaultContent();	
	}	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
