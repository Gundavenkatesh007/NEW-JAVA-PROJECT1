package INTERFACES.interfacedemo2;

 class Bikes2 implements Bikes {
	 public void m1() {
		 System.out.println("My bike is R15");
	 }


 public static void main(String args[]) {
	 Bikes B = new Bikes2(); // interface instance
	 B.m1();    //calling implemented method with interface instance
 }
 
 }
 		
