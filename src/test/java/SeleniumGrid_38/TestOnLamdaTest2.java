package SeleniumGrid_38;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestOnLamdaTest2 {
	public static void main(String[] args) throws MalformedURLException {
	   //example taken in class.
		ChromeOptions ops=new ChromeOptions();	    
		ops.setPlatformName("Windows 10");
		ops.setBrowserVersion("133.0");		
		//include the network log =true?
		
		// now we need to define Map form all other things as we have key and value to pass.
		Map<String, Object> ltOptions = new HashMap<String, Object>();
		
		ltOptions.put("username", "rajaryanpersonalmail");
		ltOptions.put("accessKey", "6MFA8c13ClKOeU6ErZuqK9wI5SRz5Hzoi5YftrMVPHS5axXLEX");
		ltOptions.put("w3c",true);	
		ltOptions.put("network", true);
		
		ops.setCapability("LT:Options", ltOptions);		
		//ops.setCapability(network:true);
		
		//give me options that you want to customize.
		//we have to pass URL in actual format and not in string format so convert it.
		//dedicated class which will convert any string into actual URL.
		//Grid will have Hub and nodes, hub will never change only nodes will keep changing.
		URL gridURL=new URL("https://hub.lambdatest.com/wd/hub");
		
		//wd means web driver.
		// what is use of tunnel. when it will be set to ON.
		WebDriver driver=new RemoteWebDriver(gridURL,ops);
		
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}