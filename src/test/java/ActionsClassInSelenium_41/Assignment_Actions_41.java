package ActionsClassInSelenium_41;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_Actions_41 {
	public static void main(String[] args) throws InterruptedException {
	  
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions ac=new Actions(driver);
		
		driver.findElement(By.id("name")).click();
		ac.sendKeys("admin43").perform();
		ac.sendKeys(Keys.TAB).perform();
		
		driver.findElement(By.id("email")).click();
		ac.sendKeys("admin334@email.com").perform();
		ac.sendKeys(Keys.TAB).perform();
		
		driver.findElement(By.id("password")).click();
		ac.sendKeys("admin33@email.com").perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.TAB).perform();
		
		//to select first two Interests.
		ac.moveToElement(driver.findElement(By.xpath("//label[text()='Playwright']"))).click().perform();
		ac.sendKeys(Keys.TAB).perform();
		ac.moveToElement(driver.findElement(By.xpath("//label[text()='Selenium']"))).click().perform();
		
		//then to skip the rest for the options available for Interests.
		ac.sendKeys(Keys.TAB).perform();
		ac.sendKeys(Keys.TAB).perform();
		ac.sendKeys(Keys.TAB).perform();
		ac.sendKeys(Keys.TAB).perform();	
		ac.sendKeys(Keys.TAB).perform();
		
		//to select female gender.
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		
		//to reach and select the ASSAM state.
		ac.sendKeys(Keys.TAB).perform();
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		
		//to select the Hobbies.
		ac.sendKeys(Keys.TAB).perform();
		ac.keyDown(Keys.CONTROL).sendKeys("Playing").keyUp(Keys.CONTROL).build().perform();
		ac.keyDown(Keys.CONTROL).sendKeys("Swimming").keyUp(Keys.CONTROL).build().perform();
		
		//to submit.
		ac.sendKeys(Keys.TAB).perform();
		ac.sendKeys(Keys.ENTER).perform();
		
       System.out.println("account created successfully.");
		
	}
}