package com.Method.Overloading;

public class Addition {
	void Add(int x,int y) {
		System.out.println("Result 1:"+(x+y));
		
	}
   void Add(int x,double y,float z) {
	   System.out.println("Result 2:"+(x+y+z));
   }
   public static void main(String args[]) {
	   Addition  a = new Addition();
	   a.Add(5,99);
	   a.Add(8,6.8,5);
   }
}
