package GettingStarted;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {
	public static void main(String[] args) {		
		//create object of Firefox driver class
		
		FirefoxDriver obj=new FirefoxDriver();		
		obj.get("https://www.selenium.dev/documentation");				
		obj.manage().window().maximize();
		
		String title=obj.getTitle();
		System.out.println("title of the page is: "+title);
		
		if(title.contains("Browser Automation")) {
			System.out.println("Pass");			
		}
		else {
			System.out.println("Fail");
		}
		String currURL=obj.getCurrentUrl();		
		System.out.println("current url is of page is: "+currURL);		
		obj.quit();	
	}
}