package inputoutputStreams;

import java.io.*;

public class FilesDemo2 {
public static void main(String args[]) throws Exception {
	
		FileInputStream fi = new FileInputStream("J://venky.txt");
		BufferedInputStream bis = new BufferedInputStream(fi);
		
		while (bis.available() > 0) {
			char c = (char)bis.read();
			System.out.println("Char :" +c);
			
			
		}
	}
}


