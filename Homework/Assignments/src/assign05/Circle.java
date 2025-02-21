package assign05;

/*
 * Class: CS1420
 * Assignment 5
 * @author Kenneth Morse
 * @version 2024-2-20
 * 
 * Class for Circle Object, the x and y coordinate mark the location of its 
 * center, and the radius is the distance from that center to the edge
 */

public class Circle {

	private int xCord; // x value at center of Circle
	private int yCord; // y value at center of Circle
	private int circleRadius; // radius of Circle

	/**
	 * constructor for circle with no parameters, assigns default initial values
	 * 
	 * @return new Circle object
	 */
	public Circle() {
		xCord = 0;
		yCord = 0;
		circleRadius = 1;
	}

	/**
	 * constructor for circle of specified position and size
	 * 
	 * @param positionX x value at center of new circle
	 * @param positionY y value at center of new circle
	 * @param radius    radius of Circle
	 */
	public Circle(int positionX, int positionY, int radius) {
		xCord = positionX;
		yCord = positionY;
		circleRadius = radius;
	}

	/**
	 * getter for x coordinate of center
	 * 
	 * @return xCord x coordinate of center
	 */
	public int getX() {
		return xCord;
	}

	/**
	 * getter for y coordinate of center
	 * 
	 * @return yCord y coordinate of center
	 */
	public int getY() {
		return yCord;
	}

	/**
	 * getter for radius
	 * 
	 * @return circleRadius radius of Circle
	 */
	public int getRadius() {
		return circleRadius;
	}

	/**
	 * method to move center of this.Circle to specified coordinates
	 * 
	 * @param newX new x coordinate of circle
	 * @param newY new y coordinate of circle
	 */
	public void move(int newX, int newY) {
		xCord = newX;
		yCord = newY;
	}

	/**
	 * scales this.Circle's radius based on provided factor truncates double
	 * multiplication to its integer value
	 * 
	 * @param factor factor to scale this.Circle's radius by
	 */
	public void scale(double factor) {
		circleRadius = (int) (circleRadius * factor);
	}

	/**
	 * Used to determine if this.Circle's area is larger than passed Circle
	 * 
	 * @param other Circle to compare this.Circle to
	 * @return boolean asserting weather this.Circle is larger than provided Circle
	 */
	public boolean largerThan(Circle other) {
		if (circleRadius > other.getRadius()) {
			return true;
		}
		return false;
	}

	/**
	 * finds and returns the smallest rectangle that contains this.Circle within its
	 * bounds
	 * 
	 * @return Rectangle object containing this.Circle
	 */
	public Rectangle boundingRectangle() {
		return new Rectangle(xCord - circleRadius, yCord - circleRadius, 2 * circleRadius, 2 * circleRadius);
	}

	/**
	 * find and returns the smallest rectangle that contains both this.Circle and
	 * the provided Circle within its bounds
	 * 
	 * @param other Circle object that, along with this.Circle, must be inside the
	 *              new rectangle
	 * @return a new Rectangle object containing both this.Circle and the passed
	 *         Circle
	 */
	public Rectangle boundingRectangle(Circle other) {
		int leftX = Math.min(xCord - circleRadius, other.getX() - other.getRadius());
		int bottomY = Math.min(yCord - circleRadius, other.getY() - other.getRadius());
		int rightX = Math.max(xCord + circleRadius, other.getX() + other.getRadius());
		int topY = Math.max(yCord + circleRadius, other.getY() + other.getRadius());

		return new Rectangle(leftX, bottomY, rightX - leftX, topY - bottomY);
	}

	/**
	 * summarizes the data contained within this.Circle into a concise readable
	 * string
	 * 
	 * @return String containing summary
	 */
	public String toString() {
		return (String) ("r = " + circleRadius + " circle at (" + xCord + ", " + yCord + ")");
	}
}
