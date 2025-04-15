package useUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Helper_Class42.Utility;

public class callActionAcceptMethod {

	public static void main(String[] args) {
		
		WebDriver driver=Helper_Class42.Utility.StartBrowser("Chrome", "https://mail.rediff.com/cgi-bin/login.cgi");
		Utility.waitForSeconds(2);
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		
		//Utility.takeScreenshots(driver); // not able to take SS of alert.
		
		String alertText=Utility.acceptCaptureAlertText(driver);
		System.out.println("Alert text message was: "+alertText);

		System.out.println("Accept method call ends here and Dismiss metho call begins here.");
		
		Helper_Class42.Utility.StartBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		Utility.waitForSeconds(2);
		driver.findElement(By.name("email1")).sendKeys("admin@email.com");
		driver.findElement(By.name("password1")).sendKeys("admin@123");
		Utility.waitForSeconds(2);
		driver.findElement(By.xpath("//button[text()='Add New Category ']")).click();
				
		Utility.dismissCaptureAlertText(driver);
		//noalertpresentexception - will through if we try to perform any activity on page after alert.
		
		//robot class -to take SS of a alert.
		// https://learn-automation.com/window-screenshot-using-robot-class-in-selenium/
		Utility.takeScreenshots(driver);		
		Utility.quitBrowser(driver);
	}

}
