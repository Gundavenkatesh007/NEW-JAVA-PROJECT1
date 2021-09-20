package EXCEPTIONS.arithmeticException;

import java.util.*;

 class NosuchFieldDemo{
	 
	private Object obj;
	
	NosuchFieldDemo()
	
	{
		
	class Arr{
			};
	
	obj = new Arr();
	
		}
	public static void main(String args[]) throws ClassNotFoundException,NoSuchFieldException{
		
		NosuchFieldDemo t = new NosuchFieldDemo();
		
		Class myClass = t.obj.getClass();
		String fieldName = "obj";
		
		try {
			System.out.println(fieldName + "Field of myClass :" + myClass.getField(fieldName));
		}
catch(Exception e) {
	System.out.println(e);
}
}
 }
