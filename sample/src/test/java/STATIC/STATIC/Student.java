package STATIC.STATIC;

public class Student {
	// creating 2 instance variables
	int rollno;
	String name;
	//creating 2 static variables
	static String college = "ACE";
	static String branch = "CSE";
	 //creating a constructor for variables
	Student(int r,String n){
		rollno = r;
		name = n;
	  		               }
	//creating static method 1
	 static void  change() {
		 branch = "ECE";
	 	 }
	 
	// Instance method1  to display values
	void display() {
		System.out.println(rollno+" "+name+" "+college+ " "+branch+" ");
	}
	//
	public static void main(String args[]) {
		// static method2 for printing static variables
		Student.change(); // static method2
		// creating objects for printing instance variables
		Student s1 = new Student(123, "Venkatesh");
		Student s2 = new Student(369, "Krishna");
		s1.display();  //Instance  method2 for calling
		s2.display();  //instance method1
	}
}
		
	
	



