package com.AccessModifier.Modifiers; 

public class Main {
	

	
	    private int a = 10;
	    public void makeInner()
	    {
	        SubClass in = new SubClass();
	        in.inner();
	    }
	    class SubClass
	    {
	        public void inner()
	        {
	            System.out.println("Super a is " + a);
	        }
	    }
	    public static void main(String[] args)
	    {
	        Main.SubClass s = new Main().new SubClass();
	        s.inner();
	    }
	}
