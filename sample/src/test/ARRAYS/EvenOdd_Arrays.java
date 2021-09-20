package ARRAYS;

	import java.util.Arrays; 
	public class EvenOdd_Arrays {
	 public static void main(String[] args)
	 {
	    int[] array_nums = {3, 8, 12, 5, 9};
		System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		int num = 0;
		for(int i = 0; i < array_nums.length; i++)
		{
			if(array_nums[i] % 2 == 0)
				num++;
		}
		System.out.println("Number of even numbers : "+num);
		System.out.println("Number of odd numbers  : "+(array_nums.length-num));
	 }
	}



