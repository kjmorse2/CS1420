package lab06;

public class FractionPractice {

	public static void main(String[] args) {
		Fraction fiveOverOne = new Fraction(5,1);
		
		Fraction oneOverTwo = new Fraction(1,2);
		
		Fraction threeOverFour = new Fraction(3,4);
		
		Fraction oneOverOne = new Fraction(1,1);
		
		// Fraction[] reductions = new Fraction[4];
		
		Fraction Queben = new Fraction(42,56);
		
		Queben.reduce();
		
//		reductions[1] = new Fraction(10, 100);
//		reductions[2] = new Fraction(16,64);
//		reductions[0] = new Fraction(66,99);
//		reductions[3] = new Fraction(128,256);
//		
//		
//		for(Fraction i : reductions) {
//			i.reduce();
//			System.out.println(i.toString());
//		}

	}

}
