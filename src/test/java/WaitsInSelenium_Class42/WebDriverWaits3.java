package WaitsInSelenium_Class42;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper_Class42.Utility;

public class WebDriverWaits3 {
	public static void main(String[] args) {
	
		WebDriver driver=Utility.StartBrowser("Chrome", "https://freelance-learn-automation.vercel.app/practise");
		//web-driver wait is child class of fluent wait.
		
		WebDriverWait wdriver=new WebDriverWait(driver, Duration.ofSeconds(15));
		//wdriver.until(ExpectedConditions.elementToBeClickable(""));
		
		//returns boolean.
		wdriver.until(ExpectedConditions.urlContains("Confirm"));

		//returns boolean.
		wdriver.until(ExpectedConditions.titleContains("selenium"));
		
		//returns boolean.
		wdriver.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		
		//returns boolean.
		wdriver.until(ExpectedConditions.textToBePresentInElementLocated(null, null));
		
		//returns boolean
		wdriver.until(ExpectedConditions.textToBe(By.xpath(""), "policy id"));
		
		//returns boolean //when we are dealing with dynamic alerts/tabs/frams etc.
		wdriver.until(ExpectedConditions.numberOfWindowsToBe(0));
		//when we click on a button and it's pops up 2 or more than 2 windows or tabs.
				
		wdriver.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		//has to be present+visible+enabled.
		
		wdriver.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("")));
		
		
		//loader issue: either we get blank page, or loader or some text to wait..
	}
}

