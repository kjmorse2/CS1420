package assign05;

/*
 * Class: CS1420
 * Assignment 5
 * @author Kenneth Morse
 * @version 2024-2-20
 * 
 * class for a Rectangle object. The x and y coordinate for its position
 * correspond to the corner with the minimum x and y values(bottom-left corner).
 * Rectangles of this class are aligned with the coordinate axis, no rotation is permitted 
 */

public class Rectangle {

	private int xCord; // minimum x coordinate of rectangle
	private int yCord; // minimum y coordinate of rectangle
	private int rectWidth; // size of rectangle in x direction, cannot be negative
	private int rectHeight; // size of rectangle in y direction, cannot be negative

	/**
	 * constructor with no parameters, so sets default values
	 */
	public Rectangle() {
		xCord = 0;
		yCord = 0;
		rectWidth = 1;
		rectHeight = 1;
	}

	/**
	 * constructor for rectangle of specified size and position
	 * 
	 * @param positionX minimum x position of rectangle
	 * @param positionY position of bottom side of rectangle
	 * @param width     length of rectangle in x direction
	 * @param height    length of rectangle in y direction
	 */
	public Rectangle(int positionX, int positionY, int width, int height) {
		xCord = positionX;
		yCord = positionY;
		rectWidth = width;
		rectHeight = height;
	}

	/**
	 * getter for xCord
	 * 
	 * @return xCord the x coordinate of bottom-left corner of rectangle
	 */
	public int getX() {
		return xCord;
	}

	/**
	 * getter for yCord
	 * 
	 * @return yCord the y coordinate of bottom-left corner of rectangle
	 */
	public int getY() {
		return yCord;
	}

	/**
	 * getter for rectWidt
	 * 
	 * @return rectWidth horizontal size of rectangle
	 */
	public int getWidth() {
		return rectWidth;
	}

	/**
	 * getter for rectHeight
	 * 
	 * @return rectHeight vertical size of rectangle
	 */
	public int getHeight() {
		return rectHeight;
	}

	/**
	 * moves this.Rectangle to new position specified by newX and newY
	 * 
	 * @param newX new x coordinate of rectangle
	 * @param newY new y coordinate of rectangle
	 */
	public void move(int newX, int newY) {
		xCord = newX;
		yCord = newY;
	}

	/**
	 * scales this.Rectangle's width and height by given factors. Truncates new
	 * sizes to integer values. Does not round
	 * 
	 * @param xFactor factor to scale width
	 * @param yFactor factor to scale height
	 */
	public void scale(double xFactor, double yFactor) {
		rectWidth = (int) (rectWidth * xFactor);
		rectHeight = (int) (rectHeight * yFactor);
	}

	/**
	 * compares this.Rectangle's area to a given Rectangle's area
	 * 
	 * @param other Rectangle to compare this.Rectangle to
	 * @return boolean sating if this.Rectangle is larger than passed Rectangle
	 */
	public boolean largerThan(Rectangle other) {
		if (rectWidth * rectHeight > other.getWidth() * other.getHeight()) {
			return true;
		}
		return false;
	}

	/**
	 * method to find the smallest possible rectangle that contains both
	 * this.Rectanlge and the passed rectangle within its dimensions.
	 * 
	 * @param other passed rectangle which also must be inside the bounding
	 *              Rectangle
	 * @return a Rectangle object containing both this.rectangle and the passed
	 *         Rectangle within its dimensions.
	 */
	public Rectangle boundingRectangle(Rectangle other) {
		int leftX = Math.min(xCord, other.getX());
		int bottomY = Math.min(yCord, other.getY());
		int rightX = Math.max(xCord + rectWidth, other.getX() + other.getWidth());
		int topY = Math.max(yCord + rectHeight, other.getY() + other.getHeight());

		return new Rectangle(leftX, bottomY, rightX - leftX, topY - bottomY);
	}

	/**
	 * converts this.Rectangle object into a String for easy interpretation
	 * 
	 * @return String String description of object
	 */
	public String toString() {
		return (String) (rectWidth + " x " + rectHeight + " rectangle at (" + xCord + ", " + yCord + ")");
	}

}
