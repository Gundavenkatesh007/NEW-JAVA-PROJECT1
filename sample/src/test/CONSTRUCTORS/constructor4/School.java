package constructor4;
                                  
	
	public class School {  
		//instance variables of the class  
		int id;  
		String name;  
		  
		School(int i, String n){  
		id = i;  
		name = n;  
		}  
		  
		public static void main(String[] args) {  
		//object creation  
		School s = new School(10,"Raghu");  
		//printing instance variables  
		System.out.println(s.id); //prints 10  
		System.out.println(s.name); //prints Raghu  
		}  
		}  
// In general,the java constructor doesn't return any specific value,
//which can directly affect the code because it is not like a normal method used in the java code.
	//the fact that a constructor is not directly called by the java code infect is called by .
//the memory allocation and object initialization code at runtime.