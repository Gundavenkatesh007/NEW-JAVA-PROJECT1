package COLLECTIONS.java_collections;
import java.util.*;

public class HashSetExample {
	public static void main(String args[]) {
		HashSet<String> hs = new HashSet<String>();
		// By using add operation adding elements into the HashSet
		hs.add("Kohli");
		hs.add("Rohit");
		hs.add("Pujara");
		hs.add("Rahane");
		hs.add("Pant");
		hs.add("Jaddu");
		hs.add("Bumrah");
		hs.add("Siraj");
		hs.add("Shami");
		hs.add("Thakur");
		System.out.println(hs);
		// to check the size of the hashset
		System.out.println(hs.size());
		
				//  to remove a particular element
		hs.remove("Rahane");
		System.out.println(hs);
		// using contains method
		System.out.println(hs.contains("Siraj"));
		// using isEmpty method
		System.out.println(hs.isEmpty());
		// using Iterator method
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		// to remove all the elements present in a hashset
			hs.clear();
			System.out.println(hs);
		}
	}
}

