package ActionsClassInSelenium_41;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo3 {
	public static void main(String[] args) {
			
	//WAP to drop when you do not have destination.
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/draggable/");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'frame')]")));
	Actions act=new Actions(driver);
	
	WebElement src=driver.findElement(By.id("draggable"));
	act.dragAndDropBy(src, 200,100).perform();
	
	
	}
}