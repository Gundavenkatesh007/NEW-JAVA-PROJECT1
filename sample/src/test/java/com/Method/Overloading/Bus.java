package com.Method.Overloading;

public class Bus {
	void Display(int x) {
		System.out.println("Bus no:"+x);
	}
void Display(String name) {
	System.out.print("Bus name:"+name);
}
public static void main(String args[]) {
	Bus b = new Bus();
	b.Display(125);
	b.Display("KPHB");
}
}
