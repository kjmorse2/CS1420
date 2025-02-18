package assign05Test;

import java.awt.Point;

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

public class Rectangle extends Shape {

	private int rectWidth;
	private int rectHeight;

	/**
	 * constructor with no parameters, so sets default values
	 */
	public Rectangle() {
		shapeCords.x = 0;
		shapeCords.y = 0;
		rectWidth = 1;
		rectHeight = 1;
	}

	/**
	 * constructor for rectangle of specified size and position
	 * 
	 * @param positionX position of left edge of rectangle
	 * @param positionY position of bottom side of rectangle
	 * @param width     length of rectangle in x direction
	 * @param height    length of rectangle in y direction
	 */
	public Rectangle(int positionX, int positionY, int width, int height) {
		shapeCords.x = positionX;
		shapeCords.y = positionY;
		rectWidth = width;
		rectHeight = height;
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

	public double area() {
		return rectWidth * rectHeight;
	}

	/**
	 * scales this.Rectangle's width and height by given factors
	 * 
	 * @param xFactor factor to scale width
	 * @param yFactor factor to scale height
	 */
	public void scale(double xFactor, double yFactor) {
		double newWidth = rectWidth;
		double newHeight = rectHeight;
		newWidth *= xFactor;
		newHeight *= yFactor;
		rectWidth = (int) newWidth;
		rectHeight = (int) newHeight;
	}

	protected Point bottomLeft() {
		return shapeCords;
	}

	protected Point topRight() {
		return new Point(shapeCords.x + rectWidth, shapeCords.y + rectHeight);
	}

	/**
	 * converts this.Rectangle object into a String for easy interpretation
	 * 
	 * @return String String description of object
	 */
	public String toString() {
		return (String) (rectWidth + " x " + rectHeight + " rectangle at (" + shapeCords.x + ", " + shapeCords.y + ")");
	}

}
