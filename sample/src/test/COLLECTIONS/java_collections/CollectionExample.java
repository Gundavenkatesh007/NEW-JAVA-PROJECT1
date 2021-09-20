package java_collections;
import java.util.*;

public class CollectionExample {
	public static void main(String args[]) {
		ArrayList<String> alist = new ArrayList<String>();
		
		alist.add("Venky");
		alist.add("Justin");
		alist.add("Mike");
		alist.add("Ram");
		alist.add("John");
		alist.add("Virat");
		alist.add("Sehwag");
		alist.add("Yuvi");
		alist.add("Pant");
		alist.add("Joe");
		
		System.out.println(alist);
		//Adding a new element to the ArrayList
		alist.add("Dhoni");
		System.out.println(alist);
		// Iterating ArrayList
		for(String str:alist)
			System.out.println(str);
		//Adding an element at a specific index
		alist.add(2,"Raayudu");
		System.out.println(alist);
		//Removing an element from the ArrayList
		alist.remove("Pant");
		System.out.println(alist);
		alist.remove(4);
		System.out.println(alist);
		// Updating the element at a specific index
		alist.set(3,"Pandya");
		System.out.println(alist);
		//Checking the element is present at a Specific index
		if(alist.contains("Sehwag")) {
			System.out.println("Sehwag is available in List");
		}
		else {
			System.out.println("Not Available");
		}
		// Get an element at a particular index
		String player = alist.get(5);
		System.out.println("Batsman : " + player);
		// Size of the ArrayList
		System.out.println("There are " +alist.size()+ "  elements in the ArrayList");
		//checking whether the given element is present in the ArrayList
		if(alist.contains("Venky")) {
			System.out.println("Venky is available in the ArrayList");
		}
		else {
			System.out.println("not available in the list");
		}
		// Removing all the elements in ArrayList
		alist.clear();
		}
		}
		
	
	


		
		
		
		
		
		
		
		
		

