package ARRAYS;

	import java.util.*; 
	import java.io.*; 
	
	public class Numbers {
	 public static void main(String[] args)
	 {
	    int[] array_nums = {12,13};
		System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		int num1 = 12;
	    int num2 = 13;
		
		System.out.println("Result: "+result(array_nums, num1, num2));
	    }	
	  
	  public static boolean result(int[] array_nums, int num1, int num2) {
	    for (int number : array_nums) {
	      boolean r = number != num1 && number != num2;
	      if (r) {
	        return false;
	        }
	     }
	        return true;
	   }
	}



