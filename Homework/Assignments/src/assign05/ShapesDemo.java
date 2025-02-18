package assign05;

/**
 * This class uses objects of the Rectangle and Circle classes.
 * It uses several methods from each class to confirm that they
 * are working correctly.
 * 
 * Class: CS1420
 * Assignment 5
 * 
 * @author Prof. Heisler and Kenneth Morse
 * @version 2024-9-24
 */

public class ShapesDemo {
	/**
	 * The main method simply calls the demo methods for each part.
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * After creating the Rectangle class in part 1,
		 * this method checks your Rectangle class.
		 */
		demoPartOne();
		
		/*
		 * After creating the Circle class in part 2,
		 * uncomment this method call to check Circle.
		 */
		 demoPartTwo();
	}
	
	/**
	 * This method works with only the Rectangle class for assignment part 1.
	 */
	public static void demoPartOne() {
		// Create some Rectangle objects
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(5, 7, 10, 20);
		Rectangle r3 = new Rectangle(-10, 8, 5, 15);
		Rectangle r4 = new Rectangle(1, 1, 2, 2);
		
		// NOTE: See the checkResult method at the end of this class.
		
		// getX
		checkResult("getX", "5", "" + r2.getX());
		checkResult("getX", "-10", "" + r3.getX());
		
		// getY
		checkResult("getY", "7", "" + r2.getY());
		checkResult("getY", "8", "" + r3.getY());
		
		// getWidth
		checkResult("getWidth", "10", "" + r2.getWidth());
		checkResult("getWidth", "2", "" + r4.getWidth());
		
		// getHeight
		checkResult("getHeight", "20", "" + r2.getHeight());
		checkResult("getHeight", "2", "" + r4.getHeight());
		
		// move
		r1.move(4,  12);
		checkResult("move x", "4", "" + r1.getX());
		checkResult("move y", "12", "" + r1.getY());
		r3.move(2,  7);
		checkResult("move x", "2", "" + r3.getX());
		checkResult("move y", "7", "" + r3.getY());
		
		// scale
		r1.scale(11,  2);
		checkResult("scale width", "11", "" + r1.getWidth());
		checkResult("scale height", "2", "" + r1.getHeight());
		r4.scale(20,  1);
		checkResult("scale width", "40", "" + r4.getWidth());
		checkResult("scale height", "2", "" + r4.getHeight());
		
		// largerThan
		checkResult("largerThan", "false", "" + r1.largerThan(r2));
		checkResult("largerThan", "true", "" + r4.largerThan(r3));
		
		// toString
		checkResult("toString", "10 x 20 rectangle at (5, 7)", r2.toString());
		checkResult("toString", "5 x 15 rectangle at (2, 7)", r3.toString());
		checkResult("toString", "40 x 2 rectangle at (1, 1)", r4.toString());
		
		// bounding rectangle
		Rectangle boundR1R2 = r1.boundingRectangle(r2);
		checkResult("boundingRectangle", "11 x 20 rectangle at (4, 7)", "" + boundR1R2);
		Rectangle boundR3R4 = r3.boundingRectangle(r4);
		checkResult("boundingRectangle", "40 x 21 rectangle at (1, 1)", "" + boundR3R4);
	}
	
	/**
	 * This method works with both classes for assignment part 2.
	 */
	public static void demoPartTwo() {
		// Create some Circle objects
		Circle c1 = new Circle();
		Circle c2 = new Circle(4, 5, 6);
		Circle c3 = new Circle(0, 0, 10);
		Circle c4 = new Circle(88, 88, 2);
		// TODO create two more circles, c3 and c4:
		// c3 is an r = 10 circle at (0, 0)
		// c4 is an r = 2 circle at (88, 88)
		
		// getX
		checkResult("getX", "4", "" + c2.getX());
		checkResult("getX", "88", "" + c4.getX());
		
		// getY
		checkResult("getY", "5", "" + c2.getY());
		checkResult("getY", "88", "" + c4.getY());
		
		// getRadius
		checkResult("getRadius", "6", "" + c2.getRadius());
		checkResult("getRadius", "10", "" + c3.getRadius());
		
		// move
		c1.move(-2,  -3);
		checkResult("move x", "-2", "" + c1.getX());
		checkResult("move y", "-3", "" + c1.getY());
		c3.move(2,  4);
		checkResult("move x", "2", "" + c3.getX());
		checkResult("move y", "4", "" + c3.getY());
		
		// scale
		c1.scale(10);
		checkResult("scale", "10", "" + c1.getRadius());
		c4.scale(4);
		checkResult("scale", "8", "" + c4.getRadius());
		// TODO add one more check of this method
		
		// largerThan
		// Note that c1 was scaled to radius 10 in the previous test, so this should be true.
		checkResult("largerThan", "true", "" + c1.largerThan(c2)); 
		checkResult("largerThan", "false", "" + c4.largerThan(c3)); 
		
		// toString
		checkResult("toString", "r = 6 circle at (4, 5)", c2.toString());
		checkResult("toString", "r = 8 circle at (88, 88)", c4.toString());
		
		// bounding rectangle 1
		Rectangle boundC2 = c2.boundingRectangle();
		checkResult("bounding rectangle 1", "12 x 12 rectangle at (-2, -1)", "" + boundC2);
		Rectangle boundC3 = c3.boundingRectangle();
		checkResult("bounding rectangle 1", "20 x 20 rectangle at (-8, -6)", "" + boundC3);
		
		// bounding rectangle 2
		Rectangle boundC1C2 = c1.boundingRectangle(c2);
		checkResult("bounding rectangle 2", "22 x 24 rectangle at (-12, -13)", "" + boundC1C2);
		Rectangle boundC3C4 = c3.boundingRectangle(c4);
		checkResult("bounding rectangle 2", "104 x 102 rectangle at (-8, -6)", "" + boundC3C4);
		// TODO add one more check of this method
	}
	
	/**
	 * A private helper method for printing out a useful message.
	 * 
	 * @param description - what is being checked
	 * @param expected - expected output
	 * @param actual - actual output
	 */
	private static void checkResult(String description, String expected, String actual) {
		System.out.println("Checking " + description + ":");
		System.out.println("Expected: " + expected);
		System.out.println("   Yours: " + actual);
		System.out.println();
	}
}
