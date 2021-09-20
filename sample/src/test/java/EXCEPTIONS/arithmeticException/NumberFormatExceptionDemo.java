package EXCEPTIONS.arithmeticException;
import java.util.Scanner;

public class NumberFormatExceptionDemo {
public static void main(String args[]) {
	
	int number;
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("Enter a valid Integer: ");
		
		try {
			number = Integer.parseInt(sc.next());
			System.out.println("You entered:" + number);
			break;
		}
			catch(NumberFormatException ne) {
				System.out.println("NumberFormatExceptionOccured");
														}
		}
	}
}

