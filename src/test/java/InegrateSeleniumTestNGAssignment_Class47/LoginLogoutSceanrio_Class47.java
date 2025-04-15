package InegrateSeleniumTestNGAssignment_Class47;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Helper_Class42.Utility;

public class LoginLogoutSceanrio_Class47 {
	WebDriver driver=null;
	
	@Test
	public void loginWithValidSceanrio() {
	    driver.findElement(By.id("email1")).sendKeys("admin@email.com");
	    driver.findElement(By.id("password1")).sendKeys("admin@123");
	    driver.findElement(By.xpath("//button[text()='Sign in']")).click();	    
	    Helper_Class42.Utility.waitForSeconds(2);
	    System.out.println("login is successful.");
	    String expected="Welcome Admin Manager to Learn Automation Courses";
	    String wlc=driver.findElement(By.xpath("//h4[contains(text(),'Welcome')]")).getText();
	    Assert.assertEquals(wlc, expected);	    
	}
	
	@Test(dependsOnMethods="loginWithValidSceanrio")
	public void logoutFromApplication() {	
		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		Helper_Class42.Utility.waitForSeconds(2);
		System.out.println("logout is successful.");
		
		Assert.assertEquals(true, driver.getCurrentUrl().contains("login"));
		Helper_Class42.Utility.quitBrowser(driver);
		//why Utility class throws error when we put it outside of the method.
	}	
	
	@BeforeClass
	   public void setupMethod() {
		System.out.println("runing before class.");
		  driver=Helper_Class42.Utility.StartBrowser("chrome", "https://freelance-learn-automation.vercel.app/login");   
	   }
	
	@AfterClass
	public void teardown() {
		System.out.println("runing after class.");
		Utility.quitBrowser(driver);	
	}	
	
	
}