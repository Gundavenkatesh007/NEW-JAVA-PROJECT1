package com.JavaIO;

	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	
	public class FilesDemo4 {
		    public static void main(String[] args) throws IOException
	    {
	        // variable declaration
	        int ch;
	  
	        // check if File exists or not
	        FileReader fr=null;
	        try
	        {
	            fr = new FileReader("venky");
	        }
	        catch (FileNotFoundException fe)
	        {
	            System.out.println("File not found");
	        }
	  
	        // read from FileReader till the end of file
	        while ((ch=fr.read())!=-1)
	            System.out.print((char)ch);
	  
	        // close the file
	        fr.close();
	    }
	}
