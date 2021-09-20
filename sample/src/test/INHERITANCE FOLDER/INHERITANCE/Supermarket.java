package INHERITANCE;

public class Supermarket {
	int getStockprice() {return 0;}
}
	 class RelianceMart extends Supermarket{
	int getStockprice() {return 4500;}
	 }
	 
	 class Dmart extends Supermarket{
		 int getStockprice() {return 4000;}
	 }
	 class Bigbazar extends Supermarket{
		 int getStockprice() {return 3500;}
	 }
	  
	 class Runtimepolymorphismdemo{
		 Supermarket s = new RelianceMart();
		 System.out.println(+s.getStockprice());
		 
		
}
