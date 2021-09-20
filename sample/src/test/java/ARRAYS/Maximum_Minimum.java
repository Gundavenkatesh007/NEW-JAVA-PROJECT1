package ARRAYS;


	  import java.util.Arrays;
	  public class Maximum_Minimum {
	    public static void main (String args[]){
	       int numbers[]= {11,15,-90,12,-13,69, 16,37,41,-7};
	       //Find minimum (lowest) value in array using loop
	       System.out.println("Minimum Value = " + getMinValue(numbers));
	       //Find maximum (largest) value in array using loop
	       System.out.println("Maximum Value = " + getMaxValue(numbers));
	    }
	       //Find maximum (largest) value in array using loop
	       public static int getMaxValue(int[] numbers){
	           int maxValue = numbers[0];
	           for(int i=1;i<numbers.length;i++){
	               if(numbers[i] > maxValue){
	                   maxValue = numbers[i];
	               }
	           }
	           return maxValue;
	       }
	       //Find minimum (lowest) value in array using loop
	       public static int getMinValue(int[] numbers){
	           int minValue = numbers[0];
	           for(int i=1;i<numbers.length;i++){
	               if(numbers[i] < minValue){
	                   minValue = numbers[i];
	               }
	           }
	           return minValue;
	       }

}
