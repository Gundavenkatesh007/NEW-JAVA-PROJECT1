package inputoutputStreams;
import java.io.*;

public class FilesDemo7 {
	//Java program illustrating use of write(int arg) method

				public static void main(String[] args)
		{
			//initializing FileWriter
			FileWriter venky_file;
			try
			{
				venky_file = new FileWriter("ABC.txt");
				
				// Initialing BufferedWriter
				BufferedWriter bfw = new BufferedWriter(venky_file);
				System.out.println("Buffered Writer start writing :)");
				
				// Use of write() method to write the value in 'ABC' file
				// Printing E
				bfw.write(69);
				
				// Printing 1
				bfw.write(49);

				// Closing BufferWriter to end operation
				bfw.close();
				System.out.println("Written successfully");
			}
			catch (IOException excpt)
			{
				excpt.printStackTrace();
			}

		}
	}


