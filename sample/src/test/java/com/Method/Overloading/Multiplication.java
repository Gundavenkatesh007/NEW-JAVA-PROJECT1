package com.Method.Overloading;

public class Multiplication {
	void mul(int x,int y) {
		System.out.println("Result 1:"+((x*y)));
		
	}
	
	void mul(int x,int y,int z) {
		System.out.println("Result 2:"+((x*y*z)));
	}
	public static void main(String args[]) {
		Multiplication m = new Multiplication();
		m.mul(8,7);
		m.mul(3,6,5);
	}

}
