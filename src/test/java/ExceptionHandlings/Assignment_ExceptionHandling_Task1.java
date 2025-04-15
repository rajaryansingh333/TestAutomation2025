package ExceptionHandlings;

import java.util.Scanner;

public class Assignment_ExceptionHandling_Task1 {

	//Task 1:
	public static void main(String[] args) {
	  
		int arr[]= {23,5,67,879,1};
		
		try {
			System.out.println("Start of the program.");
			System.out.println("Instruction for User: Please enter a integer index to see it's value.");
			Scanner sc=new Scanner(System.in);
			int index=sc.nextInt();
			System.out.println("value at index "+index+" is: "+arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index Out of bound: Enter a integer index value upto 5 only: "+e.getMessage());
		}
		
		System.out.println("End of the program.");
	}
}
