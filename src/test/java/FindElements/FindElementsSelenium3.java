package FindElements;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsSelenium3 {
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
	  
	 // get the odd number boxes only.
	  for(int i=0;i<checkboxes.size();i=i+2) {
		  
		  checkboxes.get(i).click(); //0,2,4,6
	  }
	  
	  /*for(int j=1;j<checkboxes.size()-1;j=j+2) {
		  checkboxes.get(j).click(); //1,3,5
	  }
	  */
	  /* this can be used with date picker, auto suggestions, when we have drop-downs without select tag,
	   want to capture all the data of particular web application.
	   WebElement vs WebElements
	   return web-element, nosuchElementExeception
	   
	   WebElements:
	   return list of web-elements, never throw exception rather return a list of size zero.
	   
	   
	   
	   */
}
}