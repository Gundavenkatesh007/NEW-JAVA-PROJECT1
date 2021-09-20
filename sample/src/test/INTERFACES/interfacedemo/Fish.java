package interfacedemo;

class Fish implements Birds{
	public void m1() {
		System.out.println("we can fly");
	}
	public static void main(String args[]) {
		Fish F = new Fish();
		F.m1();
		
	}
	

}


