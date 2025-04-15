package ActionsClassInSelenium_41;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo5 {
	public static void main(String[] args) throws InterruptedException {
			
	WebDriver driver=new ChromeDriver();
	driver.get("https://freelance-learn-automation.vercel.app/login");
	driver.manage().window().maximize();
	
	Actions ac=new Actions(driver);
	
	driver.findElement(By.id("email1")).sendKeys("admin@email.com");	
	//single key operation.
	//ac.sendKeys(Keys.TAB).perform();
	
	//multiple key operation.	
	ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(2000);
	ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(2000);
	ac.sendKeys(Keys.TAB).perform();
	Thread.sleep(2000);
	ac.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(2000);
	ac.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	
	driver.quit();
	}
}