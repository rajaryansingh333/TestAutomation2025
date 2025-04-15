package dealWithWebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuite {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
    driver.get("https://freelance-learn-automation.vercel.app/login");

    driver.close();
    driver.get("https://www.google.com");
    
    //defaults:
    //timeouts={implicit=0, pageLoad=300000 milliseconds, script=30000 milliseconds}
    
	}	
}