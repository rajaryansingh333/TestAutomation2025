package dealWithWebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverClassHierachy {
	public static void main(String[] args) {
		
	/* Chrome driver class extends chromium driver class extends remote web driver
	   implements web driver interface extends search contexts parent interface.
	   
	   Edge driver class extends chromium driver class extends remote web driver
	   implements web driver interface extends search contexts parent interface.	   
	   	   
	   Fire-fox driver class extends remote web driver  implements web driver interface 
	   extends search contexts parent interface.
	    	   
	   Safari driver class extends remote web driver  implements web driver interface 
	   extends search contexts parent interface.
	   ***************
	   Chrome and Edge both are chromium based browser so they are extending chromium class.
	   Firefox is a separate engine it's not based on chromium driver.
	   Safari runs on web-gate web-server plug-ins so it's also extends directly remote web driver.	   
	*/		
	  WebDriver driver = new ChromeDriver();
	  //Chrome driver is a class. we are creating object of it but reference is
	  //pointing to web driver interface. so we can access only web driver and above
	  //methods and property.
	  //any interface is fully abstract class.
		
//oops concepts used here are -> Encapsulation, Abstractions, inheritance, poly-morphisum.	
	driver.manage().window().maximize();
    driver.get("https://freelance-learn-automation.vercel.app/login");
    driver.get("https://www.facebook.com");
    driver.get("https://www.google.com");
	
    driver.navigate().back();
    driver.navigate().back();
    
    driver.navigate().forward();
    driver.navigate().forward();
    driver.navigate().refresh();
    
    driver.navigate().to("https://selenium.dev");    
    //driver.get() & driver.navigate().to() => both are same. loads the application we want to.
    //only thing is -this to() methods belongs to navigation() and get() methods directly belongs
    // web driver interface.
    
    driver.quit();
    
    /* close() vs quite() => close will only close the only current active window/tab.
     * quite() will close the current active driver session/close all the window/tab.
     * close() will maintain session id. quite will assign null to the session id.
     * 
     */
    
    
	}	
}