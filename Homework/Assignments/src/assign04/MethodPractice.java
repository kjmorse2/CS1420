package assign04;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Class: CS 1420
* Assignment 4: Method Practice
* @author Kenneth Morse
* @version 1/30/2025
*/


public class MethodPractice {
	public static void main(String[] args) {
		
		// Test litersToGallons
		System.out.println("TESTING LITERS TO GALLONS");
			// given tests
			System.out.println("Checking litersToGallons(3.7). Expecting a result of 0. The actual result is: " + litersToGallons(3.7));
			System.out.println("Checking litersToGallons(20). Expecting a result of 5. The actual result is: " + litersToGallons(20));
			// My Tests
			System.out.println("Checking litersToGallons(100000000). Expecting a result of 26417200. The actual result is: " + litersToGallons(100000000));
			System.out.println("Checking litersToGallons(0). Expecting a result of 0. The actual result is: " + litersToGallons(0));
			System.out.println("Checking litersToGallons(6.981). Expecting a result of 1. The actual result is: " + litersToGallons(6.981));
			System.out.println();

		// Test sumInRange
		System.out.println("TESTING SUM IN RANGE");
			// given tests
			System.out.println("Checking sumInRange(-4, 10). Expecting a result of 45. The actual result is: " + sumInRange(-4, 10));
			System.out.println("Checking sumInRange(5, 5). Expecting a result of 5. The actual result is: " + sumInRange(5, 5));
			// my tests
			System.out.println("Checking sumInRange(0, 10). Expecting a result of 55. The actual result is: " + sumInRange(0, 10));
			System.out.println("Checking sumInRange(-1000, 1000). Expecting a result of 0. The actual result is: " + sumInRange(-1000, 1000));
			System.out.println("Checking sumInRange(-999, 1000). Expecting a result of 1000. The actual result is: " + sumInRange(-999, 1000));

			System.out.println();
			
			
		//Test shiftCypher
		System.out.println("TESTING SHIFT CYPHER");
			// given tests
			System.out.println("Checking shiftCipher(\"(Zest!)\", 15). Expecting a result of 7it#$08. The actual result is: " + shiftCipher("(Zest!)", 15));
			System.out.println("Checking shiftCipher(\"hello\", 3). Expecting a result of khoor. The actual result is: " + shiftCipher("hello", 3));
			// my tests
			System.out.println("Checking shiftCipher(\"abcdefghijklmnopqrstuvwxyz\", 11). Expecting a result of lmnopqrstuvwxyz{|}~ !\"#$%&. The actual result is " + shiftCipher("abcdefghijklmnopqrstuvwxyz", 11));
			System.out.println("Checking shiftCipher(\"hello\", 11). Expecting a result of spwwz. The actual result is: " + (String)shiftCipher("hello", 11));
			System.out.println("Checking shiftCipher(\"\", 1). Expecting a result of . The actual result is: " + (String)shiftCipher("", 1));
			System.out.println();

			
		//Test countIntegerZeros
		System.out.println("TESTING COUNT INTEGER ZEROS");
			// given test
			System.out.println("Checking countIntegerZeros(new Scanner(\"hello 0 10 0.0 string0 0\"). Expecting a result of 2. The actual result is: " + countIntegerZeros(new Scanner("hello 0 10 0.0 string0 0")));
			// my tests
			System.out.println("Checking countIntegerZeros(new Scanner(\"hello 1 10 0.0 string0 2 6 5 77 j67 j083aks 0a\"). "
			+ "Expecting a result of 0. The actual result is: " + countIntegerZeros(new Scanner("hello 1 10 0.0 string0 2 6 5 77 j67 j083aks 0a")));
			System.out.println("Checking countIntegerZeros(new Scanner(\"\"). "
			+ "Expecting a result of 0. The actual result is: " + countIntegerZeros(new Scanner("")));
			System.out.println("Checking countIntegerZeros(new Scanner(\"0 hey 0 1.4 0 true 0 false 0 whoah \\n\\n 0\"). "
			+ "Expecting a result of 6. The actual result is: " + countIntegerZeros(new Scanner("0 hey 0 1.4 0 true 0 false 0 whoah \n\n 0")));
			System.out.println();


		//Test subsequenceString
		System.out.println("TESTING SUBSEQUENCE STRING");
			// given tests
			System.out.println("Checking subsequenceString(new char[]{'t', 'o', 'd', 'o', 'g', 'o'}, 2, 4). Expecting a result of dog. The actual result is: " + subsequenceString(new char[]{'t', 'o', 'd', 'o', 'g', 'o'}, 2, 4));
			System.out.println("Checking subsequenceString(new char[]{'t', 'o', 'd', 'o', 'g', 'o'}, 1, 6). Expecting a result of . The actual result is: " + subsequenceString(new char[]{'t', 'o', 'd', 'o', 'g', 'o'}, 1, 6));
			// my tests
			System.out.println("Checking subsequenceString(new char[]{'z', 'e', 'a', 'p', 'i', 'c', 'k', 'l', 'e', 'z', 'y', 'x'}, 3, 8). "
			+ "Expecting a result of pickle. The actual result is: " + subsequenceString(new char[]{'z', 'e', 'a', 'p', 'i', 'c', 'k', 'l', 'e', 'z', 'y', 'x'}, 3, 8));
			System.out.println("Checking subsequenceString(new char[]{'a', 'b', 'c'}, 1, 2). "
			+ "Expecting a result of bc. The actual result is: " + subsequenceString(new char[]{'a', 'b', 'c'}, 1, 2));
			System.out.println("Checking subsequenceString(new char[]{}, 1, 2). "
			+ "Expecting a result of \"  \". The actual result is: \"" + subsequenceString(new char[3], 1, 2) + "\"");
			System.out.println();
			
		// Test generateCharArray
		System.out.println("TESTING GENERATE CHAR ARRAY");
			// given test
			System.out.println("Checking generateCharArray(5). Expecting a result of [A, B, C, D, E]. The actual result is: " + Arrays.toString(generateCharArray(5)));
			// my tests
			System.out.println("Checking generateCharArray(0). Expecting a result of []. The actual result is: " + Arrays.toString(generateCharArray(0)));
			System.out.println("Checking generateCharArray(1). Expecting a result of [A}. The actual result is: " + Arrays.toString(generateCharArray(1)));
			System.out.println("Checking generateCharArray(27). Expecting a result of [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, A]."
			+ " The actual result is: " + Arrays.toString(generateCharArray(27)));
			System.out.println();

		
		// Test mysteryMessage
		System.out.println("TESTING MYSTERY MESSAGE");
			// given tests
			System.out.println("Checking mysteryMessage(8,2,4). Expecting a result of  GHIJKLMN. The actual result is: " + mysteryMessage(8,2,4));
			System.out.println("Checking mysteryMessage(5,88,99). Expecting a result of  OPQRS. The actual result is: " + mysteryMessage(5,88,99));
			// my tests
			System.out.println("Checking mysteryMessage(1,1,1). Expecting a result of C. The actual result is: " + mysteryMessage(1,1,1));
			System.out.println("Checking mysteryMessage(8,1,126). Expecting a result of abcdefgh. The actual result is: " + mysteryMessage(8,1,126));
			System.out.println("Checking mysteryMessage(7,8,126). Expecting a result of hijklmn. The actual result is: " + mysteryMessage(7,8,126));

	}
	
	/**
	 * Converts Liters to Gallons using conversion factor
	 * @param liters assumed to be non-negative
	 * @return converted to gallons rounding down to nearest whole number
	 */
	public static int litersToGallons(double liters) {
		return (int) (liters * 0.264172);
	}
	
	/**
	 * Sums all integers in provided range, assumes that beginning is less than or equal to end
	 * @param beginning
	 * @param end 
	 * @return sum of all integers in range of beginning and end
	 */
	public static int sumInRange(int beginning, int end) {
		int sum = 0;
		for(int i = beginning; i <= end; i++)
			sum += i;
		
		return sum;
	}
	/**
	 * basic shift cipher, shifts ascii values starting at " " (Space Character), value 32 to "~" (tilde character) value 126
	 * inclusive 
	 * @param message String
	 * @param key value that shiftCypher will shift chars by 
	 * @return String of shifted message 
	 */
	public static String shiftCipher(String message, int key) {
		String encrypted = "";
		
		for(int i = 0; i < message.length(); i++) {
		    if(message.charAt(i) + key > 126)
		        encrypted = encrypted + (char)(message.charAt(i) + key - 127 + 32);
		    else
		        encrypted = encrypted + (char)(message.charAt(i) + key);
		}
		
		return encrypted;
	}
	
	/**
	 * counts number of integer zeros in a given input
	 * @param inputSource, scanner file which you would like to read
	 * @return the number of integer zeros contained inside the file
	 */
	public static int countIntegerZeros(Scanner inputSource) {
		int input;
		int zeroCount = 0;
		
		while(inputSource.hasNext()) {
			try {
				input = inputSource.nextInt();
				if(input == 0)
					zeroCount++;
			} catch(InputMismatchException e) {
				inputSource.next();
			}
		}
		
		return zeroCount;
	}
	
	/**
	 * Concatenates characters in a char array between specified indices into a string 
	 * @param sequence char array that is to be turned into a string
	 * @param beginIndex index of char to start of substring [] (inclusive)
	 * @param endIndex index of char to end substring of char[] (inclusive)
	 * @return subsequence String of chars contained within the provided char [] between the two indices, inclusive
	 */
	public static String subsequenceString(char[]sequence, int beginIndex, int endIndex) {
		String subsequence = "";
		if(beginIndex == 0 || endIndex >= sequence.length)
			return subsequence;

		for(int i = beginIndex; i <= endIndex; i++)
			subsequence = subsequence + sequence[i];
		
		return subsequence;
	}
	
	
	/**
	 * generates char array of specified length and fills with consecutive capital letters
	 * @param length
	 * @return char[] of specified length filled with semi-random chars 
	 */
	public static char[] generateCharArray(int length) {
		char[] charArray = new char[length];
		
		for(int i = 0; i < charArray.length; i++)
			charArray[i] = (char)(i % 26 + 'A');
		
		return charArray;
	}
	
	/**
	 * generates mystery message using previously defined methods
	 * @param length initial length to use in combination with offset to call generateCharArray
	 * @param offset start of subsequence to be selected from generated char []
	 * @param shift integer to be passed to shiftCypher to shift whole string
	 * @return a mystery encrypted message created using 3 of the above methods
	 */
	public static String mysteryMessage(int length, int offset, int shift) {
		char[] charArray = generateCharArray(length + offset);
		String message = subsequenceString(charArray, offset, charArray.length - 1);
		String encryptedMessage = shiftCipher(message, shift);
		return encryptedMessage;
	}
}
