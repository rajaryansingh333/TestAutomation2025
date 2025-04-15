package ActionsClassInSelenium_41;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
	public static void main(String[] args) {
		
	 /*
	  * Any activity that include keyboard and mouse we will be using Actions class.
	  * click, doubleclick, dragNdrop, scrolling.
	  * avoid keyboard activity are not very stable and it's usages differ from OS to OS.
	  * not very reliable on cross browser and cross platforms.
	  * example: as soon as user press the enter form should be submitted.	
	 */
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/");
	//builder pattern is when one class have multiple methods and that method return same class.
	
	//driver.switchTo().frame(1);
	driver.switchTo().frame(driver.findElement(By.id("//iframe[contains(@class,'frame')]")));
	Actions act=new Actions(driver);
		
	//when method return current class object we called it builder pattern.
	//builder pattern means we can build no. of patterns without creating multiple objects.
	//you don't need to create multiple object. using the same object you can call multiple methods and one go
	// and at the end you call perform.
	
	WebElement ele=driver.findElement(By.id("draggable"));
	WebElement ele2=driver.findElement(By.id("droppable"));	
	
	act.dragAndDrop(ele, ele2).perform();
	//perform() is mandatory.
	//this Actions class is mostly used in sales-force, MS 360 dynamic, sap/oracle apps.
	//CRM and ERP related activity.
	//drag and drop = click and hold and mover over , wait and release.
		
	}
}