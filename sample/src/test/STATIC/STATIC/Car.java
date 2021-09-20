package STATIC;

public class Car {
	static int y = 100; // static variable
	void m1() { // instance method
		System.out.println(y);
			}
	
	public  static void main( String args[]) {
		Car c = new Car();// object 
	     c.m1();  // calling static variable with instance method
		
	}
	

}
