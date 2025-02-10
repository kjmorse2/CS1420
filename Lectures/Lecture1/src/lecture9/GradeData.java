package lecture9;

/**
 * Data type for storing a student's grade on the exam
 * really bad, I want to use arrays
 */
public class GradeData {
	// instance/member variables
	// aka "fields" or "properties"
	
	// every GradeData object has a grade and a name
	// hide these values, and include getters to access them
	// prevents changing from outside the object itself 
	// breaks code, must write getters
	private Integer grade;
	private String name;
	
	public GradeData() {
		grade = -1;
		name = "No Name";
	}
	
	public GradeData(Integer grade, String name) {
		this.grade = grade;
		this.name = name;
	}
	
	// instance method:
	public void printSummary() {
		// hehehe how does "this" work
		// can access value by global name, or by using this keyword
		// to access object being called on values
		System.out.println(name + " got a " + this.grade);
	}
	
	public void giveExtraCredit(int numPoints) {
		grade += numPoints;
	}
}
