package EXCEPTIONS.arithmeticException;
 

	import java.io.*;
	class ExceptionDemo1{
	    public static void main(String[] args) throws IOException{
	      FileWriter file = new FileWriter("c:\\Data1.txt");
	      file.write("Guru99");
	      file.close();
	    }
	}
	 