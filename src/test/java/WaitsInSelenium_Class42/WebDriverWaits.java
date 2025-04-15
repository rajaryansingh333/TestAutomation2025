package WaitsInSelenium_Class42;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper_Class42.Utility;

public class WebDriverWaits {
	public static void main(String[] args) {
		
	  /*smart dynamic wait way of handling sync issue.	
		script time out: wait time for any java script to be loaded in the back-end.
		by default selenium wait for 30 sec.
		
	    all these called as smart wait/gobal wait/universal wait.		
		Explicit wait is not a gobal wait. it's applied specific to element.
		this is also called as smart wait.
		type: wait-driver wait and fluent wait.
		both fall under same category of explicit wait.
		explicit wait -can we achieved by either of wait driver wait or fluent wait.			
		they are actually parent and child class.		
		waits are of only of two type-explicit wait and implicitly wait.
		*/		
		WebDriver driver=Utility.StartBrowser("Chrome", "https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		//web-driver wait is child class of fluent wait.
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		WebDriverWait wdriver=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element= wdriver.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		System.out.println(element.isDisplayed());
		Utility.quitBrowser(driver);
		
		//by default polling frequency interval is of 250 milliseconds in implicit wait.
		//by default polling frequency interval is of 500 milliseconds in explicit wait/web driver wait.
		//elementToBeClickable -> only when element is present+visible+enabled. -widely used method.
		//implicit wait only works with web element and check for present+visible. 
		//while explicit wait can work with web-element and alerts too. 
        		
	}
}
