package pongGame;

/**
 * Represents a ball for a pong like game
 * (for now, just an animation
 */
public class Ball {
	
	protected double x;
	protected double y;
	protected double vx, vy;
	
	public Ball() {
		x = Window.getScreenSize()/2;
		y = Window.getScreenSize()/2;
		vx = 1;
		vy = 1;
	}
	
	public void move() {
		
		int screenSize = Window.getScreenSize();
		
		x += vx;
		x += vy;
		
		if(x < 0) {
			x = 0;
			vx *= -1;
		} else if(x > screenSize) {
			x = screenSize;
			vx *= -1;
		}
		
		if(y < 0) {
			y = 0;
			vy *=-1;
		} else if(y > screenSize) {
			y = screenSize;
			vy *= -1;
			
		}
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	
	
	
	
}
