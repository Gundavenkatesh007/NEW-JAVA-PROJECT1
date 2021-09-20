package COLLECTIONS.java_collections;
import java.util.*;

public class Hashmap1 {
public static void main(String args[]) {
	//creating a Hashmap
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	 //Adding Student names and Student id's into the HashMAp
	hm.put(111,"venky");
	hm.put(121,"Rajesh");
	hm.put(131,"Suresh");
	hm.put(142,"Naresh");
	hm.put(157,"Natalia");
	hm.put(168,"Justin");
	hm.put(171,"Tesla");
	hm.put(184,"Jhon");
	hm.put(195,"Kiran");
	hm.put(200,"Ayan");
	// To print all key-value pairs
	System.out.println(hm);
	// to Fetch the value of a key
	System.out.println(hm.containsKey(171));
	// Cloning hashmap
	System.out.println("Original hashmap: " + hm);
	//clone method
	System.out.println("The cloned hashmap is :" + hm.clone());
	// Checking given is present in the Hashmap
	int keyToBeChecked = 195;
	System.out.println(hm);
	boolean isKeypresent = hm.containsKey(keyToBeChecked);
	System.out.println("Does key " +keyToBeChecked + "  exists :" + isKeypresent);
	// checking given value is present in the Map
	String valueToBeChecked = "Justin";
	System.out.println(hm);
	boolean isValuepresent = hm.containsValue(valueToBeChecked);
	System.out.println("Does value "  +  valueToBeChecked  +  "  exists: " + isValuepresent);
	// to check if the map is Empty or not
	System.out.println("Is the  Map Empty ? " +hm.isEmpty()); // returns true if the map is empty otherwise returns false.
	// to print the Size of the map to console
	System.out.println(hm.size());
	// To print all the keys of the map to console
	System.out.println(hm.keySet());
	// To remove specific key value pair
	hm.remove(157,"Natalia");
	System.out.println(hm);
	//copying all elements of map into another hashmap
	System.out.println("Initial mappings are: " + hm);
	//creating a new hashmap
	HashMap<Integer,String> newhash_map = new HashMap<Integer,String>();
	newhash_map.putAll(hm); //copying all mappings from intial hashmap to new Hashmap
	System.out.println("The new hashmap look like this : " +newhash_map);
			}
}
