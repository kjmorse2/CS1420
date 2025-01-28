package lab04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SpellCheck {
/*
 * main method of program infinitely asks for words
 * to search for in a given words.txt file
 */
	public static void main(String[] args) {
		
		while(true) {
			File file = new File("/Users/kjmorse2/source/CS1420/Labs/Lab4/words.txt");
			// int wordCount = countWords(file);
			System.out.println("Provide a word:");
			Scanner userInput = new Scanner(System.in);
			String spellCheck = userInput.next();
			spellCheck = spellCheck.toLowerCase();
			String response = getClosestWord(spellCheck, file);
			
			if(response.equals(spellCheck)) {
				System.out.println(response + " was found in the list, and is spelled correctly");
			}
			else {
				System.out.println("Did you mean " + response + "? " + spellCheck + " was not found in our list.");
			}
		}

	}
	
	/**
	 * Given a filename, this method returns a count of the number of
	 * words in the file. If the file cannot be opened, -1 is returned.
	 * 
	 * @param the name with path of a text file
	 * @return the count of words in the file or -1
	 */
	public static int countWords(File file) {
		Scanner fileInput;
		try {
		    fileInput = new Scanner(file);
		}catch(FileNotFoundException e) {
		    return -1;
		}
		
		int count = 0;
		
		while(fileInput.hasNext()) {
			fileInput.next();
			count += 1;
		}
		
		fileInput.close();
		return count;
	}
	
	/**
	 * given a string and a file, getClosestWord
	 * returns the closest lexicographical match to the 
	 * given word from the given file. If no such file exists,
	 * it returns an empty String
	 * @param string of one word to be searched for
	 * @param file object with path to dictionary file
	 * @return String of closest lexicographical word to given param word
	 */
	public static String getClosestWord(String word, File file){
		Scanner fileInput;
		try {
		    fileInput = new Scanner(file);
		}catch(FileNotFoundException e) {
		    return null;
		}
		
		String current = "";
		
		while(fileInput.hasNext()) {
			current = fileInput.next();
			if(word.compareTo(current) <= 0)
			    break;			
		}
		fileInput.close();
		
		return current;

		
	}
}

