package assign06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Tester for the Word class.
 * 
 * Class: CS1420
 * Assignment 6
 * 
 * @author Prof. Parker and Kenenth Morse
 * @version 2025-2-21
 */
public class WordTester {

	/**
	 * Test that the Word class constructor properly throws an exception when the
	 * given string contains characters that are not a-z or A-Z.
	 */
	@Test
	public void testConstructorException() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Word("hel!o");
		});
	}

	/**
	 * Test that word class accepts empty string
	 */
	@Test
	public void testExceptionNotThrown() {
		assertDoesNotThrow(() -> {
			new Word("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
		}, "Method should not throw an exception");
	}

	/**
	 * Test that the Word class constructor properly sets the private instance
	 * variable, which is used to generate and return a String in the toString
	 * method.
	 */
	@Test
	public void testToStringNormal() {
		Word normal = new Word("Normal");
		assertEquals("Normal", normal.toString());
	}

	/**
	 * Test that the Word class constructor handles string length 1 properly with
	 * recursive methods
	 */
	@Test
	public void testToStringLength1() {
		Word normal = new Word("A");
		assertEquals("A", normal.toString());
	}

	/**
	 * Test isPalindrome with expected response of true
	 */
	@Test
	public void testIsPalindromeTrue() {
		Word palindrome = new Word("saippuakivikauppias");
		assertTrue(palindrome.isPalindrome());
	}

	/**
	 * test isPalindrome with one letter word
	 */
	@Test
	public void testIsPalindromeOneLetter() {
		Word oneLetter = new Word("a");
		assertTrue(oneLetter.isPalindrome());
	}

	/**
	 * test isPaindrome with expected response of false
	 */
	@Test
	public void testIsPalindromeFalse() {
		Word notPalindrome = new Word("pickle");
		assertFalse(notPalindrome.isPalindrome());
	}

	/**
	 * test isPalindrome with odd word length
	 */
	@Test
	public void testIsPalindromeOddLength() {
		Word palindrome = new Word("racecar");
		assertTrue(palindrome.isPalindrome());
	}

	/**
	 * test isPaindrome with even word length
	 */
	@Test
	public void testIsPalindromeEvenLength() {
		Word palindrome = new Word("abccba");
		assertTrue(palindrome.isPalindrome());
	}

	/**
	 * test that isPalindrome does not alter Word object
	 */
	@Test
	public void testIsPalindromeDoesNotChangeWord() {
		Word notPalindrome = new Word("pickle");
		notPalindrome.isPalindrome();
		assertEquals("pickle", notPalindrome.toString());
	}

	/**
	 * test isPalindome with empty string
	 */
	@Test
	public void testIsPalindromeEmpty() {
		Word emptyPalindrome = new Word("");
		assertTrue(emptyPalindrome.isPalindrome());
	}

	/**
	 * test replaceLetter with illegal argument in first argument
	 */
	@Test
	public void testReplaceLetterExceptionFirstArg() {
		Word oneLetter = new Word("a");
		assertThrows(IllegalArgumentException.class, () -> {
			oneLetter.replaceLetter(' ', 'l');
		});
	}

	/**
	 * test replaceLetter with illegal argument in second argument
	 */
	@Test
	public void testReplaceLetterExceptionSecondArg() {
		Word oneLetter = new Word("a");
		assertThrows(IllegalArgumentException.class, () -> {
			oneLetter.replaceLetter('l', ' ');
		});
	}

	/**
	 * test replaceLetter regular functioning
	 */
	@Test
	public void testReplaceLetterHello() {
		Word hello = new Word("hello");
		assertEquals("hesso", hello.replaceLetter('l', 's').toString());
	}

	/**
	 * test replaceLetter with letter not in Word object
	 */
	@Test
	public void testReplaceLetterNotInWord() {
		Word hello = new Word("hello");
		assertEquals("hello", hello.replaceLetter('w', 's').toString());
	}

	/**
	 * test replaceLetter with entire Word being replaced
	 */
	@Test
	public void testReplaceWholeWord() {
		Word lowerCaseScream = new Word("aaaaa");
		assertEquals("bbbbb", lowerCaseScream.replaceLetter('a', 'b').toString());
	}

	/**
	 * test test replaceLetter with same letter
	 */
	@Test
	public void testReplaceLetterWithSame() {
		Word lowerCaseScream = new Word("Hello");
		assertEquals("Hello", lowerCaseScream.replaceLetter('l', 'l').toString());
	}

	/**
	 * test reverse with odd length word
	 */
	@Test
	public void testReverseHello() {
		Word hello = new Word("hello");
		hello.reverse();
		assertEquals("olleh", hello.toString());
	}

	/**
	 * test reverse with empty String in Word
	 */
	@Test
	public void testReverseEmpty() {
		Word empty = new Word("");
		empty.reverse();
		assertEquals("", empty.toString());
	}

	/**
	 * test reverse with even length word
	 */
	@Test
	public void testReverseEven() {
		Word banana = new Word("banana");
		banana.reverse();
		assertEquals("ananab", banana.toString());
	}

	/**
	 * test reverse with palindrome
	 */
	@Test
	public void testReversePalindrome() {
		Word raceCar = new Word("racecar");
		raceCar.reverse();
		assertEquals("racecar", raceCar.toString());
	}

}