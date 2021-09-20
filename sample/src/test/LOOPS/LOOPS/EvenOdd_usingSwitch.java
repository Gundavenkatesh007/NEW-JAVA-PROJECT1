package LOOPS;
import java.util.Scanner;


public class EvenOdd_usingSwitch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input:  ");
		int n = sc.nextInt();
		switch(n%2)
		{
		case 0: // if remainder is 0
			System.out.println(n + "is even number");
		break;
		
		case 1: //if remainder is 1
			System.out.println(n + "is odd number");
		break;
			
		
		}
					
	}
	

}
