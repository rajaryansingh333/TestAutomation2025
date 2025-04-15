package WaitsInSelenium_Class42;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper_Class42.Utility;

public class WebDriverWaits4 {
	public static void main(String[] args) {
	
		WebDriver driver=Utility.StartBrowser("Chrome", "https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		//web-driver wait is child class of fluent wait.
		// please note that all the conditions wait interally behave as a loop only.
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		WebDriverWait wdriver=new WebDriverWait(driver, Duration.ofSeconds(15));
		Alert finalTxt=alertCondition(driver);
		
		String txt=finalTxt.getText();
		
		if(txt.contains("Selenium WebDriver Tutorials")) {
			System.out.println("Alert is present: "+txt);
		}
		else {
			System.out.println("Alert is not present.");
		}	
		Utility.quitBrowser(driver);	
	}
	
	//our customized methods.
	public static Alert alertCondition(WebDriver driver) {
		Alert alt=null;
		
		for(int i=0;i<15;i++) {						
			try {
				alt=driver.switchTo().alert();
				System.out.println("Alert found. "+alt);
				break;
			} catch (Exception e) {
				System.out.println("Alert is not yet present. waiting for Alert.");
			}
			Utility.waitForSeconds(1);
		}
		return alt;
	}
}

