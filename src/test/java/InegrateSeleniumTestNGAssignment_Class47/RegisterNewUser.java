package InegrateSeleniumTestNGAssignment_Class47;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Helper_Class42.Utility;

public class RegisterNewUser {		
		WebDriver driver=null;

		@BeforeClass
		   public void setupMethod() {
			System.out.println("running before class.");
			  driver=Helper_Class42.Utility.StartBrowser("chrome", "https://freelance-learn-automation.vercel.app/login");   
		   }

	@Test
	public void registerNewUserWithValidDetails() {	
		driver.findElement(By.xpath("//a[text()='New user? Signup']")).click();
		Assert.assertEquals(true, driver.getCurrentUrl().contains("signup"));
		
		boolean disbaled=driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
		Assert.assertFalse(disbaled, "sign up is enabled.");
		
		driver.findElement(By.id("name")).sendKeys("test1");
		driver.findElement(By.id("email")).sendKeys("test3993@email.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.xpath("//label[text()='C#']")).click();
		driver.findElement(By.xpath("//input[@value='Male']")).sendKeys("test1");
		
		Select sl=new Select(driver.findElement(By.id("state")));
		sl.selectByVisibleText("Assam");
		driver.findElement(By.xpath("//option[@value='Playing']")).click();
		
		//Actions ac=new Actions(driver);
		//ac.scrollToElement(driver.findElement(By.xpath("//button[text()='Sign up']")));
		
		WebElement ele=driver.findElement(By.xpath("//button[text()='Sign up']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",ele);
		Helper_Class42.Utility.waitForSeconds(2);
		ele.click();
		
		boolean enabled=driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
		Assert.assertTrue(enabled, "sign up is enabled.");
		
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		Helper_Class42.Utility.waitForSeconds(2);
		
		String expected="Signup successfully, Please login!";
		String str=driver.findElement(By.xpath("//div[text()='Signup successfully, Please login!']")).getText();
		Assert.assertEquals(str, expected);
		System.out.println("new user registration is successful.");
	}
	
	@Test(priority=1)
    public void loginWithNewUser() {
				 
		 driver.findElement(By.id("email1")).sendKeys("test3993@email.com");
		 driver.findElement(By.id("password1")).sendKeys("test123");
		 driver.findElement(By.xpath("//button[text()='Sign in']")).click();	 
		 System.out.println("login with new user is successful.");
		 
		 String expected="Welcome test1 to Learn Automation Courses";
		 String wlc=driver.findElement(By.xpath("//h4[contains(text(),'Welcome')]")).getText();
		 Assert.assertEquals(wlc, expected);	
		 
		 driver.findElement(By.xpath("//img[@alt='menu']")).click();
		 driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		 Helper_Class42.Utility.waitForSeconds(2);
		 
		 Assert.assertEquals(true, driver.getCurrentUrl().contains("login"));
		 System.out.println("logout with new user is successful.");
	}
	
	@AfterClass
	public void teardown() {
		System.out.println("runing after class.");
		Utility.quitBrowser(driver);	
	}
}