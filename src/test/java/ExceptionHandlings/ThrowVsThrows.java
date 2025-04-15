package ExceptionHandlings;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowVsThrows {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fs=new FileInputStream("");
//throwing does not mean handling but an handled checked exception throws same FileNotFoundException? 
//respective caller is the main method here. main instruct the JVM to handle but if any error provided then your program will not run.		
		
 }
}