package Day1;

public class Day1{ // ignore me
	public static void main(String[] args ) {
		// this is a single line comment
		// System.out.println("hello world")
		
		// variable declaration
		int boNixPassingTDs;
		
		// variable assignment
		// = is really like <-
		boNixPassingTDs = 2;
		
		int broncosRushingTDs = 3;
		
		int totalTDs = boNixPassingTDs + broncosRushingTDs;
		
		int numFieldGoals = 1;
		
		int totalPoints = ((totalTDs * 7) + (numFieldGoals*3));
		
		
		
		System.out.println("Total TDs: " + String.valueOf(totalTDs));
		System.out.println("Total Points: " + ((totalTDs * 7) + (numFieldGoals*3)));

		// strings, can convert using this methood
		String  converted  = "" + 25;
		
		boolean yesNo;
		yesNo = true;
		yesNo = false; 
		// all possible values
		
		//doubles
		int numDrives = 10;
		double pointsPerDrive = (0.0 + (totalPoints)/numDrives);
		System.out.println(pointsPerDrive);	
		
	}
}