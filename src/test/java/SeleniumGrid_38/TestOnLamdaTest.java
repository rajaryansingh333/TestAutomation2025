package SeleniumGrid_38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestOnLamdaTest {
	public static void main(String[] args) {  
		
		ChromeOptions ops=new ChromeOptions();
		//give me options that you want to customize.
		//we can change the browser settings using options class.
		ops.addArguments("--headless=new");
		ops.addArguments("--start-maximized");
				
		WebDriver driver=new ChromeDriver(ops);
		
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
			
 }
}