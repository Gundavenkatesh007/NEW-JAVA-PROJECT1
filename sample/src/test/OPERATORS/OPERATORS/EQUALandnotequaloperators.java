package OPERATORS;
import java.util.Scanner;//IMPORT scanner class

public class EQUALandnotequaloperators {
			public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			System.out.println("Enter any two numbers to check for equality: ");
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			if(num1==num2){
			System.out.println("The two numbers are equal");
			}
			else if(num1!=num2){
			System.out.println("The numbers are not equal");
			}
			}		
}

