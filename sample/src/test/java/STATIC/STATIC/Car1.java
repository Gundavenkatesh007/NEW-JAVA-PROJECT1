package STATIC.STATIC;

public class Car1 {
	static void m1() { //static method
		System.out.println("Lamborghini");
	}
		
		void m2() {
			m1(); // calling static method with instance method
		}
		public static void main(String args[]) {
			Car1 c1 =new Car1();
			c1.m1();// calling static method in main method
							
		}
		
	}
	


