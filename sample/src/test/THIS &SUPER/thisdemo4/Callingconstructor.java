package thisdemo4;

import thisdemo4.Callingconstructor;

public class Callingconstructor {

	// Java code for using this() to
		// invoke current class constructor
		

		
			int a;
			int b;

			//Default constructor
			Callingconstructor()
			{
				this(10, 20);
				System.out.println("Inside default constructor \n");
			}
			
			//Parameterized constructor
			Callingconstructor(int a, int b)
			{
				this.a = a;
				this.b = b;
				System.out.println("Inside parameterized constructor");
			}

			public static void main(String[] args)
			{
				Callingconstructor object = new Callingconstructor();
			}
		}

