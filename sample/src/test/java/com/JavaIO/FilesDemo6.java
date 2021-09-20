package com.JavaIO;
import java.io.*;

public class FilesDemo6 {
	// Java Program to illustrate reading from FileReader
	// using BufferedReader
		
	
	public static void main(String[] args)throws Exception
	{
	// We need to provide file path as the parameter:
	// double backquote is to avoid compiler interpret words
	// like \test as \t (ie. as a escape sequence)
	File file = new File("J:venky.txt");

	BufferedReader br = new BufferedReader(new FileReader(file));

	String st;
	while ((st = br.readLine()) != null)
		System.out.println(st);
	}
	}


