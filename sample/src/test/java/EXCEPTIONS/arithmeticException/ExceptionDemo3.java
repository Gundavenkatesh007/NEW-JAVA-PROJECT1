package EXCEPTIONS.arithmeticException;

public class ExceptionDemo3 {
	static void validate(int age) {
		if(age < 18) {
			throw new ArithmeticException("You are not eligible to vote");
		}
		else {
			System.out.println("You are eligible for vote");
					}
	}


public static void main(String args[]) {
	validate(17);
	System.out.println("casted vote successfully");
}
}
