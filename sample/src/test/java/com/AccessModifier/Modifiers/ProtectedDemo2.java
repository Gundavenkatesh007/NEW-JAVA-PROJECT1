package com.AccessModifier.Modifiers;


	class ProtectedDemo2 extends ProtectedDemo {
		  private int graduationYear = 2019;
		  public static void main(String[] args) {
		    ProtectedDemo2 myObj = new ProtectedDemo2();
		    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		    System.out.println("Email: " + myObj.email);
		    System.out.println("Age: " + myObj.age);
		    System.out.println("Graduation Year: " + myObj.graduationYear);
		  }
		}
		
	


