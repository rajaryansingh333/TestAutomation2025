package GettingStarted;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class RapidFire {
	public static void main(String[] args) {
		
		ChromeDriver obj=new ChromeDriver();
		obj=new ChromeDriver();
		obj=new ChromeDriver();
		obj=new ChromeDriver();	

		//every time we use new keyword with a class it's create new object of that class
		// but each time since new browser will open and the object will point to new browser and 
		// reference to previous browser will be lost.
		// and those browser will called orphan browser. 
		// we can not switch back to it since we lost the reference and java garbage collector will pick up the unused references.
		
		obj.get("https://www.facebook.com");		
		obj.quit();
		
		//default page time out in selenium is 300 seconds i.e. 5 minute.
		//obj.get("www.facebook.com") - will not work because since protocol is missing.
		// Invalid Argument Exception.
        
		List<ChromeDriver> list=new ArrayList<ChromeDriver>();	
		list.add(obj);				
	}
}