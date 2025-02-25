package lab06;

/**
 * This class represents a fraction; e.g., 1/2.
 * 
 * @author Erin Parker and Eric Heisler
 * @version 2023-9-20
 */
public class Fraction {
	
	private int numerator;
	private int denominator;
	
	/**
	 * This constructor builds a "default" Fraction object 0/1.
	 */
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	
	/**
	 * This constructor builds a Fraction object, given a numerator and denominator.
	 * 
	 * @param numerator - value for initializing the numerator
	 * @param denominator - value for initializing the denominator
	 */
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	/**
	 * 
	 * @param numerator
	 */
	public Fraction(int numerator) {
		this.numerator = numerator;
		this.denominator = 1;
	}
	
	/**
	 * 
	 */
	public void reciprocal() {
		
		int buffer = this.numerator;
		this.numerator = this.denominator;
		this.denominator = buffer;
		
	}
	
	/**
	 * This method computes the GCD of this Fraction object's numerator and denominator.
	 * 
	 * @return the GCD
	 */
	private int gcd(int a, int b) {
	   if(b == 0) {
		   return a;
	   }
	   
	   return gcd(b, a%b);
	   
	}
		
	/**
	 * This method reduced this Fraction object to its simplest form.
	 */
	public void reduce() {
		int gcd = this.gcd(this.numerator, this.denominator);
		
		System.out.println(gcd);
		
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	
	/**
	 * Getter method for accessing the numerator of this Fraction object.
	 * 
	 * @return the numerator
	 */
	public int getNumerator() {
		return numerator;
	}
	
	/**
	 * Getter method for accessing the denominator of this Fraction object.
	 * 
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}
	
	/**
	 * This method calculates the decimal-point equivalent of this Fraction object.
	 * 
	 * @return the decimal-point equivalent
	 */
	public double toDouble() {
		return numerator / (double) denominator;
	}
	
	/**
	 * This method generates a textual representation of this Fraction object.
	 * 
	 * @return a string containing the textual representation
	 */
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	/**
	 * This method determines whether this Fraction object and the given
	 * object are equal.
	 * 
	 * @param other - the other object to compare
	 * @return true if the two objects are equal, false otherwise
	 */
	public boolean equals(Object other) {
		if (!(other instanceof Fraction otherFraction))
			return false;
        return this.numerator == otherFraction.numerator &&
				this.denominator == otherFraction.denominator;
	}
}