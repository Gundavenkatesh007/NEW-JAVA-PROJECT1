package method_overloading;

public class Subtraction1 extends Subtraction {
	void sub(int y,int z) {
		System.out.println("result 2:"+(y-z));
			}

	public static void main(String args[]) {
		Subtraction1 s = new Subtraction1();
		Subtraction s1 = new Subtraction();
		s1.sub(16, 7);
		s.sub(9, 5);
	}  
}
