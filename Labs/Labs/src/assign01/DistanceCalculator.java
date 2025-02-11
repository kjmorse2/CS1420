package assign01;

public class DistanceCalculator {

	public static void main(String[] args) {
		int uID = 1371126; // full uID number
		
		int uIDFeet = uID/12; // convert all to feet
		
		int uIDInches = uID%12; // find out leftover inches
		
		int uIDMiles  = uIDFeet / 5280; // convert all to miles
		
		uIDFeet = uIDFeet % 5280; // find out leftover feet
		
		System.out.println(uID + " inches is equivalent to "+uIDMiles+" miles, " + uIDFeet + " feet, and "+uIDInches+" inches.");
		
		
		

	}

}
