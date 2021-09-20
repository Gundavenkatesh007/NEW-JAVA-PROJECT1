package STATIC.STATIC;

public class Book1 {
	void m1() { //instance variable
		System.out.println("My new Book");
	}
		public static void main(String args[]) { //static method
			Book1 b1 = new Book1();
			b1.m1();  // calling instance method in static method
			
		}
	}


