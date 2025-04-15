package ExceptionHandlings;
public class CheckedExecptions {

	public static void main(String[] args) {		
	/*
	* If method signature have declared a particular exception, it is callers responsibility to handle that exception.
	* which means if there is a predefined method or constructor that throws any exception at design level, it is callers 
	* responsibility to handle that exception - called as checked or compile time exception.
	* 
	*/
	System.out.println("hello message!");	
    try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    //error -Un-handled exception type InterruptedException.
    
    System.out.println("hello java!");
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("hello selenium!");	
    try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   
    Thread.yield();	
	}
}
