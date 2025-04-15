package readProperties_Class52;

import org.testng.annotations.Test;

public class readPropertyFile2 {
	
	@Test
	public void readingProp() {		
		System.out.println(Helper_Class42.ConfigUtility.readProperty("qaenv"));
		
		// IMPORTANT:
		// we have test classes and there currently we write locator strategies, actions, assertions.
		// now we need to transform locators + actions into pages to add one more level of abstraction and modularization.
		//   called as POM.
		// We created separate component, excel, config and generic library name Utility_Class42.
		// we could have another component called pages to create another abstraction layer.
		// component may increase based on the requirement -like Listers, reporters/JDBC/APIs.
	    
	}
	
	
}