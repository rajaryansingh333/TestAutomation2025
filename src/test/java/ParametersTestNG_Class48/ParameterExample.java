package ParametersTestNG_Class48;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	@Parameters({"username","password"})
	@Test
	public void method1(@Optional("optional params") String name,@Optional("optional params2") String password) {
		
		//without optional it will as it would not understand from where to take the params.
		// when you have more params go with data providers - Data Driver approach.
		//Use Optional params when we need simple parameter. and it will only consider
		//if we do not provide any value in xml or if we run from here.
		// if values are provided from from xml file then it will override the Optional value.
		
		//similar to sys-out but it gives us additional log information on html report as well as on local console.		
		Reporter.log("Runing Test Method 1 with username as: "+name,true);
		Reporter.log("Runing Test Method 1 with password as: "+password,true);
	}
}