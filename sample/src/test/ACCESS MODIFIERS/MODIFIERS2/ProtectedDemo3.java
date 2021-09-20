package MODIFIERS2;

import MODIFIERS.ProtectedDemo;

public class ProtectedDemo3 extends ProtectedDemo {
public static void main(String args[]) {
	ProtectedDemo3 myObj = new ProtectedDemo3();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
}
}
