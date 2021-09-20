package STRINGS.Strings;

public class Substring_Demo {
	public static void main(String args[]) {
		String s = new String ("Speechless");
		String sub1 = s.substring(0,5);
		String sub2 = s.substring(0,6);
		String sub3 = s.substring(0,10);
		String sub4 = s.substring(6,10);
		String sub5 = s.substring(6);
		System.out.println(s.substring(0,5));
		System.out.println(s.substring(0,6));
		System.out.println(s.substring(0,10));
		System.out.println(s.substring(6,10));
		System.out.println(s.substring(6)); //overloading because same name but different implementation.
		
					}
}
	 
 
	


