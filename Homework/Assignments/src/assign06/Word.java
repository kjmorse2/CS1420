package assign06;

/*
  Class: CS1420
  Assignment 6

  @author Kenenth Morse
  @version 2025-2-21
 */

import java.lang.IllegalArgumentException;

/**
 * The Word class represents a sequence of characters.
 * This class provides utility methods for word manipulation such as reversing,
 * checking for palindromes, and replacing characters, with input validation to ensure the word
 * contains only alphabetic characters, both uppercase and lowercase.
 */
public class Word {

	@SuppressWarnings("FieldMayBeFinal")
    private char[] letters;

	/**
	 * Constructor for Word Object, sets word equal to provided String chars other
	 * than letters and capital letters are not allowed
	 * 
	 * @param word must only be a-z + A-Z
	 * @throws IllegalArgumentException if passed string contains non letter chars
	 */
	public Word(String word) throws IllegalArgumentException {

		checkInput(word);

		letters = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			letters[i] = word.charAt(i);
		}
	}

	/**
	 * Recursively generates and returns a String object to represent this Word object (driver
	 * method).
	 * 
	 * @return a String object that represents this Word object
	 */
	public String toString() {
		return toString(0);
	}

	/**
	 * Generates and returns a String object to represent the letters of this Word
	 * object from a given index to the last index (recursive method).
	 * 
	 * @param startIndex - index at which to start
	 * @return the letters of this Word from startIndex to the last index, as a
	 *         String
	 */
	private String toString(int startIndex) {
		if (startIndex == letters.length)
			return "";

		return letters[startIndex] + toString(startIndex + 1);
	}

	/**
	 * Recursively checks if this.Word is a palindrome (spelled same forwards and backwards)
	 * (Driver Method)
	 * 
	 * @return boolean stating if this.Word is a palindrome
	 */
	public boolean isPalindrome() {
		return isPalindrome(0, letters.length - 1);
	}

	/**
	 * Recursively checks if this.Word is a palindrome (spelled same forwards and backwards)
	 * starts on outside chars of word, and stops if no error is detected when
	 * startIndex >= endIndex (recursive method)
	 * 
	 * @param startIndex index of letter to be compared to end index
	 * @param endIndex   index of letter to be compared
	 * @return boolean describing if this.Word is a palindrome
	 */
	private boolean isPalindrome(int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return true;
		}
		if (letters[startIndex] != letters[endIndex]) {
			return false;
		}
		return isPalindrome(startIndex + 1, endIndex - 1);
	}

	/**
	 * Creates new Word object the same as this.Word object, but with all
	 * occurrences of specified char replaced with provided char replacement
	 * done recursively (Driver method)
	 * 
	 * @param toBeReplaced      char to be replaced in this.Word
	 * @param replacement char to replace toBeReplaced letter in this.Word
	 * @return new Word object containing word with replaced chars
	 */
	public Word replaceLetter(char toBeReplaced, char replacement) throws IllegalArgumentException {
		checkInput(new char[]{toBeReplaced, replacement});
		return new Word(replaceLetter(toBeReplaced, replacement, 0));
	}

	/**
	 * Recursively replaces letter with replacement returns String of the altered word
	 * (Recursive Method)
	 * 
	 * @param toBeReplaced      char to be replaced
	 * @param replacement char to replace letter
	 * @param startIndex  current Index to check and replace if needed
	 * @return String containing this.Word letters[] with replaced chars
	 */
	private String replaceLetter(char toBeReplaced, char replacement, int startIndex) {
		if (startIndex == letters.length) {
			return "";
		}
		char current = (letters[startIndex] == toBeReplaced) ? replacement : letters[startIndex];
        return current + replaceLetter(toBeReplaced, replacement, startIndex + 1);
	}

	/**
	 * Recursively reverses this.Word's letters[] order (Driver method)
	 */
	public void reverse() {
		reverse(0, letters.length - 1);
	}

	/**
	 * Recursively reverses this.Word's letters[] order (Recursive method)
	 * 
	 * @param startIndex tracker for char to be swapped (from beginning)
	 * @param endIndex tracker for char to be swapped (from end)
	 */
	private void reverse(int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return;
		}
		char temp = letters[startIndex];
		letters[startIndex] = letters[endIndex];
		letters[endIndex] = temp;
		reverse(startIndex + 1, endIndex - 1);
	}

	/**
	 * Input validation for class, all chars/strings contained in a Word must only contain letters
	 * (a-z and A-Z), for String input
	 * 
	 * @param chars String of chars to be checked
	 */
	private void checkInput(String chars) {
		for (int i = 0; i < chars.length(); i++) {
			char c = chars.charAt(i);
			if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
				throw new IllegalArgumentException("All characters must be letters");
			}
		}
    }

	/**
	 * Input validation for class, all chars/strings contained in a Word must only contain letters
	 * (a-z and A-Z), for char array (char[]) input
	 *
	 * @param chars array of chars to be checked
	 */
	private void checkInput(char[] chars) {
		for (char c : chars) {
			if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
				throw new IllegalArgumentException("All characters must be letters");
			}
		}
    }
}