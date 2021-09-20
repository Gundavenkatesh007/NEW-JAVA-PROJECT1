package INTERFACES.interfacedemo4;

public class Machines  implements Animals,Humans{
	public void m1() {
		System.out.println("Animals are controlled by Humans");
	
	    System.out.println("Humans are controlled by their brains");
	}
	public static void main(String args[]) {
		Machines M = new Machines();
		M.m1(); // calling one method name but different outputs
	}
  
}
