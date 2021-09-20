package OPERATORS;
public class Logical_OR {
public static void main(String args[]) 
{
	//initializing varaiables
	int m=45,n=80,o=12;
	//Displaying variables
	System.out.println("m is =" +m);
	System.out.println( "n is ="+n);
	System.out.println(" o is ="+o);
	if ((m<n || n==0))
	{
			System.out.println("one or both " +" the conditions are true");
		}
	else
		System.out.println("both conditions are false");
}
}
