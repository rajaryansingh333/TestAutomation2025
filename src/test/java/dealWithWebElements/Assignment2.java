package dealWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) {		
		WebDriver driver=new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		if(driver.getTitle().contains("HRM")){
			System.out.println("title contains HRM as expected.");
		}
		else{
			System.out.println("title does not contains HRM on the active page");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.className("oxd-button")).click();
		
		if(driver.getCurrentUrl().contains("dashboard")) {
			System.out.println("url contains -'dashboard'");
		}
		else {
			System.out.println("url does not contains -'dashboard'");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout\']")).click();		
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		if(driver.findElement(By.xpath("//h5[text()='Login']")).getText().contains("Login")) {
			System.out.println("User is successfully logged out");
		}
		else {
			System.out.println("User is not on login page");
		}
		driver.quit();
	}
}
