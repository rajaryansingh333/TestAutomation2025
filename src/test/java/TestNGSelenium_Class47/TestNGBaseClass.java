package TestNGSelenium_Class47;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Helper_Class42.Utility;

public class TestNGBaseClass {
   
	// before class will be ran before any test method is executed.
	// (before the class which contains all the method).
	
	WebDriver driver;
	
	//parameter is global. parameter is coming from xml configuration that can be changed.
	// test method level data depend on application.
	@Parameters("Browser")
	@BeforeClass
    public void setup(@Optional("chrome") String browserName) {		
		
		//setup(pre-condition) and tear-down(post-condition) activities.
    	System.out.println("runing before class.");
    	driver=Utility.StartBrowser(browserName, "https://freelance-learn-automation.vercel.app/login");
	}
	
	// after class will be ran before any test method is executed.
	// (after the all the method of the class is executed).
	
	@AfterClass
	public void teardown() {
		System.out.println("runing after class.");
		Utility.quitBrowser(driver);	
	}
}