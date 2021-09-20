package arithmeticException;
import java.io.*;

public class NullPointerExceptionDemo {
public static void main(String args[]) {
	String ptr = null;
	
	try {
		if(ptr.equals("ghf"))
			System.out.println("Same");
		else 
			System.out.println("Not Same");
				}
	catch(NullPointerException e)
	{
		System.out.println("NullPointerException caught");
		}
}
}
