package ARRAYS;
import java.io.*;
import java.util.*;

public class CommonElement {
	//Function to create hashsets from arrays and
	//find their common elements
	public static void FindCommonElements(int[] arr1,int[] arr2)
	{
		// create hashset
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		//Adding elements from array 1
		
		for( int i : arr1) {
			set1.add(i);
					}
		
		//Adding elements from array 2
		for( int i : arr2) {
			set2.add(i);
		}
		// use retainAll() to find common element
		set1.retainAll(set2);
		System.out.println("Common Elements- "+set1);
		}
	//main method
	public static void main(String [] args) {
		//create Array1
		int [] arr1 = {1,4,59,16,25,36,49,64,81,100};
		int [] arr2 = {100,19,21,59,62,4,32,25,46,60};
		//print array1
		
		System.out.println("Array1 :"  + Arrays.toString(arr1));
		System.out.println("Array 2:"  + Arrays.toString(arr2));
		
		FindCommonElements (arr1, arr2);
	}
}

	
	


