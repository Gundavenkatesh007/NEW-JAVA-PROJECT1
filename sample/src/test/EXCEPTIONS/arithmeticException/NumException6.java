package arithmeticException;

public class NumException6 {
	static void display() throws ArithmeticException{
		int a = 5/0;
		System.out.println(a);
	}
	public static void main(String args[]) {
		try {
			display();
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("Successfully printed");
		
		}
	}


