package ARRAYS;



	import java.util.*;
	public class Remove_duplicateElement {
		// Java Program to Remove Duplicate Elements
		// From the Array using Set

	

		// Function to remove duplicate from array
		public static void removeDuplicates(int[] a)
		{
			LinkedHashSet<Integer> set
				= new LinkedHashSet<Integer>();

			// adding elements to LinkedHashSet
			for (int i = 0; i < a.length; i++)
				set.add(a[i]);

			// Print the elements of LinkedHashSet
			System.out.print(set);
		}

		// Driver code
		public static void main(String[] args)
		{
			int a[] = {3,2,7,9,9,6,7,5,2,8,5};
		
			// Function call
			removeDuplicates(a);
		}
	}



