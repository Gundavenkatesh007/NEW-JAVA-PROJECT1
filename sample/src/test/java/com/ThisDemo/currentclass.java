package com.ThisDemo;

public class currentclass {
	int x; 
	int y;
	public currentclass() {
		x=10;
		y=20;
		
	}
public void display() {
	System.out.println("the value of x is "+x);
		System.out.println("the value of y is "+y);
}
public currentclass returnsCurrentClassObject() {
	return this;
	
}
}
