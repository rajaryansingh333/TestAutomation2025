package ActionsClassInSelenium_41;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassCommonMethods {
	public static void main(String[] args) throws InterruptedException {
			
	WebDriver driver=new ChromeDriver();
	driver.get("https://freelance-learn-automation.vercel.app/login");
	driver.manage().window().maximize();
	
	Actions ac=new Actions(driver);
	
	//single click method.
	ac.click();
	//double click.
	ac.doubleClick(); //current mouse.
	//double click for a specific element.
	ac.doubleClick(driver.findElement(By.xpath("")));
	
	//right click on current mouse location.
	ac.contextClick();
	//right click for a specific element.
	ac.contextClick(driver.findElement(By.xpath("")));
	
	//scroll to the method.
	ac.scrollToElement(driver.findElement(By.xpath(""))).perform();	
	driver.quit();
	//this might not work then use java script executor.
	
	ac.scrollByAmount(200, 50); //source is not given.
	ac.scrollFromOrigin(null, 0, 0); //source is given.
	
	driver.quit();
	}
}

   

