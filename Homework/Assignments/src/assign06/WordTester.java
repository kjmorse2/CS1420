package assign06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Class: CS1420
 * Assignment 6
 *
 * @author Prof. Parker and Kenenth Morse
 * @version 2025-2-21
 */

//Tester for the Word class
public class WordTester {

    private static final String FULL_ALPHABET_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String EMPTY_STRING = "";
    private static final String racecar_STRING = "racecar";
    private static final String hello_STRING = "hello";
    private static final String Hello_STRING = "Hello";

    //CONSTRUCTOR


     /**
     * Test that the Word class constructor properly throws an exception when the
     * given string contains characters that are not a-z or A-Z.
     */
    @Test
    public void testExceptionThrownWithInvalidCharacterInString() {
        assertThrows(IllegalArgumentException.class, () -> new Word("hel!o"), "Method should throw an exception in response to invalid characters");
    }

    /**
     * Test that the Word class constructor properly throws an exception when the
     * given string only contains characters that are not a-z or A-Z.
     */
    @Test
    public void testExceptionThrownWithMultipleInvalidCharacter() {
        assertThrows(IllegalArgumentException.class, () -> new Word("!!!!!\"\"\"{{{}}}"), "Method should throw an exception in response to completely invalid string");
    }

    /**
     * Test that the Word class constructor properly throws an exception when the
     * given string only contains characters that are not a-z or A-Z. (edge case)
     */
    @Test
    public void testConstructorThrowsExceptionForSingleInvalidCharacter(){
        assertThrows(IllegalArgumentException.class, () -> new Word("!"), "Method should throw an exception in response to invalid character");
    }

    /**
     * Test that word class accepts permitted string
     */
    @Test
    public void testExceptionNotThrownPermittedString() {
        assertDoesNotThrow(() -> {
            new Word(hello_STRING);
        }, "Method should not throw an exception in response permitted string");
    }

    /**
     * Test that word class accepts every alphabet char
     */
    @Test
    public void testExceptionNotThrownSingleChars() {
        char[] alphabetArray = FULL_ALPHABET_STRING.toCharArray();
        for (char c : alphabetArray) {
            assertDoesNotThrow(() -> {
                new Word((EMPTY_STRING + c));
            }, "Method should not throw an exception single char string");
        }
    }

    /**
     * Test that word class accepts empty string
     */
    @Test
    public void testExceptionNotThrown() {
        assertDoesNotThrow(() -> {
            new Word(EMPTY_STRING);
        }, "Method should not throw an exception in response to empty string");
    }

    /**
     * Test that the Word class constructor properly sets the private instance
     * variable, which is used to generate and return a String in the toString
     * method.
     */
    @Test
    public void testToStringPermittedString() {
        Word Hello = new Word(Hello_STRING);
        assertEquals(Hello_STRING, Hello.toString(), "Method should set the private instance variable to the given string");
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
     * Test that the Word class constructor handles string length 0 properly with
     * recursive methods
     */
    @Test
    public void testToStringLength0() {
        Word normal = new Word(EMPTY_STRING);
        assertEquals(EMPTY_STRING, normal.toString());
    }

    /**
     * IS PALINDROME
     * /
     * <p>
     * /**
     * Test isPalindrome with expected response of true
     */
    @Test
    public void testIsPalindromeTrue() {
        Word palindrome = new Word("saippuakivikauppias");
        assertTrue(palindrome.isPalindrome());
    }

    /**
     * test isPalindrome with one-letter word
     */
    @Test
    public void testIsPalindromeOneLetter() {
        Word oneLetter = new Word("a");
        assertTrue(oneLetter.isPalindrome());
    }

    /**
     * test isPalindrome with expected response of false
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
        Word palindrome = new Word(racecar_STRING);
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
        Word emptyPalindrome = new Word(EMPTY_STRING);
        assertTrue(emptyPalindrome.isPalindrome());
    }

    // REPLACE LETTER

    /**
     * test replaceLetter with illegal argument in first argument
     */
    @Test
    public void testReplaceLetterExceptionFirstArg() {
        Word oneLetter = new Word("a");
        assertThrows(IllegalArgumentException.class, () -> oneLetter.replaceLetter(' ', 'l'), "Method should throw an exception in response to invalid character in first argument");
    }

    /**
     * test replaceLetter with illegal argument in second argument
     */
    @Test
    public void testReplaceLetterExceptionSecondArg() {
        Word oneLetter = new Word("a");
        assertThrows(IllegalArgumentException.class, () -> oneLetter.replaceLetter('l', ' '), "Method should throw an exception in response to invalid character in second argument");
    }

    /**
     * test replaceLetter regular functioning, tests every letter
     */
    @Test
    public void testReplaceLetterAlphabet() {
        char[] alphabetArray = FULL_ALPHABET_STRING.toCharArray();
        char[] alphabetMinus_a_Array = new char[alphabetArray.length - 1];
        for(int i = 1; i < alphabetArray.length; i++ ){
            alphabetMinus_a_Array[i - 1] = alphabetArray[i];
        }
        String alphabetMinus_a_String = new String(alphabetMinus_a_Array);
        Word alphabetMinus_a_Word = new Word(alphabetMinus_a_String);
        Word replacedWord;
        for (char currentChar : alphabetArray) {
            replacedWord = alphabetMinus_a_Word.replaceLetter(currentChar, 'a');
            assertEquals(-1, replacedWord.toString().indexOf(currentChar), "Failed to replace character: " + currentChar);
        }

        Word alphabetWord = new Word(FULL_ALPHABET_STRING);
        replacedWord = alphabetWord.replaceLetter('a', 'b');
        assertEquals(-1, replacedWord.toString().indexOf('a'), "Failed to replace character: " + 'a');
    }

    /**
     * test replaceLetter with letter not in Word object
     */
    @Test
    public void testReplaceLetterNotInWord() {
        String test = hello_STRING;
        Word hello_Word = new Word(hello_STRING);
        assertEquals(hello_STRING, hello_Word.replaceLetter('w', 's').toString());
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
     * test replaceLetter with same letter
     */
    @Test
    public void testReplaceLetterWithSame() {
        Word lowerCaseScream = new Word(Hello_STRING);
        assertEquals(Hello_STRING, lowerCaseScream.replaceLetter('l', 'l').toString());
    }

    // REVERSE

    /**
     * test reverse with odd length word
     */
    @Test
    public void testReverseHello() {
        Word hello_Word = new Word(hello_STRING);
        hello_Word.reverse();
        assertEquals("olleh", hello_Word.toString());
    }

    /**
     * test reverse with empty String in Word
     */
    @Test
    public void testReverseEmpty() {
        Word empty = new Word(EMPTY_STRING);
        empty.reverse();
        assertEquals(EMPTY_STRING, empty.toString());
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
     * test reverse with full alphabet
     */
    @Test
    public void testReverseAlphabet() {
        Word alphabet = new Word(FULL_ALPHABET_STRING);
        alphabet.reverse();
        assertEquals("ZYXWVUTSRQPONMLKJIHGFEDCBAzyxwvutsrqponmlkjihgfedcba", alphabet.toString());
    }

    /**
     * test reverse with palindrome
     */
    @Test
    public void testReversePalindrome() {
        Word raceCar = new Word(racecar_STRING);
        raceCar.reverse();
        assertEquals(racecar_STRING, raceCar.toString());
    }

}