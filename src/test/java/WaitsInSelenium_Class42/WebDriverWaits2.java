package WaitsInSelenium_Class42;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper_Class42.Utility;

public class WebDriverWaits2 {
	public static void main(String[] args) {
	
		WebDriver driver=Utility.StartBrowser("Chrome", "https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		//web-driver wait is child class of fluent wait.
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		WebDriverWait wdriver=new WebDriverWait(driver, Duration.ofSeconds(15));
		Alert art= wdriver.until(ExpectedConditions.alertIsPresent());
		String txt=art.getText();
		
		if(txt.contains("Selenium WebDriver Tutorials")) {
			System.out.println("Alert is present: "+txt);
		}
		else {
			System.out.println("Alert is not present.");
		}	
		Utility.quitBrowser(driver);

	}
}
