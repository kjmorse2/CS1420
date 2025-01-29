package lecture6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lecture6Main {

	public static void main(String[] args) {
		Double magicNumber = readNumberFromConsole(4, 19);
		
		System.out.println(magicNumber + " is good");
		
		

	}
	// name, not great name, but whatever 
	// type, return type: int, gives back njmber collected from console
	// type: input type: does not need input
	// type: availability, only available from Lecture6Main class
	// value: written code below, look at it
	@SuppressWarnings("unused")
	private static Double readNumberFromConsole() {
		Scanner input = new Scanner(System.in);
		Double nextInput = 0.0;
		while (true) {
			System.out.println("Input any number between 1 and 10");

			try {
				nextInput = input.nextDouble();

			} catch (InputMismatchException e) {
				input.next();
				System.out.println("bad input");
				continue;
			}

			if (nextInput >= 1 && nextInput <= 10) {
				input.close();
				return nextInput;
			}

		}
	}
	
	// new method, allows caller to determine range
	private static Double readNumberFromConsole(int lowerLimit, int upperLimit) {
		Scanner input = new Scanner(System.in);
		Double nextInput = 0.0;
		while (true) {
			System.out.println("Input any number between " + lowerLimit+ " and " + upperLimit);

			try {
				nextInput = input.nextDouble();

			} catch (InputMismatchException e) {
				input.next();
				System.out.println("bad input");
				continue;
			}

			if (nextInput >= lowerLimit && nextInput <= upperLimit) {
				input.close();
				return nextInput;
			}

		}
	}
	
	@SuppressWarnings("unused")
	private static int doublesInt(int x) { // signature of function, name, return type, status
		return 2*x;
	}

}
