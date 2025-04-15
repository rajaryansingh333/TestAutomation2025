package Helper_Class42;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Utility {  
	public static WebDriver StartBrowser() {
		
		WebDriver driver=new ChromeDriver();	
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		return driver;
	}
	
public static WebDriver StartBrowser(String broswerName, String url) {
	   
	   System.out.println("runing test on "+broswerName);
	    
	   //driver is a local variable here.
	    WebDriver driver=null;
	    if(broswerName.equalsIgnoreCase("Chrome") || broswerName.equalsIgnoreCase("Google Chrome")) {
	    	driver=new ChromeDriver();	
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  	
	    }
	    else if(broswerName.equalsIgnoreCase("Firefox") || broswerName.equalsIgnoreCase("Mozilla")) {
	    	driver=new FirefoxDriver();	
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	    	
	    }
	    else if(broswerName.equalsIgnoreCase("Edge")){
	    	driver=new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	    	
	    }
	    else if(broswerName.equalsIgnoreCase("Safari")) {
	    	driver=new SafariDriver();	
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	    	
	    }else {
	    	System.out.println("Sorry we do not support "+broswerName+" browser. launching the default browser");
	        driver=new ChromeDriver();
	    }
	    System.out.println("session is ready now, test will be runing on "+broswerName);
	    return driver;  
  }

public static WebDriver StartBrowser(String broswerName, String url, boolean headlessStatus) {
	   
	   System.out.println("runing test on "+broswerName);
	    
	   //driver is a local variable here.
	    WebDriver driver=null;
	    
	    if(broswerName.equalsIgnoreCase("Chrome") || broswerName.equalsIgnoreCase("Google Chrome")) {
			
	    	ChromeOptions op=new ChromeOptions();
	    	if(headlessStatus) {
	    		
	    		System.out.println("Test will run in headless mode.");
	    		op.addArguments("--headless=new");
	    		
	    	}
	    	driver=new ChromeDriver(op);
	    	driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  	
	    }
	    else if(broswerName.equalsIgnoreCase("Firefox") || broswerName.equalsIgnoreCase("Mozilla")) {
	    	driver=new FirefoxDriver();	
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	    	
	    }
	    else if(broswerName.equalsIgnoreCase("Edge")){
	    	driver=new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	    	
	    }
	    else if(broswerName.equalsIgnoreCase("Safari")) {
	    	driver=new SafariDriver();	
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	    	
	    }else {
	    	System.out.println("Sorry we do not support "+broswerName+" browser. launching the default browser");
	        driver=new ChromeDriver();
	    } 
	    System.out.println("session is ready now, test will be runing on "+broswerName);
	    return driver;  
}
    public static void waitForSeconds(int seconds) {
    	
    	System.out.println("waiting for "+seconds+" seconds");
	     try {
	     	Thread.sleep(seconds*1000);
	     } catch (InterruptedException e) {
	    	// TODO Auto-generated catch block
	    	e.printStackTrace();
	      }	
        }    
    public static void quitBrowser(WebDriver driver) {	
     	if(driver!=null) {
    	 driver.quit();
        }
    }   
    public static void selectFromDropdwon(WebElement ele, String value) {   	
    	Select dropdownOption=new Select(ele);
    	dropdownOption.selectByVisibleText(value);
    }
  
    //Task 1: capture screenshot and date-time stamp.
    public static File takeScreenshots(WebDriver driver) {
    	
    //  Selenium 4 onwards we can capture the SS of an individual web element.
    	
    	TakesScreenshot sc=(TakesScreenshot)driver;
    	File srcFile=sc.getScreenshotAs(OutputType.FILE);
    	SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy"); 
    	String dateFormatted=ft.format(new Date());
    	    	
    	File dest=new File("./Screenshots/Screenshot_"+dateFormatted+System.currentTimeMillis()+".png");
        File path=dest.getAbsoluteFile();
        //Q- how to take absolute path?
        
    	try {
			FileHandler.copy(srcFile, dest);
		} catch (IOException e) {		
			System.out.println("can not capture the ScreenShots"+e.getMessage());		
			e.printStackTrace();
		}
    	return path;
    }
    // Task 2: Capture and accept the Alert text  
    public static String acceptCaptureAlertText(WebDriver driver) {
    	
    	String alertText=driver.switchTo().alert().getText();
    	driver.switchTo().alert().accept();
    	
    	return alertText;
    }
  
    //dismiss method.
  public static String dismissCaptureAlertText(WebDriver driver) {
    	
    	String alertText=driver.switchTo().alert().getText();
    	driver.switchTo().alert().dismiss();;
    	
    	return alertText;
    }
    
}