package lecture5;

public class practiceProblem {

	public static void main(String[] args) {
		double[] grades = {50,88,95,92};
		String[] names = {"Ben", "Erin","Danny","Noelle"};
		
		double bestGrade = grades[0];// if use 0, assume no negative grades
		String topStudent = "None";
		
		for(int i = 1; i < grades.length; i++) {
			if(grades[i]>bestGrade) {
				bestGrade = grades[i];
				topStudent = names[i];
			}
		}
		
		System.out.println(topStudent + " was the top student, scoring a " + bestGrade);

	}

}
