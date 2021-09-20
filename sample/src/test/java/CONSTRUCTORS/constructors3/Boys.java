package CONSTRUCTORS.constructors3;

public class Boys {
	int rollno;
	String name;
	String branch;
	public static void main(String args[]) {
		
		 Boys b1 = new Boys();
		Boys b2 = new Boys(20,"venky");
		Boys b3 = new Boys("cse");
		Boys b4 = new Boys(30,"Ram","ece");
		
	}
	 Boys() {                            //default constructor
		 		System.out.println();
	}
	 				
	  	private Boys(int x,String n) {   //private constructor
		rollno =x;
		name = n;
		System.out.println(rollno+" " +name);
	}
	protected Boys(String b) {           //protected constructor
		branch = b;
		System.out.println(branch);
	}
	public Boys(int x,String n,String b) {  // public constructor
		rollno = x;
		name = n;
		branch = b;
				System.out.println(name+" "+rollno+" "+branch);
	}
	
				
	

}
