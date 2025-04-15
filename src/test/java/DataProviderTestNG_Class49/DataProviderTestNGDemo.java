package DataProviderTestNG_Class49;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNGDemo {

	/* paraller=methods -> will only supposed to use when methods are independent. 
      best practices:
      avoid using thread more than 5. more threads more it will occupied the memory.
      use paraller=tests -only when you have cross browser in paraller mode.
      use may use paraller=methods when you don't need to run on cross browser but ensure that methods are not depended on each other.
      use paraller=classes -threads will be assigned on class level. works even you have dependent classes or not.

      how test ng creates a thread - via thread poll. by default test ng have a thread poll allocated to your project, depending on how many thread you need
      it will pick these number of threads from the poll and these threads will be always independent.

      paraller=true just mean that you wan to set it to paraller but again you need tell if paraller=tests/classes/methods.

      Data Provider:
      A Data Provider is a method on your class that returns an array of array of objects. This method is annotated with @DataProvider:

      No of rows=no of test execution/no of iteration.
      No of columns=no of parameters/no. of variables.

      TestNG needs data in 2D object array only. mapping you need to take care by any external file/sources/test data file.
      external sources: excel database/database/excel/csv/xml/ymel files. 
	 */
	
     @Test(dataProvider="users")
	 public void newUser(String fname, String lname) {
    	 //two arguments as it will receive two parameters.
    	   System.out.println("Hi "+fname+" "+lname+" :Welcome!");
    	   
      //Test is written once but we have executed twice depends on number of rows we have.
     //when you run your any test and if your test is linked to a data provider. it will look for valid data and print each cell sequentially.	   
	 // here we can not use indexes as this will follow the sequences.    
     }
	
     @DataProvider(name="users")
     //name is just a unique name assigned.
	 public Object[][] getData() {

    	 // technically this data provider method will be connected to the particular test method and no of arguments. ->
    	 // how do you use this data as per your need is up-to to you.
        //generate test data in object 2D array and pass it to here.
    	 //data provider will executed first here and it should work otherwise your test will not work.
    	// array of object and we are receiving as string, we can receive as integer, boolean and so on.
    	 
    	 System.out.println("test data is getting ready.");
    	 Object arr[][] =new Object[2][2];    	 
    	 //default values of these cell values is a null.
    	 
    	 arr[0][0]="Alok";
    	 arr[0][1]="Singh";

    	 arr[1][0]="Arun";
    	 arr[1][1]="Gupta";
    	 
    	 System.out.println("test data is now ready to be used in test method");
    	 return arr;
	 }
	
}
