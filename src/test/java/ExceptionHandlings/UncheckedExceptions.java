package ExceptionHandlings;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptions {
	public static void main(String[] args) {		
		System.out.println("********Starting*********");
		Scanner sc=new Scanner(System.in);	
		try {
			System.out.println("Enter first number.");
			int num1=sc.nextInt();
			System.out.println("Enter second number.");
			//sc.close();
			int num2=sc.nextInt();
			System.out.println(num1/num2);
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter a valid integer value: "+e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("custome message: please do not divide a number by zero: "+e.getMessage());
			//e is the reference to the exception.		
		}
		catch(IllegalStateException e) {
			System.out.println("please check again.. "+e.getMessage());
		}		
		//if you are not sure about the exception please use this.
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//will handle errors too.
		catch(Throwable e) {
			System.out.println("Some Error occured: "+e.getMessage());
		}
		//if you have added finally block, it will executed no matter what has happend. not mandatory.
		finally {
			System.out.println("finally block.");
			sc.close();			
		}	
		//unchecked exceptions because it appear at run time.		
		System.out.println("********Ending*********");
		
		/*
		 * The try block cannot be present without either catch clause or finally clause. 
		 * Any code cannot be present in between the try, catch, finally blocks.
		 * 
		 */		
	}
}