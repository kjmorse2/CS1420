package assign06;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class WordTester {

	@Test
	@DisplayName("To String Testing")
	void testToString() {
		Word word = new Word("racecar");
		assertEquals("racecar", word.toString());
	}
	
	
	@Test
	@DisplayName("Palindrome Testing")
	void testPalindrome() {
		Word palindrome = new Word("racecar");
		assertTrue(palindrome.isPalindrome());
	}
	
	@Test
	@DisplayName("Replace Letter Testing")
	void testReplaceLetter() {
		Word word = new Word("aaaabbbb");
		Word replaced = word.replaceLetter('a','b');
		assertEquals("bbbbbbbb", replaced.toString());
	}
	
	@Test
	@DisplayName("Reverse Testing")
	void testReverse() {
		Word word = new Word("aaaabbbb");
		word.reverse();
		assertEquals("bbbbaaaa", word.toString());
	}

}
