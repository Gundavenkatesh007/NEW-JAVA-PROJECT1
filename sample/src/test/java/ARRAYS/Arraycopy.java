package ARRAYS;

public class Arraycopy {
	public static void main(String args[]) {
		int [] arr1 =new int[] {6,11,33,12,21};
		int [] arr2=  new int[arr1.length];
	
		for(int i = 0;i< arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println(" Elements of original array: ");
		for(int i = 0;i < arr1.length;i++){
		
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		
		
		System.out.println("Elements of new array: ");
				for(int  i = 0;i < arr2.length;i++)
		{
			System.out.print(arr2[i]+ " " );
		}
		
	}
				
		}
		
		
	

