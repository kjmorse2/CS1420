package lecture7;

public class Lecture7 {

	public static void main(String[] args) {
		double originalPrice = 2.79;
		int discountPercent = 30;
		double newPrice = salePrice(originalPrice, discountPercent);
		System.out.format("%.2f", newPrice);	
	}
	/**
	 * returns the discounted price of the item, or 0 if discounted more than 100%
	 * 
	 * Method Contract, agreement between caller and method about how method should work
	 * info comes from signature, documentation, limitations listed, ect.
	 * 
	 * Caller responsibilities = "preconditions"
	 * Callee/method responsibilities = "postconditions"
	 * 
	 * can also use "at" throws to show thrown exceptions if applicable 
	 * 
	 * @param originalPrice: in USD
	 * @param discountPercent must be  <100
	 * @return the discounted price of the object
	 */
	public static double salePrice(double originalPrice, double discountPercent) {
		
		if(discountPercent >= 100) { return 0; }
		
		double reducedPrice = (100 - discountPercent) * (originalPrice / 100);
		return reducedPrice;
	}
	
	// scope 

}
