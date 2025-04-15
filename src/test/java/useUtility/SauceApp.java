package useUtility;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Helper_Class42.Utility;

public class SauceApp {

	public static void main(String[] args) {
		WebDriver driver=Helper_Class42.Utility.StartBrowser("Chrome", "https://www.saucedemo.com/v1/",false);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Utility.waitForSeconds(2);    
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        Utility.quitBrowser(driver);
        
	}
}