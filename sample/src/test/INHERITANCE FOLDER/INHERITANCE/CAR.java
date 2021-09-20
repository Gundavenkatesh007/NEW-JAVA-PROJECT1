package INHERITANCE;

 class CAR1 {
	void m1() {
		System.out.println("Ferrari");
	}
	
}
class CAR2 extends CAR1{
	void m1() {
		System.out.println("Aston Martin");
		
	}
}
class CAR3 extends CAR1{
	void m1() {
		System.out.println("BENZ");
	}
}

public class CAR{
	public static void main(String args[]) {
		CAR1 c1  = new CAR1();
		CAR2 c2 = new CAR2();
		CAR3 c3 = new CAR3();
		
		CAR1 ref;
		ref = c1;
		ref.m1();
		
		
		ref = c2;
		ref.m1();
		
		
		ref = c3;
		ref.m1();
		
		
		
		
	}
	
}

