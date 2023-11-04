package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	WebDriverUtility w = new WebDriverUtility();
	public WebDriver driver;
	
	@BeforeSuite
	public void config_BS() {
		
	}
	
	@AfterSuite
	public void congif_AS() {
		
	}
	
	@BeforeClass
	public void config_BC() {
		driver = new ChromeDriver();
		w.maximize(driver);
		w.implicitWait(driver);
		
	}
	
	@AfterClass
	public void config_AC() {
//		driver.close();
	}
	
	@BeforeMethod
	public void config_BM() {
		driver.get(IPathConstants.appURL);
	}
	
	@AfterMethod
	public void config_AM() {
		
	}
}
