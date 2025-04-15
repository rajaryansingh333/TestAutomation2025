package TestNG_Class46;
import org.testng.annotations.Test;

public class IntroductionToTestNG {
   // <!--scope>test</scope>-->
   // this is to restrict method creation at test folder only.
   // every method become a entry point and exit point if it is
   // annotated as @Test.
	
 @Test	
  public void test1() {	  
	  System.out.println("Java");	  
  }
 
 @Test
 public void test2() {	  
	  System.out.println("Selenium");	  
 }
 
 @Test
 public void test3() {	  
	  System.out.println("TestNG");	  
 }	
}
