package TestNG_Class46;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExample3 {	
	//Assertions: selenium Actual result is compared with expected result with 
	// the help of Assertion.
	//type -two types -Assert(also called as hard assert) and SoftAssert classes.
	
  @Test
   public void test1() {	  
	 System.out.println("Test Method 1.");	 
	 Assert.assertEquals("Mukesh", "Mukesh","Message: matches is not successful.");
   //it will only pass when both values are equal.
  }
   @Test
   public void test2() {	  
		 System.out.println("Test Method 2.");	 
		 Assert.assertEquals("Mukesh", "Mukesh","Message: matches is not successful.");
	     //it will only pass when both values are equal.
	 }
   
   @Test
   public void test3() {	  
		 System.out.println("Test Method 3.");
		 Assert.assertEquals("Mukesh".toLowerCase(), "mukesh","Message: matches is not successful.");
	     //it will only pass when both values are equal.
	 }
   @Test
   public void test4() {	  
		 System.out.println("Test Method 4.");
		 Assert.assertTrue(true, "not successful.");
	     //it will only pass when condition is true. return true.
	 }
   
   @Test
   public void test5() {	  
		 System.out.println("Test Method 5.");
		 Assert.assertFalse(false, "not successful.");
	     //it will only pass when condition is false. return true.
	 } 

   @Test
   public void test6() {	  
		 System.out.println("Test Method 6.");
		 Assert.assertNull(null, "not maching.");
	     //it will only pass when actual contains null value - will return true.
	 }
}
//here each methods are independent.

