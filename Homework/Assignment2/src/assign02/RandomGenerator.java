package assign02;
import java.util.Scanner;
/**
* Class: CS1420
* Assignment 2: Random Number Generation
* @author Kenneth Morse
* @version 1/23/2025
*/

public class RandomGenerator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // how we will read input from user
		
		while(true) {
			
			System.out.println("What is Your Name?: ");
			String name = input.nextLine(); //  scans whole line for all text input
			if(name.equals("")) {
				System.out.println("Name must be at least one character long, try again"); // not sure if none is valid name, but assignment 
				continue; 																	// says "After typing the name, the user will press enter."
																							// so name is not empty?
			}
			if(name.equals("exit")) { // handles exit case
				break;
			}
			
			
			int sumOfChars = 0;
			
			for(int i = 0; i < name.length(); i++) {
				sumOfChars += name.charAt(i); // sums numerical values of chars together
			}
			
			
			int[] luckyNums = new int[5];
			int place = 0;
			
			while(place < 5) {
				sumOfChars = (73 * sumOfChars + 37) % 128;
				if(sumOfChars <= 100) { //  ignores numbers over 100 and continues to next iteration of loop
					luckyNums[place] = sumOfChars; // uses while loop to ensure places reaches 4
					place += 1;
				}
			}
			
			
			int luckySum = 0; // determines if numbers are lucky as specified
			String answer = "";
			
			for(int i : luckyNums) {
				luckySum += i;
			}
			
			int remainder = luckySum % 3;
			
			if(remainder == 0) {
				answer = "You are very lucky";
			} else if(remainder == 2) {
				answer = "You are pretty lucky";
			} else {
				answer = "You are unlucky";
			}
			
			
			System.out.print("Lucky numbers: "); // formats answer in output as specified
			
			for(int i : luckyNums) {
				System.out.print(i + " ");
			}
			
			System.out.println("\n" + answer);
			
		}
		
		input.close();
		System.out.println("Goodbye"); // end to program, executed after break is triggered
		
	}
//	can i have more than one method please
//	
//	private static String getName(Scanner input) {
//		System.out.println("What is Your Name?: ");
//		String name = input.nextLine(); //  scans whole line for all text input
//		return name;
//	}
//	
//	
//	private static int sumOfChars(String name) {
//		int sumOfChars = 0;
//		
//		for(int i = 0; i < name.length(); i++) {
//			sumOfChars += name.charAt(i); // sums numerical values of chars together
//		}
//		
//		return sumOfChars;
//		
//	}
//	
//	
//	private static int[] luckyNumGenerator(int i) {
//		
//		int[] luckyNums = new int[5];
//		int place = 0;
//		
//		while(place < 5) {
//			i = (73 * i + 37) % 128;
//			if(i <= 100) { //  ignores numbers over 100 and continues to next iteration of loop
//				luckyNums[place] = i; // uses while loop to ensure places reaches 4
//				place += 1;
//			}
//		}
//		
//		return luckyNums;
//	}
//	
//	
//	
//	private static String areTheyLucky(int[] luckyNums) {
//		
//		int luckySum = 0; // determines if numbers are lucky as specified
//		String answer = "";
//		
//		for(int i : luckyNums) {
//			luckySum += i;
//		}
//		
//		int remainder = luckySum % 3;
//		
//		if(remainder == 0) {
//			answer = "You are very lucky";
//		} else if(remainder == 2) {
//			answer = "You are pretty lucky";
//		} else {
//			answer = "You are unlucky";
//		}
//		
//		return answer;
//	}
//	
//	private static void printAnswer(int[]luckyNums, String luckStatus ) {
//		
//		System.out.print("Lucky numbers: "); // formats answer in output as specified
//		
//		for(int i : luckyNums) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println("\n" + luckStatus);
//	}

	
}
