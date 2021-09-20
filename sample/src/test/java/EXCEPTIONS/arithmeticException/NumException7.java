package EXCEPTIONS.arithmeticException;

public class NumException7 {
	public static void main(String args[]) {
		try {
			int arr[] = {3,4};
			arr[2] = 8;
		}
		catch(ArrayIndexOutOfBoundsException aIe) {
			aIe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
				}
	}
	


