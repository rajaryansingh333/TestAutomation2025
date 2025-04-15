package Pages_Class54;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	//object repository class.
	//this login page should include each and every element this page.
	// to cover all the scenario.	
	
	WebDriver driver=null;
	//constructor.
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	//locators.
	By username=new By.ByXPath("//input[contains(@id,'email')]");
	By password=new By.ByXPath("//input[contains(@id,'password')]");
	By signIn=new By.ByXPath("//button[contains(text(),'Sign in')]");
	
	//methods for actions. to perform login in this case.
	//method names must be very readable and self explanationary.
	public DashBoardPage loginToApplication(String mail, String pass) {
		 driver.findElement(username).sendKeys(mail);
		 driver.findElement(password).sendKeys(pass);
		 driver.findElement(signIn).click();
      
		 // when one page return the object of next page, we call it page chaining.
		 DashBoardPage dashboard=new DashBoardPage(driver);	 
		 return dashboard;		 
	 }
	
}