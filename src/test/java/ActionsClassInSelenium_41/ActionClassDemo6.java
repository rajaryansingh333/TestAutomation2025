package ActionsClassInSelenium_41;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo6 {
	public static void main(String[] args) throws InterruptedException {
			
	WebDriver driver=new ChromeDriver();
	driver.get("https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	Actions ac=new Actions(driver);
	ac.scrollToElement(driver.findElement(By.xpath("//textarea[text()='textarea']"))).perform();
	driver.findElement(By.xpath("//textarea[text()='textarea']")).clear();
	driver.findElement(By.xpath("//textarea[text()='textarea']")).sendKeys("text1");
	
	driver.quit();
	
	}
}

//elementNotIntractableException: element is not in view or enabled.
