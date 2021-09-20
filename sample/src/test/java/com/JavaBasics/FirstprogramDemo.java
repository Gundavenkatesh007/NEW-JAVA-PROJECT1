package com.JavaBasics;

public class FirstprogramDemo { // CLASS
void display() {                //METHOD
	System.out.println("CLASS,OBJECT,METHOD and its SIGNATURE are created"); 
}
public static void main(String args[]) { //SIGNATURE
	FirstprogramDemo f = new FirstprogramDemo(); //OBJECT 'f'
	f.display();
	
}
}
