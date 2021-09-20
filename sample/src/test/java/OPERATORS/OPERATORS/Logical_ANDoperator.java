package OPERATORS.OPERATORS;
public class Logical_ANDoperator {
	public static void main(String args[])
	{
		int x = 20,y = 30,z = 30,p = 0;
		System.out.println("x is =" +x);
		System.out.println( "y is ="+y);
		System.out.println(" z is ="+z);
		
		//using logical AND to verify
		if((x < y &&  y == z)) {
			p = x+y+z;
			System.out.println("the sum =" +p);
		}
		else
			System.out.println("condition is false");
				}
}
