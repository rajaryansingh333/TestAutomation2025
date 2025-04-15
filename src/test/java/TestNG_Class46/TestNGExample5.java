package TestNG_Class46;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TestNGExample5 {	
  
  @Test(priority=-1)
  public void test1() {
	  System.out.println("Test1");
  }
  
  @Test
  public void test2() {
	  System.out.println("Test2");
  }
  @Test
  public void Test3() {
	  System.out.println("Test3");
  }
  @Test(priority=-2)
  public void test4() {
	  System.out.println("Test4");
  } 
  @Test(priority=1)
  public void test5() {
	  System.out.println("Test5");
  }
  
  //o/p: 4,1,2,3,5.
  //Suite->Test->Class->Groups->Method
  //Always try to maintain methods as independent and possible.  
   
}