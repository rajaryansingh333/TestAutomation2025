package AllElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_CreateNewAccount {
	public static void main(String[] args) {	
	 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	 driver.manage().window().maximize();
	 
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 if(driver.getTitle().contains("demo")) {
		System.out.println("Title contains demo as expected."); 
	 }
	 else {
		 System.out.println("Title does not contains demo.");
	 }
	 
	 if(driver.getCurrentUrl().contains("register")) {
		 System.out.println("current url contains register in it as expected.");
	 }
	 else {
		 System.out.println("current url does not contains register.");
	 }
	 
	 if((driver.findElement(By.id("gender-male")).isSelected()==false) && (driver.findElement(By.id("gender-female")).isSelected()==false)) {
		 System.out.println("None of the gender is currently selected.");
	 }
	 
	 driver.findElement(By.id("gender-male")).click();
	 driver.findElement(By.id("FirstName")).sendKeys("testFname");
	 driver.findElement(By.id("LastName")).sendKeys("testLname");
	 driver.findElement(By.id("Email")).sendKeys("test"+System.currentTimeMillis()+"@gmail.com");
	 
	 driver.findElement(By.id("Company")).sendKeys("Company1");
	 
	 if(driver.findElement(By.id("Newsletter")).isSelected()) {	 
		 System.out.println("New letter is by default selected.");
		 driver.findElement(By.id("Newsletter")).click();
	 }
	 else {
		 System.out.println("New letter is by default not selected.");
	 }
	 
	 driver.findElement(By.name("Password")).sendKeys("password1");
	 driver.findElement(By.id("ConfirmPassword")).sendKeys("password1");     		
	 driver.findElement(By.id("register-button")).click();	

	}
}
