package ARRAYS;

import java.util.Scanner;



public class Averagevalue_ofanarray {
	public static void main(String args[]) {
		int n,sum=0;
		float average;
		Scanner s = new Scanner(System.in);
		System.out.println("enter no. of  elements you want in array:");
		 n = s.nextInt();
		int a[]= new int[n];
		System.out.println("enter all the elements:");
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			sum = sum + a[i];
			System.out.println("Sum:" +sum);
		}
			average = (float)sum/n;
		System.out.println("Average:" +average);
				
					}
		 
	}
	


