package ExceptionHandlings;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExecptions2 {
	public static void main(String[] args) {	
		FileInputStream fs=null;
	   
		try {
		  fs=new FileInputStream("C:\\Users\\rajar\\OneDrive\\Desktop\\Jan 2025 Batch Selenium Java\\SeleniumJava\\Test2.text");
						
	// Un-handled exception type FileNotFoundException.	
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found: "+e.getMessage());
		}
		try {
			System.out.println(fs.available());
		}
		catch(IOException e) {
			System.out.println("IOException exception -could not read the file: "+e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("available method can not invoked: "+e.getMessage());
		}		
		//throwing does not mean handling but an handled checked exception throws same FileNotFoundException? 
		//respective caller is the main method here. main instruct the JVM to handle but if any error provided then your program will not run.					
				
	    try {
			Robot obj=new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //Un-handled exception type AWTException.
	    /*Java AWT or Abstract Window Toolkit is an API used for developing GUI(Graphic User Interfaces)
	     * or Window-Based Applications in Java. Java AWT is part of the Java Foundation Classes (JFC)
	     * that provides a way to build platform-independent graphical applications.
	     * This can include systems where Java applications fail to execute certain graphical features.
	     */
	}
}
