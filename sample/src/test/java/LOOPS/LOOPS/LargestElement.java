package LOOPS.LOOPS;
public class LargestElement {
	
	public static void main(String[] args) {
		
		int arr[] = {50,45,30,90,10};
		int max=arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(arr[i]>max) 
				max=arr[i];
		}
				System.out.println("the largest number in the array :" +max);
							}
		}
	


