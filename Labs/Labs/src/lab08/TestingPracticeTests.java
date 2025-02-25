package lab08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingPracticeTests {

    /**
     * Normal Functioning
     */
    @Test
    void normalFunctioningInclude0Index() {
        assertEquals("ab", TestingPractice.subsequenceString(new char[]{'a', 'b', 'c'}, 0, 1), "Failed to include 0 index");
    }

    @Test
    void normalFunctioningIncludeLastIndex() {
        assertEquals("bc", TestingPractice.subsequenceString(new char[]{'a', 'b', 'c'}, 1, 2), "Failed to include last index");
    }

    @Test
    void normalFunctioningIncludeOnlyBetweenIndex() {
        assertEquals("bc", TestingPractice.subsequenceString(new char[]{'a', 'b', 'c', 'd'}, 1, 2), "Failed to correctly extract from between edges of substring");
    }

    @Test
    void onlyOneChar() {
        assertEquals("b", TestingPractice.subsequenceString(new char[]{'a', 'b', 'c', 'd'}, 1, 1), "failed to extract only one char from middle of substring");
    }

    @Test
    void invalidFirstIndex() {
        assertEquals("", TestingPractice.subsequenceString(new char[]{'a', 'b', 'c'}, -4, 1), "Incorrectly handles negative first index");
    }

    @Test
    void invalidSecondIndex() {
        assertEquals("", TestingPractice.subsequenceString(new char[]{'a', 'b', 'c'}, 0, 6), "Incorrectly handles out of bounds second index");
    }

    @Test
    void invertedIndices() {
        assertEquals("", TestingPractice.subsequenceString(new char[]{'a', 'b', 'c'}, 7, 4), "Incorrectly handles inverted indices");
    }


    /**
     * Edge cases
     */
    @Test
    void getFirstChar() {
        assertEquals("a", TestingPractice.subsequenceString(new char[]{'a', 'b', 'c', 'd'}, 0, 0), "Failed to get first char (0, 0)");
    }

    @Test
    void getLastChar() {
        assertEquals("d", TestingPractice.subsequenceString(new char[]{'a', 'b', 'c', 'd'}, 3, 3), "Failed to get last char (.length, .length)");
    }

    @Test
    void getCharFromEmptyArray() {
        assertEquals("", TestingPractice.subsequenceString(new char[0], 0, 0), "Incorrect Response to Empty Array");
    }


    /**
     * Corner Cases
     */
    @Test
    void invalidFirstIndexAndLargerThanSecondIndex() {
        assertEquals("", TestingPractice.subsequenceString(new char[]{'a', 'b', 'c'}, -1, -3));
    }

    @Test
    void invalidSecondIndexAndSmallerThanFirstIndex() {
        assertEquals("", TestingPractice.subsequenceString(new char[]{'a', 'b', 'c'}, 4, 3));
    }

    @Test
    void getOnlyChar() {
        assertEquals("a", TestingPractice.subsequenceString(new char[]{'a'}, 0, 0), "Failed to get first and only char");
    }

}
