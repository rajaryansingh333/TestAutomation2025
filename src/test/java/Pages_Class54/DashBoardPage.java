package Pages_Class54;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {

	WebDriver driver=null;
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;	
	}
	
	By welcomeMsg=By.xpath("//h4[normalize-space()='Welcome Admin Manager to Learn Automation Courses']");
	
	public boolean isMessageDisplay() {	
		boolean status=driver.findElement(welcomeMsg).isDisplayed();		
		return status;
	}

	
}
