package ARRAYS;

public class DuplicateElement {
	public static  void main(String args[]) {
		int [] arr = new int[] {1,2,3,4,3,5,6,8,8,2};
		
		System.out.println("Duplicate elements in the  given array: ");
		for(int i = 0;i < arr.length;  i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j])
					System.out.println(arr[j]);
				
			}
		}
		
	}

}
