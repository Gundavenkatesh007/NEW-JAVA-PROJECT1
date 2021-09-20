package com.JavaIO;
import java.io.*;

public class FilesDemo1 {
public static void main(String[] args) {
	try {
		FileInputStream fis = new FileInputStream("J:\\venky.txt");
		int i = 0;
		while((i = fis.read())!= -1) {
			System.out.print((char)i);
		}
		fis.close();
		}
	catch(Exception e) {
		e.printStackTrace();
		}
}
}
