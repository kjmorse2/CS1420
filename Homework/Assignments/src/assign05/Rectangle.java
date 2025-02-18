package assign05;

/*
 * Class: CS1420
 * Assignment 5
 * @author Kenneth Morse
 * @version 02/14/25
 * 
 * class for a Rectangle object. All rectangles created are specified
 * by their bottom left corner, with the xCord being the x coordinate of
 * the leftmost side, and the y coordinate being the position of the 
 * bottom side. All sides are parallel to the x and y axis, so rotation is 
 * not permitted in this class
 */

public class Rectangle {

	private int xCord;
	private int yCord;
	private int rectWidth;
	private int rectHeight;

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
	 * @param positionX position of left edge of rectangle
	 * @param positionY position of bottom side of rectangle
	 * @param width length of rectangle in x direction
	 * @param height length of rectangle in y direction
	 */
	public Rectangle(int positionX, int positionY, int width, int height) {
		xCord = positionX;
		yCord = positionY;
		rectWidth = width;
		rectHeight = height;
	}

	/**
	 * getter for xCord
	 * @return xCord the x coordinate of bottom-left corner of rectangle 
	 */
	public int getX() {
		return xCord;
	}

	/**
	 * getter for yCord
	 * @return yCord the y coordinate of bottom-left corner of rectangle
	 */
	public int getY() {
		return yCord;
	}

	/**
	 * getter for rectWidt
	 * @return rectWidth horizontal size of rectangle 
	 */
	public int getWidth() {
		return rectWidth;
	}

	/**
	 * getter for rectHeight
	 * @return rectHeight vertical size of rectangle 
	 */
	public int getHeight() {
		return rectHeight;
	}

	/**
	 * moves this.Rectangle to new position specified by newX and newY
	 * @param newX new x coordinate of rectangle 
	 * @param newY new y coordinate of rectangle
	 */
	public void move(int newX, int newY) {
		xCord = newX;
		yCord = newY;
	}

	/**
	 * scales this.Rectangle's width and height by given factors
	 * @param xFactor factor to scale width
	 * @param yFactor factor to scale height 
	 */
	public void scale(double xFactor, double yFactor) {
		double newWidth = rectWidth;
		double newHeight = rectHeight;
		newWidth *= xFactor;
		newHeight *= yFactor;
		rectWidth = (int)newWidth;
		rectHeight = (int)newHeight;
	}

	/**
	 * compares this.Rectanglle's to a given Rectangle's area 
	 * @param other Rectangle to compare this.Rectangle to
	 * @return boolean sating if this.Rectangle is larger than passed Rectangle
	 */
	public boolean largerThan(Rectangle other) {
		if(rectWidth * rectHeight > other.getWidth() * other.getHeight()) {
			return true;
		}
		return false; 
	}

	/**
	 * method to find the smallest possible rectangle that contains both this.Rectanlge
	 * and the passed rectangle within its dimensions. 
	 * @param other passed rectangle which also must be inside the bounding Rectangle
	 * @return a Rectangle object containing both this.rectangle and the passed Rectangle
	 * within its dimensions. 
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
	 * @return String String description of object
	 */
	public String toString() {
		return (String) (rectWidth + " x " + rectHeight + " rectangle at (" + xCord + ", " + yCord + ")");
	}

}
