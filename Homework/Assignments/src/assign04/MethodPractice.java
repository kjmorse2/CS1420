package assign04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class: CS 1420 
 * Assignment 4: Method Practice
 * @author Kenneth Morse
 * @version 2/13/2025
 */

public class MethodPractice {
	public static void main(String[] args) {

		/*
		 * For tests where the method outputs a string, I have encapsulated both the
		 * guessed output and the actual output into quotation marks. This is to provide
		 * clarity for trials where the expected output is an empty string or includes
		 * spaces at the beginning or end of the string. They are not intended as part
		 * of the output or guess and can be disregarded. This only applies to the two
		 * outermost quotation marks, any others are valid
		 */

		// Test litersToGallons
		System.out.println("TESTING LITERS TO GALLONS");
		// given tests
		System.out.println("Checking litersToGallons(3.7). Expecting a result of 0. The actual result is: "
				+ litersToGallons(3.7));
		System.out.println(
				"Checking litersToGallons(20). Expecting a result of 5. The actual result is: " + litersToGallons(20));
		// My Tests
		System.out.println("Checking litersToGallons(100000000). Expecting a result of 26417200. The actual result is: "
				+ litersToGallons(100000000));
		System.out.println(
				"Checking litersToGallons(0). Expecting a result of 0. The actual result is: " + litersToGallons(0));
		System.out.println("Checking litersToGallons(6.981). Expecting a result of 1. The actual result is: "
				+ litersToGallons(6.981));
		System.out.println();

		
		// Test sumInRange
		System.out.println("TESTING SUM IN RANGE");
		// given tests
		System.out.println(
				"Checking sumInRange(-4, 10). Expecting a result of 45. The actual result is: " + sumInRange(-4, 10));
		System.out.println(
				"Checking sumInRange(5, 5). Expecting a result of 5. The actual result is: " + sumInRange(5, 5));
		// my tests
		System.out.println(
				"Checking sumInRange(0, 10). Expecting a result of 55. The actual result is: " + sumInRange(0, 10));
		System.out.println("Checking sumInRange(-1000, 1000). Expecting a result of 0. The actual result is: "
				+ sumInRange(-1000, 1000));
		System.out.println("Checking sumInRange(-999, 1000). Expecting a result of 1000. The actual result is: "
				+ sumInRange(-999, 1000));

		System.out.println();

		
		// Test shiftCypher
		System.out.println("TESTING SHIFT CYPHER");
		// given tests
		System.out.println(
				"Checking shiftCipher(\"(Zest!)\", 15). Expecting a result of \"7it#$08\". The actual result is: \""
						+ shiftCipher("(Zest!)", 15) + "\"");
		System.out
				.println("Checking shiftCipher(\"hello\", 3). Expecting a result of \"khoor\". The actual result is: \""
						+ shiftCipher("hello", 3) + "\"");
		// my tests
		System.out.println(
				"Checking shiftCipher(\"abcdefghijklmnopqrstuvwxyz\", 11). Expecting a result of \"lmnopqrstuvwxyz{|}~ !\"#$%&\". The actual result is: \""
						+ shiftCipher("abcdefghijklmnopqrstuvwxyz", 11) + "\"");
		System.out.println(
				"Checking shiftCipher(\"hello\", 11). Expecting a result of \"spwwz\". The actual result is: \""
						+ (String) shiftCipher("hello", 11) + "\"");
		System.out.println("Checking shiftCipher(\" ~\", 96). Expecting a result of \"! \". The actual result is: \""
				+ (String) shiftCipher(" ~", 96) + "\"");
		System.out.println();

		
		// Test countIntegerZeros
		System.out.println("TESTING COUNT INTEGER ZEROS");
		// given test
		System.out.println(
				"Checking countIntegerZeros(new Scanner(\"hello 0 10 0.0 string0 0\"). Expecting a result of 2. "
						+ "The actual result is: " + countIntegerZeros(new Scanner("hello 0 10 0.0 string0 0")));
		// my tests
		System.out
				.println("Checking countIntegerZeros(new Scanner(\"hello 1 10 0.0 string0 2 6 5 77 j67 j083aks 0a\"). "
						+ "Expecting a result of 0. The actual result is: "
						+ countIntegerZeros(new Scanner("hello 1 10 0.0 string0 2 6 5 77 j67 j083aks 0a")));
		System.out.println("Checking countIntegerZeros(new Scanner(\"\"). "
				+ "Expecting a result of 0. The actual result is: " + countIntegerZeros(new Scanner("")));
		System.out.println("Checking countIntegerZeros(new Scanner(\"0 hey 0 1.4 0 true 0 false 0 whoah \\n\\n 0\"). "
				+ "Expecting a result of 6. The actual result is: "
				+ countIntegerZeros(new Scanner("0 hey 0 1.4 0 true 0 false 0 whoah \n\n 0")));
		System.out.println();

		
		// Test subsequenceString
		System.out.println("TESTING SUBSEQUENCE STRING");
		// given tests
		System.out.println(
				"Checking subsequenceString(new char[]{'t', 'o', 'd', 'o', 'g', 'o'}, 2, 4). Expecting a result of \"dog\". The actual result is: \""
						+ subsequenceString(new char[] { 't', 'o', 'd', 'o', 'g', 'o' }, 2, 4) + "\"");
		System.out.println(
				"Checking subsequenceString(new char[]{'t', 'o', 'd', 'o', 'g', 'o'}, 1, 6). Expecting a result of \"\". The actual result is: \""
						+ subsequenceString(new char[] { 't', 'o', 'd', 'o', 'g', 'o' }, 1, 6) + "\"");
		// my tests
		System.out.println(
				"Checking subsequenceString(new char[]{'z', 'e', 'a', 'p', 'i', 'c', 'k', 'l', 'e', 'z', 'y', 'x'}, 3, 8). "
						+ "Expecting a result of \"pickle\". The actual result is: \""
						+ subsequenceString(new char[] { 'z', 'e', 'a', 'p', 'i', 'c', 'k', 'l', 'e', 'z', 'y', 'x' },
								3, 8)
						+ "\"");
		System.out.println("Checking subsequenceString(new char[]{'a', 'b', 'c'}, 1, 2). "
				+ "Expecting a result of \"bc\". The actual result is: \""
				+ subsequenceString(new char[] { 'a', 'b', 'c' }, 1, 2) + "\"");
		System.out.println("Checking subsequenceString(new char[3], 1, 2). "
				+ "Expecting a result of \"  \". The actual result is: \"" + subsequenceString(new char[3], 1, 2) + "\"");
		System.out.println(); // TIL null char prints as space

		
		// Test generateCharArray
		System.out.println("TESTING GENERATE CHAR ARRAY");
		// given test
		System.out
				.println("Checking generateCharArray(5). Expecting a result of [A, B, C, D, E]. The actual result is: "
						+ Arrays.toString(generateCharArray(5)));
		// my tests
		System.out.println("Checking generateCharArray(0). Expecting a result of []. The actual result is: "
				+ Arrays.toString(generateCharArray(0)));
		System.out.println("Checking generateCharArray(1). Expecting a result of [A]. The actual result is: "
				+ Arrays.toString(generateCharArray(1)));
		System.out.println(
				"Checking generateCharArray(27). Expecting a result of [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, A]."
						+ " The actual result is: " + Arrays.toString(generateCharArray(27)));
		System.out.println();

		
		// Test mysteryMessage
		System.out.println("TESTING MYSTERY MESSAGE");
		// given tests
		System.out
				.println("Checking mysteryMessage(8,2,4). Expecting a result of  \"GHIJKLMN\". The actual result is: \""
						+ mysteryMessage(8, 2, 4) + "\"");
		System.out.println("Checking mysteryMessage(5,88,99). Expecting a result of \"OPQRS\". The actual result is: \""
				+ mysteryMessage(5, 88, 99) + "\"");
		// my tests
		System.out.println("Checking mysteryMessage(0,1,1). Expecting a result of \"\". The actual result is: \""
				+ mysteryMessage(0, 1, 1) + "\"");
		System.out.println(
				"Checking mysteryMessage(8,1,126). Expecting a result of \"abcdefgh\". The actual result is: \""
						+ mysteryMessage(8, 1, 126) + "\"");
		System.out.println(
				"Checking mysteryMessage(10,9,200). Expecting a result of \"TUVWXYZ[\\]\". The actual result is: \""
						+ mysteryMessage(10, 9, 200) + "\"");

	}

	/**
	 * Converts given number of liters into the equivalent number of gallons,
	 * rounded down to nearest integer
	 * 
	 * @param liters assumed to be non-negative
	 * @return converted amount to gallons rounding down to nearest whole number
	 */
	public static int litersToGallons(double liters) {
		return (int) (liters * 0.264172);
	}

	/**
	 * Sums all integers in provided range, inclusive of both limits, and assumes
	 * that beginning is less than or equal to end
	 * 
	 * @param beginRange start of range to sum
	 * @param endRange   the end of range to sum
	 * @return rangeSum the sum of all integers between the beginning and end,
	 *         inclusive
	 */
	public static int sumInRange(int beginRange, int endRange) {
		int rangeSum = 0;
		for (int i = beginRange; i <= endRange; i++)
			rangeSum += i;

		return rangeSum;
	}

	/**
	 * basic shift cipher, shifts ascii values by number value given by key.
	 * Possible ascii values for both input message and encrypted message range from
	 * " " (Space Character), value 32 inclusive to "~" (tilde character) value 126 inclusive
	 * 
	 * @param plainMessage String to be encoded
	 * @param shiftKey     value that ascii values of chars is the given message
	 *                     will shift by
	 * @return encryptedMessage String of shifted message
	 */
	public static String shiftCipher(String plainMessage, int shiftKey) {
		String encryptedMessage = "";

		shiftKey = shiftKey % (127 - 32); // prevents keys higher than 95 from breaking code/producing unprintable chars

		for (int i = 0; i < plainMessage.length(); i++) {
			if (plainMessage.charAt(i) + shiftKey > 126)
				encryptedMessage = encryptedMessage + (char) (plainMessage.charAt(i) + shiftKey - 127 + 32);
			else
				encryptedMessage = encryptedMessage + (char) (plainMessage.charAt(i) + shiftKey);
		}

		return encryptedMessage;
	}

	/**
	 * counts number of integer zeros scanned by a given scanner scanner must be
	 * given an input source before hand
	 * 
	 * @param inputSource scanner, already attached to input, which you would like
	 *                    to read from
	 * @return zeroCount the number of integer zeros contained inside the given
	 *         input
	 */
	public static int countIntegerZeros(Scanner inputSource) {
		int zeroCount = 0;
		while (inputSource.hasNext()) {
			if (inputSource.hasNextInt() && inputSource.nextInt() == 0) {
				zeroCount++;
			} else {
				inputSource.next();
			}
		}
		return zeroCount;
	}

	/**
	 * Concatenates characters in a char array between specified indices into a
	 * string, inclusive of both bounds If given indices are invalid for provided
	 * array, an empty string will be returned
	 * 
	 * @param charArray  char array from which the subsequence string is desired
	 * @param beginIndex index of first char from given array to start creation of
	 *                   substring (inclusive)
	 * @param endIndex   index of char to end substring from given array (inclusive)
	 * @return subsequence String of chars contained within the provided char []
	 *         between the two indices, inclusive
	 */
	public static String subsequenceString(char[] charArray, int beginIndex, int endIndex) {
		String subsequence = "";

		if (beginIndex < 0 || endIndex >= charArray.length || beginIndex > endIndex)
			return subsequence;

		for (int i = beginIndex; i <= endIndex; i++)
			subsequence = subsequence + charArray[i];

		return subsequence;
	}

	/**
	 * Generates char array of specified length and fills with consecutive capital
	 * letters. If array is larger than 26 and reaches 'Z', it will loop back to 'A'
	 * 
	 * @param charArrayLength desired length of generated array
	 * @return charArray char Array of desired length, filled with consecutive
	 *         capital letters
	 */
	public static char[] generateCharArray(int charArrayLength) {
		char[] charArray = new char[charArrayLength];

		for (int i = 0; i < charArray.length; i++)
			charArray[i] = (char) (i % 26 + 'A');

		return charArray;
	}

	/**
	 * Generates mystery message using 3 previously defined methods
	 * 
	 * @param messageLength initial length to use in combination with offset to call
	 *                      generateCharArray
	 * @param offset        start of subsequence to be selected from generated char
	 *                      []
	 * @param shiftKey      integer to be passed to shiftCypher to shift whole
	 *                      string
	 * @return encryptedMessage a String of the encrypted message created using 3 of
	 *         the above methods
	 */
	public static String mysteryMessage(int messageLength, int offset, int shiftKey) {
		char[] charArray = generateCharArray(messageLength + offset);
		String message = subsequenceString(charArray, offset, charArray.length - 1);
		return shiftCipher(message, shiftKey);
	}
}
// formated