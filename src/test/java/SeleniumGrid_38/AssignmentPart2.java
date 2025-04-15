package SeleniumGrid_38;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AssignmentPart2 {
	public static void main(String[] args) throws MalformedURLException {
		
		ChromeOptions ops=new ChromeOptions();	    
		ops.setPlatformName("Linux");
		ops.setBrowserVersion("133.0");	
		ops.addArguments("start-maximized");
		
		Map<String, Object> ltOptions = new HashMap<String, Object>();
		
		ltOptions.put("username", "rajaryanpersonalmail");
		ltOptions.put("accessKey", "6MFA8c13ClKOeU6ErZuqK9wI5SRz5Hzoi5YftrMVPHS5axXLEX");
		ltOptions.put("w3c",true);	
		ltOptions.put("network", true);
		
		ops.setCapability("LT:Options", ltOptions);	
		URL gridURL=new URL("https://hub.lambdatest.com/wd/hub");
	
		WebDriver driver=new RemoteWebDriver(gridURL,ops);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
 
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();		
		
		System.out.println("Login is successful.");
		
		driver.quit();
	}
}
