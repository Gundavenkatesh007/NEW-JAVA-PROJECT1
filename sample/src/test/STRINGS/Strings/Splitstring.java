package STRINGS;

public class Splitstring {
	public static void main(String args[]) {
		String s = "venkateshvenky@gmail";
		String[] arrofs = s.split("@",2);
		
		for (String a : arrofs)
		System.out.println(a);
		
	}

}
