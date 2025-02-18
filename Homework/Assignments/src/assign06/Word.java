package assign06;
import java.lang.IllegalArgumentException;

public class Word {

	private char[] letters;
	
	/**
	 * 
	 * @param word
	 * @throws IllegalArgumentException
	 */
	public Word(String word) 
			throws IllegalArgumentException 
	{
		int wordLength = word.length();
		
		for(int i = 0; i < wordLength; i++) {
			char c = word.charAt(i);
			if(!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')){
				throw new IllegalArgumentException("All characters must be letters");
			}
		}
		
		letters = new char[word.length()];
		for(int i = 0; i < wordLength; i++) {
			letters[i] = word.charAt(i);
		}
	}

	/**
	 * 
	 */
	public String toString() { return toString(0); }
	
	/**
	 * 
	 * @param startIndex
	 * @return
	 */
	private String toString(int startIndex) {
		if(startIndex == letters.length) 
			return "";
		
	return letters[startIndex] + toString(startIndex + 1); 
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isPalindrome() {return isPalindrome(0, letters.length-1);}
	
	/**
	 * 
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	private boolean isPalindrome(int startIndex, int endIndex) {
		if(startIndex >= endIndex) {
			return true;
		}
		if(letters[startIndex] != letters[endIndex]) {
			return false;
		}
		return isPalindrome(startIndex + 1, endIndex - 1);
	}
	
	/**
	 * 
	 * @param letter
	 * @param replacement
	 * @return
	 */
	public Word replaceLetter(char letter, char replacement) {
		return new Word(replaceLetter(letter, replacement, 0));
	}

	/**
	 * 
	 * @param letter
	 * @param replacement
	 * @param startIndex
	 * @return
	 */
	private String replaceLetter(char letter, char replacement, int startIndex) {
		if(startIndex == letters.length) {
			return "";
		}
		char current = (letters[startIndex] == letter) ? replacement : letters[startIndex];
		return String.valueOf(current) + replaceLetter(letter, replacement, startIndex + 1);
	}
	
	/**
	 * 
	 */
	public void reverse() {
		reverse(0, letters.length - 1);
	}

	/**
	 * 
	 * @param startIndex
	 * @param endIndex
	 */
	private void reverse(int startIndex, int endIndex) {
		if(startIndex >= endIndex) {
			return;
		}
		char temp = letters[startIndex];
		letters[startIndex] = letters[endIndex];
		letters[endIndex] = temp;
		reverse(startIndex + 1, endIndex - 1);
	}
}