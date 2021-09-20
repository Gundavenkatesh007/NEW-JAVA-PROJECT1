package method_overloading;

public class Addition1 {
	String s = "Raj";
	
	public int Add(int x,int y) {
		System.out.println("value 1:"+x);
		return x;
	}
//	public int Add(int x,int y,int z) {
//		System.out.println("value 2:"+y);
//		return s;                     // it is not possible in by creating two methods with same name
		                              // and same parameters of same datatype and returning different return type
	
		
//	}

}
