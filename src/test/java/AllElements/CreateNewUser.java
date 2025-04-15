package AllElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateNewUser {
	/*
	 * If some element is visible but still code is not able to recognize it then use
	 * .getsize().getWidth()>0 && .getsize().getLength()>0
	 * or
	 * element to be clickable to be true -wait
	 */
	
	public static void main(String[] args) {	
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		
		//behind the find element method wait until width and height is greater than zero. 
        System.out.println(driver.findElement(By.linkText("New user? Signup")).getSize().getWidth());
        System.out.println(driver.findElement(By.linkText("New user? Signup")).getSize().getHeight());
		driver.findElement(By.linkText("New user? Signup")).click();;		
		//driver.findElement(By.partialLinkText("New User"));
		
		/* Link Text vs Partial Link Text.
		 * both are case sensitive. but in link text exact match is a must though.
		 * it's not mandatory in case of partial link text.
		 */
		
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	driver.findElement(By.id("name")).sendKeys("FirstName");
	driver.findElement(By.id("email")).sendKeys("test"+System.currentTimeMillis()+"@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Password1");
	
	driver.findElement(By.xpath("//div[@class='interests-div']//label[text()='Selenium']")).click();
	driver.findElement(By.xpath("//div[@class='interests-div']//label[text()='Python']")).click();
	driver.findElement(By.xpath("//div[@class='interests-div']//label[text()='Java']")).click();
	
	//element states: 
	//isDisplayed() -applicable for all elements.
	//isSelected() -applicable for radio button/check-boxes.
	//isEnabled() -applicable for all elements.
	
	boolean button=driver.findElement(By.xpath("//input[@value='Female']")).isSelected();
	
	if(button==false) {
		System.out.println("Validation 1 is passed.");
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}	
	//working with drop-down.
	//if it have select tag use Select class otherwise for all other drop-downs use find-lelements.
	
	Select sl=new Select(driver.findElement(By.id("state")));
	sl.selectByVisibleText("Assam");
	sl.selectByVisibleText("Bihar");
	
	Select s2=new Select(driver.findElement(By.id("hobbies")));
	s2.selectByVisibleText("Playing");
	s2.selectByVisibleText("Reading");
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	boolean flag=driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
	WebElement we=driver.findElement(By.xpath("//button[text()='Sign up']"));
	
	Actions ac=new Actions(driver);
	ac.scrollToElement(we);
	
	if(true==flag) {
		System.out.println("Submit button is enabled now to click");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();		
	}
	else {
		System.out.println("Submit button is not enabled to click");
	}

}}
