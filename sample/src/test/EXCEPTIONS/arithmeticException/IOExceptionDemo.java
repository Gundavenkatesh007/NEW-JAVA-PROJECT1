package arithmeticException;
import java.util.*;

// IOException returning null

public class IOExceptionDemo {
public static void main(String args[]) {
	
	 Scanner scan = new Scanner("welcome to programming");
	 System.out.println("" + scan.nextLine());
	 
	 System.out.println("Exception output: " + scan.ioException());
	 scan.close();
	 
}
}
