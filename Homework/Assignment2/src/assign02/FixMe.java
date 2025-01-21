package assign02;

import java.util.Scanner;

/**
 * This program should:
 *  - Prompt the user to type a word, then read one in with a Scanner
 *  - Print the word in all lower case letters (like String's toLowerCase method)
 *  - Print the word in all upper case letters (like String's toUpperCase method)
 *  
 *  For example, if the user inputs "Hello!", the output should be:
 *  Lower case version: hello!
 *  Upper case version: HELLO!
 *  
 *  ... but it isn't working. Please fix it.
 *  You must NOT use String's toUpperCase or toLowerCase methods.
 *  
 *  @author Eric Heisler and Kenneth Morse
 *  @version 1/15/2025
 */
public class FixMe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a word:");
        String word = input.next();
        String lowerCase = "";
        String upperCase = "";
        
        for(char c : word.toCharArray()) {
        	// The difference between cases is 32
        	// so 'a' is 'A' + 32, 'b' is 'B' + 32, etc.
        	if(65 <= c && c <= 90) {
        		lowerCase += (char)(c + 32); 
        		upperCase += c;
        	} else if (97 <= c && c <= 122){
        		lowerCase += c;
        		upperCase += (char)(c - 32);
        	}
        	else {
        		lowerCase += c;
        		upperCase += c;
        	}
        }
        
        System.out.println("Lower case version: " + lowerCase);
        System.out.println("Upper case version: " + upperCase);
        
        input.close();
    }
}
