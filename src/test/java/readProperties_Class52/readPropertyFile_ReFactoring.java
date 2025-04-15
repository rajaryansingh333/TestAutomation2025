package readProperties_Class52;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class readPropertyFile_ReFactoring {
	
	@Test
	public void readingProperties() throws IOException {
		
		Properties propObj=new Properties();		
		propObj.load(new FileInputStream(new File(System.getProperty("user.dir")+"/configurations/config.properties")));
		
		// will let us read the file of any type -json, xml, yml, txt, opecsv, excel, property file.
		
		System.out.println(propObj.getProperty("ltaccesskey"));
		System.out.println(propObj.getProperty("noKey"));
	 			
	}	
}
