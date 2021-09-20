package LOOPS;

public class Pallindrome {
	public static void main(String args[]) {
		int n=414,r,s=0;
		int t =n;
		while(n>0) {
		r=n%10;
		n=n/10;
		s= s*10+r;
	}
	if(t==s)
		System.out.println("The number is a pallindrome");
	else
		System.out.println("The number is not a pallindrome");
	}

}
