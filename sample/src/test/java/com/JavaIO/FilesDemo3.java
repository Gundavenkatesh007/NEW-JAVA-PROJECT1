package com.JavaIO;
import java.io.*;
public class FilesDemo3 {

	  
	
	  
	
	    public static void main(String args[])throws Exception
	    {
	        FileOutputStream fout = new FileOutputStream("J://venky1.txt");
	          
	        //creating bufferdOutputStream obj
	        BufferedOutputStream bout = new BufferedOutputStream(fout);
	  
	        //illustrating write() method
	        for(int i = 65; i < 75; i++)
	        {
	            bout.write(i);
	        }
	          
	        byte b[] = { 75, 76, 77, 78, 79, 80 };
	        bout.write(b);
	  
	        //illustrating flush() method
	        bout.flush();
	          
	        //illustrating close() method
	        bout.close();
	        fout.close();
	    }
	}
	
