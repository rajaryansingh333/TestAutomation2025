package OrangeHRM;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignment1 {
	public static void main(String[] args) {
	  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//get price of all item.
		List<WebElement> lst=driver.findElements(By.xpath("//div[@id='inventory_container']//div[@class='inventory_list']//div[@class='inventory_item_price']"));
        
		for(WebElement val:lst) {	
			System.out.println(val.getText());	
		}	
		//find all the add to cart button.
		List<WebElement> lst2=driver.findElements(By.xpath("//div[@id='inventory_container']//button[text()='ADD TO CART']"));
		for(WebElement val2:lst2) {	
			System.out.println(val2.getText());	
		}
		//find all the social media.
		List<WebElement> lst3=driver.findElements(By.xpath("//ul[@class='social']//li"));
		for(WebElement val3:lst3) {	
			System.out.println(val3.getText());	
		}
		//open the menu.
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> lst4=driver.findElements(By.xpath("//nav[contains(@class,'item-list')]//a"));
		
		for(WebElement val4:lst4) {	
			System.out.println(val4.getText());
		}
		//close the menu side window.
		driver.findElement(By.xpath("//button[text()='Close Menu']")).click();
		System.out.println("Program ends here: Menu window is closed.");
		
		
	}
}
