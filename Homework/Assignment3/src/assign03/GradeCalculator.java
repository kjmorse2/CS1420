package assign03;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GradeCalculator {

	public static void main(String[] args) throws FileNotFoundException {

		try {
			Scanner fileInput = new Scanner(grades);

			double avgExam = fileInput.nextDouble();
			double avgLab = fileInput.nextDouble();
			double avgQuiz = fileInput.nextDouble();
			int numAssignments = fileInput.nextInt();

			int assignmentGradeSum = 0;
			int highestAssignment = 0;
			int lowestAssignment = 101;
			int numZeroAssignments = 0;
			String letterGrade = "";
			String zeroAssignments = "";

			int[] assignmentGrades = new int[numAssignments];

			for (int i = 0; i < numAssignments; i++) {
				assignmentGrades[i] = fileInput.nextInt();
			}

			for (int i : assignmentGrades) {
				assignmentGradeSum += i;
				if (i == 0) {
					zeroAssignments = zeroAssignments.concat(numZeroAssignments + " ");
				}

				if (i > highestAssignment) {
					highestAssignment = i;
				}

				if (i < lowestAssignment) {
					lowestAssignment = i;
				}

				numZeroAssignments += 1;
			}

			double avgAssignment = (double) assignmentGradeSum / numAssignments;

			double totalGrade = (0.45 * avgExam) + (0.35 * avgAssignment) + (0.1 * avgLab) + (0.1 * avgQuiz);

			int tens = (int) totalGrade / 10;
			int ones = (int) totalGrade % 10;

			if (tens < 6) {
				letterGrade = "E";
			} else if (tens >= 9) {
				letterGrade = "A";
			} else if (tens >= 8) {
				letterGrade = "B";
			} else if (tens >= 7) {
				letterGrade = "C";
			} else if (tens >= 6) {
				letterGrade = "D";
			}

			if (ones >= 0 && ones < 3) {
				letterGrade = letterGrade.concat("-");
			} else if (ones >= 7 && ones < 10) {
				letterGrade = letterGrade.concat("+");
			}

			String[] statements = createStatements();

			String finalGrades = String.format("%.2f", avgAssignment + '\n' + zeroAssignments + '\n' + highestAssignment
					+ "\n" + lowestAssignment + '\n' + totalGrade + '\n' + letterGrade + '\n');

			int beginningIndex = 0;

			String finalString = "";

			String currentPrint = "";

			for (int i = 0; i <= 5; i++) {
				finalString = finalString.concat(statements[i] + ": ");
				int nextIndex = finalGrades.indexOf('\n') + 1;
				currentPrint = finalGrades.substring(beginningIndex, nextIndex);
				finalString = finalString.concat(currentPrint);
				finalGrades = finalGrades.substring(nextIndex);
			}

			System.out.print(finalString);
			fileInput.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Please check the path and try again.");
		}

	}

	public class gradeSummary{
		double avgExam;
		double avgLab;
		double avgQuiz;
		double avgAssignment;
		int [] assignmentGrades;
		double finalGrade;
		
		public gradeSummary() {
			Scanner userInput = new Scanner(System.in);
			System.out.println("input the path to file containing grades: ");
			
			String fileLocation = userInput.next();
			
			File grades = new File(fileLocation);
			userInput.close();
			
			try {
				Scanner fileInput = new Scanner(grades);
				
				avgExam = fileInput.nextDouble();
				avgLab = fileInput.nextDouble();
				avgQuiz = fileInput.nextDouble();
				int numAssignments = fileInput.nextInt();
				
				assignmentGrades = new int[numAssignments];
				
				for(int i = 0; i < assignmentGrades.length; i++) {
					assignmentGrades[i] = fileInput.nextInt();
				}
				
				fileInput.close();
				} catch(FileNotFoundException e) {
					System.out.println("File not found. Please check the path and try again.");
			}
		}
		
		public void calcAssignmentGrade(int[] assignments) {
			int sum = 0;
			
			for (int i : assignments) {
				sum += i;
				}
			double avg = (double) sum / assignments.length;
			
			avgAssignment = avg;
		}
		
		public double calcFinalGrade() {
			finalGrade = (0.45 * avgExam) + (0.35 * avgAssignment) + (0.1 * avgLab) + (0.1 * avgQuiz);
			return finalGrade;
		}
		
		
	}

	
	public static final String[] createStatements() {
		String[] statements = new String[6];
		statements[0] = "Average assignment score";
		statements[1] = "0 points on assignment(s)";
		statements[2] = "Highest assignment score";
		statements[3] = "Lowest assignment score";
		statements[4] = "Course grade (numeric)";
		statements[5] = "Course grade (letter)";
		return statements;
		}
	
}


