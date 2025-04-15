package FindElements;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsSelenium4 {
	public static void main(String[] args) {
		
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.naukri.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	  List<WebElement> allLinks=driver.findElements(By.xpath("//a[@href]"));
	  
	  
	  
	  
	  
	  
	  
	  
}
}