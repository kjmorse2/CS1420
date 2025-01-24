package assign03;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GradeCalculator {

	public static void main(String[] args) throws FileNotFoundException {
		
		String[] statements = createStatements();
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("input the path to file containing grades: ");
		
		String fileLocation = userInput.next();
		
		File file = new File(fileLocation);
		userInput.close();
		
		gradeSummary Grades = new gradeSummary(file);
		
		Grades.calcAssignmentGrade(Grades.assignmentGrades);
		Grades.assignmentsScoredZero(Grades.assignmentGrades);
		Grades.finalGrade(Grades.avgExam, Grades.avgAssignment, Grades.avgLab, Grades.avgQuiz);
		String[] printGrades = Grades.readyToPrint();
		
		for(int i = 0; i < printGrades.length; i++) {
			System.out.println(statements[i] + ": " + printGrades[i]);
		}
	}


	public static class gradeSummary {
		double avgExam;
		double avgLab;
		double avgQuiz;
		double avgAssignment;
		int maxAssignment;
		int minAssignment;
		double finalGrade;
		int [] assignmentGrades;
		int [] zeroAssignments;
		String letterGrade;
		String[] printGrades;
		
		public gradeSummary(File grades){
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
		
		public double calcAssignmentGrade(int[] assignments) {
			int sum = 0;
			maxAssignment = assignmentGrades[0];
			minAssignment = assignmentGrades[0];
			
			for (int i : assignments) {
				sum += i;
				
				if(i > maxAssignment) {
					maxAssignment = i;
				}
				else if(i < minAssignment) {
					minAssignment = i;
				}
				
				}
			double avg = (double) sum / assignments.length;
			
			avgAssignment = avg;
			
			return avgAssignment;
		}
		
		public double finalGrade(double avgExam, double avgAssignment, double avgLab, double avgQuiz) {
			finalGrade = (0.45 * avgExam) + (0.35 * avgAssignment) + (0.1 * avgLab) + (0.1 * avgQuiz);
			letterGrade(finalGrade);
			return finalGrade;
		}
		
		public String letterGrade(double finalGrade) {
			letterGrade = "";
			int tens = (int) finalGrade / 10;
			int ones = (int) finalGrade % 10;

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
			
			return letterGrade;
		}
		
		public int[] assignmentsScoredZero(int[] assignmentGrades) {
			int numZeroAssignments = 0;
			for(int i : assignmentGrades) {
				if(i == 0) {
					numZeroAssignments +=1;
				}
			}
			
			zeroAssignments = new int[numZeroAssignments];
			int index = 0;
			for(int i = 0; i < assignmentGrades.length; i++) {
				if(assignmentGrades[i] == 0) {
					zeroAssignments[index] = i; 
					index ++;
				}
			}
			
			return zeroAssignments;
		}
		
		public String[] readyToPrint(){
			String temp = "";
			printGrades = new String[6];
			printGrades[0] = String.valueOf(avgAssignment);
			printGrades[2] = String.valueOf(maxAssignment);
			printGrades[3] = String.valueOf(minAssignment);
			printGrades[4] = String.format("%.2f", finalGrade);
			printGrades[5] = letterGrade;
			
			for(int i : zeroAssignments) {
				temp = temp.concat(" " + i);
			}
			printGrades[1] = temp;
			return printGrades;					
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
	


