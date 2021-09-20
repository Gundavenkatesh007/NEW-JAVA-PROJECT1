package INTERFACES.interfacedemo6;

 class Jackfruit implements Mango {
	public void m1() {
		System.out.println("These fruits are awesome");
			}
	public void m2() {
		System.out.println("I like these fruits");
			}
	public static void main(String args[]) {
		Jackfruit J = new Jackfruit();
		J.m1();
		J.m2();
		
	}

}
