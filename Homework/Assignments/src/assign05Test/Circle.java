package assign05Test;

import java.awt.Point;

/*
 * Class: CS1420
 * Assignment 5
 * @author Kenneth Morse
 * @version 02/14/25
 * 
 * Class for Circle Object
 */

public class Circle extends Shape {

	private int radius;

	/**
	 * constructor for circle with no parameters, assigns default initial values
	 * 
	 * @return new Circle object
	 */
	public Circle() {
		shapeCords.x = 0;
		shapeCords.y = 0;
		radius = 1;
	}

	/**
	 * constructor for circle of specified position and size
	 * 
	 * @param positionX location of center on x axis
	 * @param positionY location of center on y axis
	 * @param radius    radius of circle
	 */
	public Circle(int positionX, int positionY, int radius) {
		shapeCords.x = positionX;
		shapeCords.y = positionY;
		this.radius = radius;
	}

	/**
	 * getter for radius
	 * 
	 * @return circleRadius radius of Circle
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * calculates area of circle
	 * 
	 * @return double of area
	 */
	public double area() {
		return Math.PI * radius;
	}

	/**
	 * scales circles radius based on provided factor
	 * 
	 * @param factor factor to scale Circle's radius by
	 */
	public void scale(double factor) {
		double newRadius = radius;
		newRadius *= factor;
		radius = (int) newRadius;

	}

	/**
	 * finds and returns the smallest rectangle that contains this.circle within its
	 * bounds
	 * 
	 * @return Rectangle object containing this.Circle
	 */
	public Rectangle boundingRectangle() {
		return new Rectangle(shapeCords.x - radius, shapeCords.y - radius, 2 * radius, 2 * radius);
	}

	/**
	 * finds the bottom left most extreme point of the circle
	 * 
	 * @return Point describing bottom left point
	 */
	protected Point bottomLeft() {
		return new Point(shapeCords.x - radius, shapeCords.y - radius);
	}

	/**
	 * finds the top right most extreme point of the circle
	 * @return Point describing top right point
	 * 
	 */
	protected Point topRight() {
		return new Point(shapeCords.x + radius, shapeCords.y + radius);
	}

	 /**
	  * summarizes the data contained within this.Circle into a concise readable string
	  * @return String containing summary
	  */
	public String toString() {
		return (String) ("r = " + radius + " circle at (" + shapeCords.x + ", " + shapeCords.y + ")");
	}
}
