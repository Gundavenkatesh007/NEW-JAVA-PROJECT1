package com.Inheritance;

 class CLUBX{
		int x=1; 
		int y=3;
		void m1() {
			System.out.println("sum :"+(x+y));
		}
 }		

class Club1 extends CLUBX{
	int x1 = 9;
			int y1 = 5;
	void m2() {
		System.out.println("mul :"+(x1*y1));
			}
}	

class Club2 extends CLUBX{
	int x2 = 20;
	int y2 = 10;
	void m3() {
		System.out.println("div :"+(x2/y2));
	    }
}

public class CLUB{
	public static void main(String args[]) {
		CLUBX c1 = new CLUBX();
		Club1 c2 = new Club1();
		Club2 c3 = new Club2();
		c1.m1();
		c2.m2();
		c3.m3();
			
	}
	
}
	

		
		
	
		
