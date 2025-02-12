package lecture09;

public class Lecture9 {

	public static void main(String[] args) {
		GradeData g1 = new GradeData();
		
		// Analogous to accessing parts of an array, but elements can be different data types
		g1.grade = 6; // ex of instance variables 
		g1.name = "Dracula"; // member variables of an object 
		
		GradeData g2 = new GradeData();
		g2.name = "Frank";
		g2.grade = 7;
		
		GradeData[] grades = new GradeData[2];
		
		grades[0] = g1;
		grades[1] = g2;
		
		int bestStudentIndex = 0;
		for(int i = 0; i< grades.length; i++) {
			if(grades[i].grade > grades[bestStudentIndex].grade) {
				bestStudentIndex = i;
			}
		}
		
		g1.printSummary();
		g2.printSummary();
		System.out.println("Best Student: " + grades[bestStudentIndex].name);
	}
}
