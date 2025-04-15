package FindElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsSelenium2 {
	public static void main(String[] args) {
		
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://freelance-learn-automation.vercel.app/signup");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  //List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	 List<WebElement> checkboxes=driver.findElements(By.xpath("//label[@class='interest']"));
	  System.out.println(checkboxes.size());
	  

	  //select only selenium check-box.
	  for(WebElement ele:checkboxes) {
		  if(ele.getText()=="Selenium") {
			  ele.click(); 
		  }
		 
	  }
		
		
		
		
		
		
		
	}
}
