package DataProviderTestNG_Class49;
import org.testng.annotations.DataProvider;

public class dataProviderCustomClass {
		
		@DataProvider(name="testExcelDataProvider")
		 public Object[][] getDataProvider() {		
		   Object[][] data=Helper_Class42.ExcelUtility.getData("testData");	
	  	   return data;
		 
		 //in-case of multiple sheet data - get sheet data one by one in 2D object array and then play with data
		 // as per your requirement.	
	}
}