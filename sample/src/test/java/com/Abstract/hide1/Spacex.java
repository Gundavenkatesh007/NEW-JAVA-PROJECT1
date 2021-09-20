package com.Abstract.hide1;
	
	class Spacex extends  Rocket {   //inheriting abstract class
        void speed() {               // overriding abstract method
     	   System.out.println("17600 miles per hour");
     	   
        }


public static void main(String args[]) {
	   Spacex s = new Spacex();
	   s.display();
	   s.speed();
	   
	
}
}
		
