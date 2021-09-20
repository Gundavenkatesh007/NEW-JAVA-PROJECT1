package STRINGS.Strings;

public class Compare {
	public static void main(String args[]) {
		String s1 = new String("world");
		String s2 = "world";
		String s3 = "morld";
		System.out.println(s2.compareTo(s1)); // returns 0
		System.out.println(s1.compareTo(s3));// returns positive
		System.out.println(s3.compareTo(s1));// returns negative
	}

}
