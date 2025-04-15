package TestNG_Class46;
import org.testng.annotations.Test;

public class TestNGExample2 {
  // this is a test class because it have at least 1 Test Method.
  // testNG by default assign zero priority to each Test Method.
  // and then it run alphabet order.
  // we can manually assign priorities and lowest priority scheduled first.
  // @Test is annotation.
  // (priority=1) is attribute of that annotation => additional instructions.
  // by default each and every Test is set enabled equal to true.
  // priority is for sequencing. dependency when tests are dependent.	
	
  @Test(priority=1,description="verify login")
  public void loginapp() {	  
	 System.out.println("Login to application.");	  
  }
  
  @Test(priority=3,description="verify logout")
  public void logOut() {
	  System.out.println("Logout.");
  }
  
  //enabled=false would not be picked at time of executions.
  @Test(priority=2,enabled=false,description="verify payment")
  public void makPayment() {
	  System.out.println("Payment was successful.");
  }
  
}