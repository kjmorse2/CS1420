package assign06;

/*
  Class: CS1420
  Assignment 6

  @author Kenenth Morse
 * @version 2025-2-21
 */

import java.lang.IllegalArgumentException;

public class Word {

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
	 * Generates and returns a String object to represent this Word object (driver
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
	 * checks if this.Word is a palindrome (spelled same forwards and backwards)
	 * (Driver Method)
	 * 
	 * @return boolean stating if this.Word is a palindrome
	 */
	public boolean isPalindrome() {
		return isPalindrome(0, letters.length - 1);
	}

	/**
	 * checks if this.Word is a palindrome (spelled same forwards and backwards)
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
	 * creates new Word object with same as this.Word object, but with all
	 * occurrences of specified char replaced with char replacement
	 * 
	 * @param letter      to be replaced in this.Word (Driver method)
	 * @param replacement to replace specified letter in this.Word
	 * @return new Word object containing word with replaced chars
	 */
	public Word replaceLetter(char letter, char replacement) throws IllegalArgumentException {
		checkInput("" + letter + replacement);
		return new Word(replaceLetter(letter, replacement, 0));
	}

	/**
	 * Replaces letter with replacement returns String of the altered word
	 * (Recursive Method)
	 * 
	 * @param letter      char to be replaced
	 * @param replacement char to replace letter
	 * @param startIndex  current Index to check and replace if needed
	 * @return String containing this.Word letters[] with replaced chars
	 */
	private String replaceLetter(char letter, char replacement, int startIndex) {
		if (startIndex == letters.length) {
			return "";
		}
		char current = (letters[startIndex] == letter) ? replacement : letters[startIndex];
		return String.valueOf(current) + replaceLetter(letter, replacement, startIndex + 1);
	}

	/**
	 * reverses this.Word's letters[] order (Driver method)
	 */
	public void reverse() {
		reverse(0, letters.length - 1);
	}

	/**
	 * reverses this.Word's letters[] order (Recursive method
	 * 
	 * @param startIndex
	 * @param endIndex
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
	 * Input validation for class, all chars/strings used must only contain letters
	 * (a-z and A-Z). Many chars must be concatenated to be checked by method
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
}