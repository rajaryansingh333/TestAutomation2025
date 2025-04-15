package TestNGSelenium_Class47;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Helper_Class42.Utility;

public class TestNGFirstClass extends TestNGBaseClass {	
	//@BeforeMethod -we run this method before running every test method each time.
	//@AfterMethos -we run this method everyTime after running the Test method.	
	
	 @Test
     public void VerifyURL() {	
		String url=driver.getCurrentUrl();		
		Assert.assertTrue(url.contains("login")," Navigation to currect page is failed.");
	}
	
	@Test
	public void VerifyTitle() {	
		String title=driver.getTitle();		
		Assert.assertTrue(title.contains("Courses"), "Title is not appearing as expected");
	}
	@Test
	public void VerifyFooterLinks() {
		int expected=4;	
		int actual=driver.findElements(By.xpath("//div[contains(@class,'footer-inside-div')]//a")).size();
		Assert.assertEquals(actual, expected,"Footer link count is not matching");
		//error message will only display when assertion fails.		
	}	
}

//confusion b/w Test, Test Method??
