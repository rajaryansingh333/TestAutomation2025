package TestNG_Class46;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TestNGExample4 {	
  
  @Test
  public void login() {
	  System.out.println("login");
	  Assert.assertTrue(true,"login fails");
  }
  
  // we can pass multiple methods.
    @Test(dependsOnMethods="login")  
	public void logout() {  
    	System.out.println("logout");
	}
}