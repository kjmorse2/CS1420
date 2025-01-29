package assign03;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class GradeCalculator2ImDumb {

	// main method where instructions will be executed, including 
	// input logic and calling of GradeSummary methods
	
	public static void main(String[] args) {
		String testingFiles = "/Users/kjmorse2/source/CS1420/Homework/Assignment3/";
		
		String[] statements = createStatements(); 
		
		Scanner userInput = new Scanner(System.in);
		Scanner fileInput;
		File gradesRaw;
		String filePath;
		
		while(true) {
			
			System.out.println("Input the path to a file containing your formated grades");
			
			filePath = userInput.next();
			gradesRaw = new File(testingFiles + filePath);
			
			try {
				fileInput = new Scanner(gradesRaw);
				userInput.close();
				break;
			} catch (IOException e) {
				System.out.println("Not a valid file path, attempting again");
				continue;
			}
		}
		
		GradeSummary grades = new GradeSummary(fileInput);
		grades.assignmentsScoredZero();
		grades.extremeAssignmentGrades();
		grades.finalGrade();
		grades.letterGrade();
		String[] printGrades = grades.readyToPrint();
		
		for(int i = 0; i < statements.length; i++) {
			System.out.print(statements[i] + printGrades[i]);
			System.out.println();
		}

	}

	public static class GradeSummary {
		// read directly from file
		double avgExam;
		double avgLab;
		double avgQuiz;
		int numAssignments;
		int [] assignmentGrades;
		
		//calculated/evaluated after reading
		double avgAssignment;
		double finalGrade;
		int maxAssignment;
		int minAssignment;
		int [] zeroAssignments;
		String letterGrade;
		String[] printGrades;
		
		public GradeSummary(Scanner fileInput) {
			
			avgExam = fileInput.nextDouble();
			avgLab = fileInput.nextDouble();
			avgQuiz = fileInput.nextDouble();
			numAssignments = fileInput.nextInt();
			
			assignmentGrades = new int[numAssignments];
			for(int i = 0; i < assignmentGrades.length; i++) {
				assignmentGrades[i] = fileInput.nextInt();
			}
			
			fileInput.close();
			
		}
		
		public double extremeAssignmentGrades() {
			
			int sum = 0;
			maxAssignment = assignmentGrades[0];
			minAssignment = assignmentGrades[0];
			
			for (int i : assignmentGrades) {
				sum += i;
				
				if(i > maxAssignment) {
					maxAssignment = i;
				}
				else if(i < minAssignment) {
					minAssignment = i;
				}
				
				}
			double avg = (double) sum / assignmentGrades.length;
			
			avgAssignment = avg;
			
			return avgAssignment;
		}
		
		public double finalGrade() {
			finalGrade = (0.45 * avgExam) + (0.35 * avgAssignment) + (0.1 * avgLab) + (0.1 * avgQuiz);
			return finalGrade;
		}
		
		
		public String letterGrade() {
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
		
		public int[] assignmentsScoredZero() {
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
			printGrades[0] = String.format("%.2f", avgAssignment);
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
		statements[0] = "Average assignment score: ";
		statements[1] = "0 points on assignment(s): ";
		statements[2] = "Highest assignment score: ";
		statements[3] = "Lowest assignment score: ";
		statements[4] = "Course grade (numeric): ";
		statements[5] = "Course grade (letter): ";
		return statements;
	}
}
