package LOOPS;
import java.util.Scanner;

public class Gender{

	public static void main(String args[]) {
		
		
		
		       Scanner sc = new Scanner(System.in);
		       
		       System.out.println("enter the gender  : m/f  : ");
		       String gender = sc.nextLine();
		       switch (gender) {
		       case "m": System.out.println("Male");
		       break;
		       
		       case "f": System.out.println("Female");
		       break;
		       
		       
		       default: System.out.println("you have entered an unknown string value");
		       }
	}
}

		       
		      

	
		        	 

		        
		        	

		     
		
		 
		
		
		

	