package ActionsClassInSelenium_41;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo4 {
	public static void main(String[] args) {
	
//WAP where you first get the current x and y co-ordinates and then move to desired location.
// relative change of the location.
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/draggable/");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'frame')]")));
	Actions act=new Actions(driver);
	
	WebElement src=driver.findElement(By.id("draggable"));
	  int x=src.getLocation().getX();
	  int y=src.getLocation().getY();
    
	//act.dragAndDropBy(src, x+100,y+50).perform();
	
	//same step with click and hold, move and then drop.
	//can be an alternative of above and we have advantage of adding pause() method here.
	act.clickAndHold(src).moveByOffset(x+100, y+50).pause(2000).release().build().perform();
	//x and y is the coordinate of source element here.
	driver.quit();
	}
}