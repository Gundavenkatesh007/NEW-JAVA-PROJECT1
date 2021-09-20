package ARRAYS;

	import java.util.Arrays;  
	public class SecondLargestElement {
		
	public static int getSecondLargest(int[] a, int total){  
	Arrays.sort(a);  
	return a[total-2];  
	}  
	public static void main(String args[]){  
	int a[]={21,12,45,96,13,2};  
	int b[]={54,63,99,14,3,22,45};  
	System.out.println("Second Largest: "+getSecondLargest(a,6));  
	System.out.println("Second Largest: "+getSecondLargest(b,7));  
	}}  


