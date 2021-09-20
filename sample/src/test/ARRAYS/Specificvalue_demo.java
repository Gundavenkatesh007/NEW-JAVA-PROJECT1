package ARRAYS;

public class Specificvalue_demo {
	
			  public static void main(String[] args) {

		    int[] num = {2, 9, 11, 65, 15};
		    int toFind = 11;
		    boolean found = false;

		    for (int n : num) {
		      if (n == toFind) {
		        found = true;
		        break;
		      }
		    }
		    
		    if(found)
		      System.out.println(toFind + " is found.");
		    else
		      System.out.println(toFind + " is not found.");
		  }
		}


