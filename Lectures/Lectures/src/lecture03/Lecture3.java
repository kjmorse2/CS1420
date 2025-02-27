package lecture03;

import java.util.Scanner;

public class Lecture3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// boolean data types

		boolean isStudent = false;

		int netWorth = 1000000000;

		boolean isWealthy = netWorth >= 100000;

		System.out.println(isWealthy);
		// for integers (and chars?)
		// >=, <=, ==, !=

		System.out.println((.1 + .1 + .1) == .3); // comes to false because of rounding error
		// solve by checking small enough difference

		// object types:
		// only == and !=
		// use methods to compare objects
		String name1 = "Ben";
		String name2 = "ben";

		System.out.println("same name?: " + name1.equals(name2));

		int myAge = 24;
		int yourAge = 23;

		boolean differentNames = !name1.equals(name2);
		boolean sameAge = myAge == yourAge;

		// and (&&) take 2 booleans and is true when both inputs are true
		boolean samePerson = sameAge && name1.equals(name2);
		System.out.println("same person?: " + samePerson);

		// or (||) take 2 booleans, and is true if either/both are true
		boolean wantToBeFriends = sameAge || isWealthy; // try to be user friendly as opposed to:
		// (myAge == yourAge) || (netWorth >= 100000 // Much less readable
		System.out.println("freinds?: " + wantToBeFriends);

		// System.out.println(false == false);

		// control flow
		if (wantToBeFriends) {
			System.out.println("hello freind!");
		} else {
			System.out.println("stay away you poor scallywag");
		}

		// CONTROL FLOW
		// BRANCHES
		// if statements

		// exactly one or the other is executed
		int age = 60;

		if (age < 20) { // ugly way of doing it, can use elif
			System.out.println("young");
		} else {
			if (age < 30) {
				System.out.println("pretty young");
			} else {
				if (age < 40) {
					System.out.println("middle age");
				} else {
					System.out.println("old");
				}
			}
		}
		// reformated code of above

		if (age <= 20) {
			System.out.println("young");
		} else if (age <= 30) {
			System.out.println("pretty young");
		} else if (age <= 40) {
			System.out.println("middle age");
		} else { // can exclude final else to have options where nothing runs
			System.out.println("can you please show me your id for the senior citizen discount");
		}
		
		// LOOPS 
		
		Scanner scanner = new Scanner (System.in);
		age = -1;
		while(age <=0) {
			System.out.println("what is your age?");
			age = scanner.nextInt();
		}
		scanner.close();
		
		int number = 0; 
		while(number <=10 ) {
			System.out.println(number);
			number += 1; // without this line, infinite condition
		}

	}
}
