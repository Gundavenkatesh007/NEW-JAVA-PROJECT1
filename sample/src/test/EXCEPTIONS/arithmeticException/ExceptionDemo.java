package arithmeticException;

public class ExceptionDemo {
	public static void main(String args[]) {
		System.out.println("I am a good programmer");
		
		try {
			int a = 10;
			int b= 0;
			int c = a/b;
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("welcome to programming");
		System.out.println("by venkatesh");
		
		}
		}
	
	
