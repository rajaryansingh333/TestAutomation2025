package ParametersTestNG_Class48;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment_CrossBrowserTestingOrangeHRM {

	WebDriver driver=null;
	
	@Parameters("Browser")
	@BeforeClass
	public void setupPreClass(@Optional("Chrome") String browserName) {
		
		driver=Helper_Class42.Utility.StartBrowser(browserName, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
	    System.out.println("Browser launches successfully.");
	}
	
	@Test
	public void loginHRM() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Helper_Class42.Utility.waitForSeconds(2);
		
		String currentURL=driver.getCurrentUrl();	
		if(currentURL.contains("dashboard")) {
		     Reporter.log("login is successful: ", true);
		}
	}
	
	@Test(dependsOnMethods="loginHRM")
	public void logoutHRM() {
		
		Helper_Class42.Utility.waitForSeconds(2);
		driver.findElement(By.xpath("//p[text()='manda user']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Helper_Class42.Utility.waitForSeconds(2);
		
		String currentURL=driver.getCurrentUrl();		
		if(currentURL.contains("login")) {
		     Reporter.log("logout is successful: ", true);
		}
	}
	
	@AfterTest
	public void teardownHRM() {
		
		driver.quit();
		System.out.println("Browser quites successfully.");
	}	
	
}
