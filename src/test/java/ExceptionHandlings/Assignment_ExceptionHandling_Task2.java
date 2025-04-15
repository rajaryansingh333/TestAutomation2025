package ExceptionHandlings;
import java.util.Scanner;

public class Assignment_ExceptionHandling_Task2 {

	//Task 1:
	public static void main(String[] args) {	  
		
		try {
			System.out.println("Start of the program.");
			
			System.out.println("Please enter the first number:");
			Scanner sc=new Scanner(System.in);
			String strInput=sc.nextLine();
			double val=Double.parseDouble(strInput);
			
			System.out.println("Please enter the second number:");
			Scanner sc2=new Scanner(System.in);
			String strInput2=sc.nextLine();
			double val2=Double.parseDouble(strInput2);
		    double result=val+val2;
		    
			//Sum:
			System.out.println("The sum of the "+val+" and "+val2+" is "+result);
		}
		catch(NumberFormatException e){
			System.out.println("Invalid input! Please enter a valid number "+e.getMessage());
		}	
		System.out.println("End of the program.");
	}}
