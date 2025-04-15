package readProperties_Class52;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class readPropertyFile {
	/* our test only focus on test logic and assertation.
      test component
      test data component
      configuration component
      
      maintain and re-usability.
      java does not support any concepts called config file.
      key and value is called one property and property class is called as set of properties. by default each key written as a string.
      properties class extends Hash table class is child class of dictionary class which is key value.
      Hash map is latest class, Hash table class and dictionary class are older java classes.
      every programming may have different extension - example - .config, .ini  
     
     write a java program how to read properties file, how to create a library and how you can integrate with your test.
	 * 
	 */
	
	@Test
	public void readingProperties() throws IOException {
		
		//in java we have a class class called properties that would help us to work with properties file.
		
		Properties propObj=new Properties();
		
		File file=new File(System.getProperty("user.dir")+"/configurations/config.properties");	
		System.out.println("full path of the directory: "+file);
		FileInputStream fis=new FileInputStream(file);
		
		propObj.load(fis);
		// this will not ask for file it is asking for input stream.
		
		System.out.println(propObj.getProperty("ltaccesskey"));
		System.out.println(propObj.getProperty("noKey"));		
		// when key is not present, it will return null because it run on the map concepts of Java.
		
		
	// create a cofig file, create a object of properties class, read and load the file and then get
    // the value of the property.
	   	
	 
	 	
	}	
}
