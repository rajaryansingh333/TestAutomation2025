package FindElements;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsSelenium {
	public static void main(String[] args) {
		
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://freelance-learn-automation.vercel.app/signup");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	  System.out.println(checkboxes.size());
	  
	  //print last element.
	  System.out.println(checkboxes.get(checkboxes.size()-1));
	  
	  //click on last element.
	  //checkboxes.get(checkboxes.size()-1).click();
	  
	 // check all the boxes.
	  for(WebElement ele:checkboxes) {
		  ele.click();
	  }
}
}
