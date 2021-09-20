package inputoutputStreams;

import java.io.*;

public class FilesDemo {
public static void main(String args[]) {
	try {
		FileOutputStream fout = new FileOutputStream("J:\\venky.txt");
		
		String s = "I AM VENKATESH";
		byte b[] = s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("Success");
}
	catch(Exception e) {
		e.printStackTrace();
		}
}
}
  