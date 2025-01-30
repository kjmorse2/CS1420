package assign03;

/**
* Class: CS 1420
* Assignment 3: Grade Calculator
* @author Kenneth Morse
* @version 1/29/2025
*/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class GradeCalculator {

	public static void main(String[] args) {
		// start of main method, gets file path from system.in, repeats if file is not found
		Scanner userInput = new Scanner(System.in);
		Scanner fileInput;
		File gradesRaw;
		String filePath;

		while (true) {
			System.out.println("Input the path to a file containing your formated grades");

			filePath = userInput.next();
			gradesRaw = new File(filePath);

			try {
				fileInput = new Scanner(gradesRaw);
				break; // if successful, breaks out of infinite loop
			} catch (IOException e) {
				System.out.println("Not a valid file path, try again");
			}
		}
		userInput.close();

		
		
		// reads all necessary info from file into variables
		double avgExam = fileInput.nextDouble();
		double avgLab = fileInput.nextDouble();
		double avgQuiz = fileInput.nextDouble();
		int numAssignments = fileInput.nextInt();
		int[] assignmentGrades = new int[numAssignments];

		for (int i = 0; i < assignmentGrades.length; i++) {
			assignmentGrades[i] = fileInput.nextInt();
		}

		fileInput.close();

		
		
		// calculates average assignment grade along with the extreme scores on
		// assignments
		int sum = 0;
		int maxAssignment = assignmentGrades[0];
		int minAssignment = assignmentGrades[0];

		for (int grade : assignmentGrades) {
			sum += grade;
			if (grade > maxAssignment) {
				maxAssignment = grade; // FINAL OUTPUT
			} else if (grade < minAssignment) {
				minAssignment = grade; // FINAL OUTPUT
			}
		}

		double avgAssignment = (double) sum / assignmentGrades.length; // FINAL OUTPUT

		
		
		/*
		 * first figures out how many assignments were scored zero, then fills created
		 * array with indices of those assignments
		 */
		int numZeroAssignments = 0;

		for (int i : assignmentGrades) {
			if (i == 0) {
				numZeroAssignments += 1;
			}
		}

		int[] zeroAssignments = new int[numZeroAssignments]; // FINAL OUTPUT
		int independentIndex = 0;

		for (int i = 0; i < assignmentGrades.length; i++) {
			if (assignmentGrades[i] == 0) {
				zeroAssignments[independentIndex] = i;
				independentIndex++;
			}
		}

		
		
		/* calculates final grade based on weights given in syllabus and then uses 
		if/else branching to assign letter grade */
		double finalGrade = (0.45 * avgExam) + (0.35 * avgAssignment) + (0.1 * avgLab) + (0.1 * avgQuiz); // FINAL OUTPUT

		String letterGrade = ""; // FINAL OUTPUT
		int tens = (int) finalGrade / 10;
		int ones = (int) finalGrade % 10;

		if (tens >= 9) {
			letterGrade = "A";
		} else if (tens >= 8) {
			letterGrade = "B";
		} else if (tens >= 7) {
			letterGrade = "C";
		} else if (tens >= 6) {
			letterGrade = "D";
		} else { // tens < 6
			letterGrade = "E";
		}

		if (!letterGrade.equals("E")) {
			if (ones >= 0 && ones < 3) {
				letterGrade = letterGrade.concat("-");
			} else if (ones >= 7 && ones < 10) {
				letterGrade = letterGrade.concat("+");
			}
		}

		
		
		// formats grades into string[] to be printed using a for loop
		String zeroAssignmentsString  = "";
		String[] printGrades = new String[6];
		printGrades[0] = String.format("%.2f", avgAssignment);

		for (int i : zeroAssignments) {
			zeroAssignmentsString  = zeroAssignmentsString .concat(i + " ");
		}
		printGrades[1] = zeroAssignmentsString ;
		
		printGrades[2] = String.valueOf(maxAssignment);
		printGrades[3] = String.valueOf(minAssignment);
		printGrades[4] = String.format("%.2f", finalGrade);
		printGrades[5] = letterGrade;

		
		
		// creates statements required by output
		String[] statements = new String[6];
		statements[0] = "Average assignment score: ";
		statements[1] = "0 points on assignment(s): ";
		statements[2] = "Highest assignment score: ";
		statements[3] = "Lowest assignment score: ";
		statements[4] = "Course grade (numeric): ";
		statements[5] = "Course grade (letter): ";

		
		
		// prints final output
		for (int i = 0; i < statements.length; i++) {
			System.out.println(statements[i] + printGrades[i]);
		}
	}
}
