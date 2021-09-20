package com.AccessModifiers.Plants2;

import com.AccessModifiers.Plants1.ROSES;

//Accessing public class public fields and public methods in different class in different package.

public class LILLYS2  {
	public static void main(String args[]) {
		ROSES R1 = new ROSES();
		System.out.println(R1.x);
		R1.m1();
			
		
		
	}

}
