   package EXCEPTIONS.arithmeticException;
   
 class ExceptionDemo2{ 
	 public static void main(String args[]) {
		 try {
			 int arr[]= {2,5};
			 arr [2] = 7;
		 }
		 catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
					 }
		 catch(Exception e) {
			 e.printStackTrace();
			 }
	 }
 }


 


