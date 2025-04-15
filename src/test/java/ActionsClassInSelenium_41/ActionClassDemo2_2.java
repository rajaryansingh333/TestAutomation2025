package ActionsClassInSelenium_41;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo2_2 {
	public static void main(String[] args) {
		
	//program without builder patterns.
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'frame')]")));
	Actions act=new Actions(driver);
	
	WebElement src=driver.findElement(By.id("draggable"));
	WebElement dest=driver.findElement(By.id("droppable"));	
	
	act.clickAndHold(src)
	.pause(5000)
	.moveToElement(dest)
	.pause(3000)
	.release()
	.build()
	.perform();
	
	driver.quit();
	}
}