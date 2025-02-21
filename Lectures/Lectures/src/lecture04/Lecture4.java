package lecture04;
import java.util.Scanner;

public class Lecture4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		// WARM UP PROBLEM
		int num; // delcaration determines scope, allows access outside of loop
		for(num = 0; num < 10; num++) { // only numbers under 10
			if ((num % 2) == 1) { // checks for odd number
				System.out.println(num);
			}
		}
		// lecture LISTS: 
		// bunch of values with same data type
		// EXAMPLE 1: 
		int quiz1Points = 10;
		int quiz2Points = 9;
		int quiz3Points = 8; // ineficient, gets out of hand 
		// or of the size of data is oging to change
		System.out.println("How many quizes are there?: ");
		int numQuizzes = scanner.nextInt();
		
		//rather...
		// ARRAYS!
		int[] quizScores = new int[numQuizzes]; // need size at declearation time
		// access by quizPoints[index] desired value;
		
		int totalQuizPoints = 0;
		for(int i = 0; i < numQuizzes; i ++) {
			System.out.println("Score of quiz " + (i+1) + ":");
			quizScores[i] = scanner.nextInt(); // using loop to fill in exactly as many scores as needed
			totalQuizPoints += quizScores[i];
		}
		System.out.println(totalQuizPoints);
		System.out.println("Average: " + totalQuizPoints/(double)quizScores.length);
		
		
		// initialize values at delcaration
		// array LITERAL
		
		String[] magicWords = {"abracadabra", "please", "voila"};
		// magicWords.length = 3
		// voila index = 2
		// better way of doing it im so smart and intellegent and I know everything and this class is stupid and I have nothing to learn, I am the best programmer there ever was even better than a super inteligent tadpole this is not sarcasm
		for (String magicWord : magicWords) { 
			System.out.println(magicWord.toUpperCase() + "!");
		}
		
		// one more loop 
		String name = "";
		
		do{
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		} while(name.length() == 0);
		
		scanner.close();
		
		// common loop patterns 
		// counting loop: counts from some number to another 
		// 0 up to 8, 100 down to 57, 2 to 26 in increments of 2
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		
		// accumulator loops
		// accumulates data in sum, multiplication, subtraction, summarizes data to be stored together
		// updating value ever iteration of loop
		
		for(int i = 0; i < numQuizzes; i ++) {
			quizScores[i] = scanner.nextInt(); // using loop to fill in exactly as many scores as needed
			totalQuizPoints += quizScores[i];
		}
		
		// Searching loop
		// iterate through list of data/variables to find specific value/values
		
		int[] haystack = {1,5,8,-2,20,0,-4};
		int needle = -2;
		boolean found = false;
		
		int indexDesired = -1; // default is -1 for not found location
		for(int i = 0; i < haystack.length; i ++) {
			if(haystack[i] == needle) {
				indexDesired = i;
				found = true;
				break;
			}
		}
		
		// Optimization loop 
		// trying to find an extreme value, min or max 
		int max = haystack[0];
		int min = haystack[0];
		for(int strand : haystack) {
			if(strand > max) {
				max = strand;
			} else if(strand < min) {
				min = strand;
			} else {
				continue;
			}
		}
		System.out.println(min + " " + max);
	}

}
