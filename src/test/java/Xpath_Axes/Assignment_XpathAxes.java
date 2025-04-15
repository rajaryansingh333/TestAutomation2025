package Xpath_Axes;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_XpathAxes {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//verify login is successful.
		if(driver.getCurrentUrl().contains("inventory")) {
			System.out.println("login is successful.");
		}
		else {
			System.out.println("login is un-successful. please try again.");
		}		
		//1. add product to the cart for 'Sauce Labs Bike Light'
		//Q - why with following sibling it is moving to next container?
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']/ancestor::div[@class='inventory_item']//following-sibling::button[text()='ADD TO CART']")).click();
		
		//2. capture the price for 'Sauce Labs Bike Light'
		String price=driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']/ancestor::div[@class='inventory_item']//following-sibling::div/div[@class='inventory_item_price']")).getText();
		System.out.println("price for 'Sauce Labs Bike Light' is "+price);
		
		//3. add product to the cart for 'Sauce Labs Fleece Jacket'
        driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']/ancestor::div[@class='inventory_item']//following-sibling::button[text()='ADD TO CART']")).click();
		
		//4. capture the price for 'Sauce Labs Bike Light'
        String price2=driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']/ancestor::div[@class='inventory_item']//following-sibling::div/div[@class='inventory_item_price']")).getText();
		System.out.println("price for 'Sauce Labs Bike Light' is "+price2);
		
		//5.verify cart count.
		double count=Double.parseDouble(driver.findElement(By.xpath("//span[contains(@class, 'shopping_cart_badge')]")).getText());
		if(count==2) {
			System.out.println("cart count is "+count+" as expected.");
		}
		else {
			System.out.println("cart count is not as expected. "+count);
		}
		
		// 6.processed to checkout.
		driver.findElement(By.xpath("//a[contains(@class, 'shopping_cart_link')]")).click();
		driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
		
		//7.enter the cust details.
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Fname");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Lname");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("560101");
		driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
		
		// 8.verify the total price.
		System.out.println(driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText());
		
		//9. complete the purchase.
		driver.findElement(By.xpath("//a[text()='FINISH']")).click();
		System.out.println(driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']")).getText());
		
		//10. verify logout from the application.
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		if(driver.getCurrentUrl().contains("index.html")) {
			System.out.println("Logout is successful.");
		}
		else {
			System.out.println("Logout is not successful.");
		}
		
		System.out.println("End of the program.");
	}
}
