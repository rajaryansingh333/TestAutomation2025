package testUsingPOM_Class54;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper_Class42.Utility;
import Pages_Class54.DashBoardPage;
import Pages_Class54.LoginPage;

public class LoginTestSceanrio {
	 LoginPage loginObj=null;
	 DashBoardPage dashBoard=null;
	
   @Test	
   public void testlogin_TC01() { 
	   //start browser is also a action but not related to test so we can not keep it under page.
	   // it is normal setup and tear-down activity.
	   //baseClass setup activity:
	   
	   // we can not keep the browser invoke steps in Pages as pages are dedicated to html page
	   // a component and not related to browser activity which is independent activity.
	   // also we can not say our login is fails due to browser issue or env is down/db is down.
	   // these are pre and post condition.
	   
	   WebDriver driver=Utility.StartBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
	   
	  //pages are dedicated Login html page. otherwise browser will launches every time for each pages.
	  // it is recommended not to keep static class/method as it is a general recommendation in POM we will not make the static method
	  // because it is against to the rules of 'page object model'
	  // also static class and all it's methods gets loaded each time and it take time for static methods to load.
	    loginObj=new LoginPage(driver);	
	   
	   //actions and logics:
	   //both above line of code will remain same only below Creds will change for e very user.
	   //non-static method will only loaded to memory when we call them.
	   
	    dashBoard=loginObj.loginToApplication("admin@email.com", "admin@123");  	   
	   //Assertion: should always be in Test Method.
	   Utility.waitForSeconds(2);
	   
	  //DashBoardPage:
	  //dashBoard=new DashBoardPage(driver); 
	  Assert.assertTrue(dashBoard.isMessageDisplay(), "Welcome Validation failed");
	  
	  //tear-down activity: will keep in base.
	  Utility.quitBrowser(driver);    
	  }
   
       
   }