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

public abstract class Shape {
	Point shapeCords;

	public Shape() {
		shapeCords = new Point();
	}

	public int getX() {
		return shapeCords.x;
	}

	public int getY() {
		return shapeCords.y;
	}

	/**
	 * moves this.Shape to new position specified by newX and newY
	 * 
	 * @param newX new x coordinate of rectangle
	 * @param newY new y coordinate of rectangle
	 */
	public void move(int newX, int newY) {
		shapeCords.x = newX;
		shapeCords.y = newY;
	}

	/**
	 * compares two shapes by area, implemented in each subclass
	 * @param other shape to compare this.Shape to
	 * @return boolean describing if this.shape is larger than provided shape
	 */
	public boolean largerThan(Shape other) {
		if (this.area() > other.area()) {
			return true;
		}
		return false;
	}

	/**
	 * finds bounding rectangle for this.Shape and provided shape 
	 * @param other
	 * @return
	 */
	public Rectangle boundingRectangle(Shape other) {
		int leftX = Math.min(this.bottomLeft().x, other.bottomLeft().x);
		int bottomY = Math.min(this.bottomLeft().y, other.bottomLeft().y);
		int rightX = Math.max(this.topRight().x, other.topRight().x);
		int topY = Math.max(this.topRight().y, other.topRight().y);

		return new Rectangle(leftX, bottomY, rightX - leftX, topY - bottomY);

	}

	/**
	 * 
	 * @return
	 */
	abstract public double area();

	abstract protected Point bottomLeft();

	abstract protected Point topRight();

	public abstract String toString();

}
