package interfacedemo3;

 class Galaxy implements Planets,Universe {
	 public void m1() {
		 System.out.println("Our planet is Earth");
		 
	 }
public void m2() {
	System.out.println("All planets makes a Universe");
}

 public static void main(String args[]) {
	 Galaxy G = new Galaxy();
	 G.m1();
	 G.m2();
	 
 } 
 }
