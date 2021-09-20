package INTERFACES.interfacedemo1;

 class Cars2  implements Cars{
	 public void m2() {
		 System.out.println("It's a brand new car");
	 }
public static void main(String args[]) {
	Cars2 C = new Cars2();
	C.m2();
	
}
@Override
public void m1() {
	// TODO Auto-generated method stub
	
}
}
