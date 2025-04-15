package dealWithWebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIntractions {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		driver.findElement(By.id("password1")).sendKeys("admin@123");
		/*
		 * Standard credentials:
		 * user name: admin@email.com
		 * password: admin@123
		 */	
		driver.findElement(By.className("submit-btn")).click();
		driver.quit();
		
		/* Locators: 
		 * 1. Direct locator:
		 *    id
		 *    className
		 *    xpath
		 *    name
		 *    css
		 *    linktext
		 *    partiallinktext
		 *    tagname
		 *    
		 * 2. Relative Locators: (selenium 4 onwards)
		 *      above
		 *      below
		 *      nearby
		 *      left
		 *      right
		 * ***************************
		 * Web driver interface is represented by web driver, similarly each element on 
		 * a web page is represented by web element interface.
		 * 
		 *      
		 */				
	}
}