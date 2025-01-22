package assign03;
import java.util.Scanner;
import java.io.File;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("input the path to file containing grades: ");
		
		String outputGrades = "";
		
		String fileLocation = userInput.next();
		
		File grades = new File(fileLocation);
		Scanner fileInput = new Scanner(grades);
		
		double avgExam = fileInput.nextDouble();
		double avgLab = fileInput.nextDouble();
		double avgQuiz = fileInput.nextDouble();
		int numAssignments = fileInput.nextInt();
		int assignmentGradeSum = 0;
		int highestAssignment = 0;
		int lowestAssignment = 1000;
		int numZeroAssignments = 0;
		String letterGrade = "E";
		String zeroAssignments = "";
		
		
		
		int [] assignmentGrades = new int[numAssignments];
		
		for(int i = 0; i < numAssignments; i++) {
			assignmentGrades[i] = fileInput.nextInt();
		}
		
		for(int i : assignmentGrades) {
			assignmentGradeSum += i;
				
				if(i == 0) {
					zeroAssignments.concat(numZeroAssignments + " ");
				}
				
				if(i > highestAssignment) {
					highestAssignment = i;
				}
				
				if(i < lowestAssignment) {
					highestAssignment = i;
				}
			
			numZeroAssignments += 1;
		}
		
		double avgAssignment = (double)assignmentGradeSum/numAssignments;
		
		double totalGrade = (0.45 * avgExam) + (0.35 * avgAssignment) + (0.1 * avgLab) + (0.1 * avgQuiz);
		
		int tens = (int)totalGrade/10;
		int ones = (int)totalGrade%10;
		
		if(tens < 6) {
		}
		else if(tens >= 6) {
			letterGrade = "D";
		}
		else if(tens >= 7) {
			letterGrade = "C";
		}
		else if(tens >= 8) {
			letterGrade = "B";
		}
		else if(tens >= 9) {
			letterGrade = "A";
		}
		
		if(ones >= 0 && ones < 3) {
			letterGrade.concat("-");
		}
		else if(ones >= 7 && ones < 0) {
			letterGrade.concat("+");
		}
		
		
		String[] statements = new String[6];
		statements = createStatements();
		
		
		
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
