package DataProviderTestNG_Class49;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithExcel {
	
	// go to dataProviderCustomClass class and find the testExcelDataProvider data provider.
	// .class means loading mentioned class in the current test class.
	
	@Test(dataProvider="testExcelDataProvider", dataProviderClass=dataProviderCustomClass.class)
	public void test1(String arg1, String arg2, String arg3, String arg4, String arg5) {	  
	 	// we may receive it as list of columns and then we manipulate the data. it will give only one arg at a time.
		// create another method which return iterator of list.
		
	   	System.out.println(arg1);
	   	System.out.println(arg2);
	   	System.out.println(arg3);
	   	System.out.println(arg4);
	   	System.out.println(arg5);
	   	
	   	System.out.println("*******************");
	}
}