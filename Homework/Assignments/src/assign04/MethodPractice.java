package assign04;

/**
* Class: CS 1420
* Assignment 4: Method Practice
* @author Kenneth Morse
* @version 1/30/2025
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodPractice {
	// System.out.println("Checking _. Expecting a result of _. The actual result is " + _);

	public static void main(String[] args) {
		// Test litersToGallons
			//Testing expected 0
		System.out.println("Checking litersToGallons(3.7). Expecting a result of 0. The actual result is " + litersToGallons(3.7));
			//Testing positive int, rounding down
		System.out.println("Checking litersToGallons(20.65). Expecting a result of 5. The actual result is " + litersToGallons(20.65));
		
		// Test sumInRange
			// Testing negative number
		System.out.println("Checking sumInRange(-4, 10). Expecting a result of 45. The actual result is " + sumInRange(-4, 10));
			// Testing all positive 
		System.out.println("Checking sumInRange(0, 10). Expecting a result of 55. The actual result is " + sumInRange(-4, 10));
		
		//Test shiftCypher
			// full alphabet test
		System.out.println("Checking shiftCipher(\"abcdefghijklmnopqrstuvwxyz\", 11). Expecting a result of lmnopqrstuvwxyz{|}~ !\"#$%&\n"
				+ ". The actual result is " + shiftCipher("abcdefghijklmnopqrstuvwxyz", 11));
		
		//test

	}
	/**
	 * Converts Liters to Gallons using standard conversion factor
	 * @param liters assumed to be non-negative
	 * @return converted to Gallon Units rounding down to nearest whole number
	 */
	public static int litersToGallons(double liters) {
		return (int) (liters * 0.264172);
	}
	
	/**
	 * Sums all integers in provided range, assumes that beginning is less than end
	 * @param beginning
	 * @param end 
	 * @return sum of all integers in range of beginning and end
	 */
	public static int sumInRange(int beginning, int end) {
		int sum = 0;
		for(int i = beginning; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
	/**
	 * 
	 * @param message String
	 * @param key value that shiftCypher will shift chars by 
	 * @return String of shifted message 
	 */
	public static String shiftCipher(String message, int key) {
		String encrypted = "";
		
		for(int i = 0; i < message.length(); i++) {
		    if(message.charAt(i) + key > 126)
		        encrypted = encrypted + (message.charAt(i) + key - 127 + 32);
		    else
		        encrypted = encrypted + (message.charAt(i) + key);
		}
		return encrypted;
	}
	/**
	 * 
	 * @param inputSource, scanner file which you would like to read
	 * @return the number of integer zeros contained inside the file
	 */
	public static int countIntegerZeros(Scanner inputSource) {
		int input;
		int zeroCount = 0;
		while(inputSource.hasNext()) {
			try {
				input = inputSource.nextInt();
				if(input == 0) {
					zeroCount++;
				}
			} catch(InputMismatchException e) {
				inputSource.next();
			}
		}
		return zeroCount;
	}
	
	/**
	 * 
	 * @param sequence
	 * @param beginIndex If indices are not valid for provided char[], will return empty string
	 * @param endIndex 
	 * @return subarray of chars contained within the provided [] between the two indices
	 */
	public static String subsequenceString(char[]sequence, int beginIndex, int endIndex) {
		String subsequence = "";
		if(beginIndex == 0 || endIndex >= sequence.length) {
			return subsequence;
		}
		for(int i = beginIndex; i <= endIndex; i++) {
			subsequence = subsequence + sequence[i];
		}
		return subsequence;
	}
	/**
	 * 
	 * @param length
	 * @return char[] of specified length filled with semi-random chars 
	 */
	public static char[] generateCharArray(int length) {
		char[] charArray = new char[length];
		for(int i = 0; i < charArray.length; i++) {
			charArray[i] = (char)(i % 26 + 'A');
		}
		return charArray;
	}
	
	/**
	 * 
	 * @param length 
	 * @param offset
	 * @param shift
	 * @return a mystery encrypted message created using 3 of the above methods
	 */
	public static String mysteryMessage(int length, int offset, int shift) {
		char[] charArray = generateCharArray(length + offset);
		String message = subsequenceString(charArray, offset, charArray.length - 1);
		String encryptedMessage = shiftCipher(message, shift);
		return encryptedMessage;
		
	}
	
	

}
