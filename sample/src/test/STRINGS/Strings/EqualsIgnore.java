package STRINGS;

public class EqualsIgnore {
	public static void main(String args[]) {
		String s1 = new String("venkatesh");
		String s2 = "VENKATESH";
		String s3 = "BATMAN";
		String s4 = new String("MAN");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.equalsIgnoreCase(s1));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		
	}

}
