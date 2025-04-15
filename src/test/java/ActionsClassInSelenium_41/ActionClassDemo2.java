package ActionsClassInSelenium_41;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo2 {
	public static void main(String[] args) {
		
	//program with builder patterns.
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'frame')]")));
	Actions act=new Actions(driver);
	
	WebElement src=driver.findElement(By.id("draggable"));
	WebElement dest=driver.findElement(By.id("droppable"));	
	
	act.clickAndHold(src).pause(5000).moveToElement(dest).pause(3000).release().build().perform();
	//when u use 1 method just use perform() at last, when we use more than 1 method then-
	//use build() and perform();
	//pause() have unit in milliseconds.
	//if you do not give the element name it will always click and hold the current mouse location.
	// method 1-clickAndHold(src) and method 2-moveToElement(dest) and method 3-release().
	//pause() have value in unit of milliseconds. it do pause b/w actions we perform.
    
	/*
	 * Actions is a class and Action is a interface.
	 * how many pattern u have used.
	 * 1. Builder pattern - happens in Actions class.
	 * 2. POM pattern -happens in Framework.
	 * 3. Singleton design pattern - we hardly use them in Framework.
	 */
	System.out.println("program is working as expected.");
	driver.quit();
	}
}