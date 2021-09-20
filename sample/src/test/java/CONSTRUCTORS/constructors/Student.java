package CONSTRUCTORS.constructors;

public class Student {
	
	int rollno;
	String name;
	
	public static void main(String args[]) {
		Student s = new Student();
		Student s1 = new Student(131);
		Student s2 = new Student(100,"VENKATESH");
		
	}
	Student(){             //default constructor
	System.out.println();
	}
	
	Student(int x){       // single argument constructor
		rollno = x;
		System.out.println(+rollno);
			}
	Student(int x,String n){ // two argument constructor 
		rollno = x;
		name = n;
		System.out.println(name+"---->"+rollno);
	}

}
