package Helper_Class42;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtility {
	public static String readProperty(String key) {
		
		Properties propObj=new Properties();		
		try {
			propObj.load(new FileInputStream(new File(System.getProperty("user.dir")+"/configurations/config.properties")));
		} catch (FileNotFoundException e) {
			
			System.out.println("file or directroy is not found"+e.getMessage());
		} catch (IOException e) {
		  
			System.out.println("could not read the file/input intruppted.");
		}
			
		String value=propObj.getProperty(key);
		
	  return value;	
	}
	
	
	
	
	
	
	
	
	
}
