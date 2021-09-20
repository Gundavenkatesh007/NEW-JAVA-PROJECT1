package STRINGS.Strings;
//Java code to demonstrate the
	// working of matches()

public class Matches {
	
				public static void main(String args[]) {
			
		// Initializing String
		String Str = new String("Welcome to my World");
			
		// Testing if regex is present
		System.out.print("Does String contains regex (.*)my(.*) ? : " );
		System.out.println(Str.matches("(.*)my(.*)"));
			
		// Testing if regex is present
		System.out.print("Does String contains regex my ? : " );
		System.out.println(Str.matches("my"));
			
	}
	}



