package pongGame;
import java.awt.Graphics;

import javax.swing.*;


public class Main {

	//declare and initialize the frame

    public static void main(String[] args) {
    	
    	Window w = new Window();
    	
    	JFrame f = w.getJFrame();
    	
    	Ball ball = new Ball();
    	
        Canvas canvas = new Canvas(ball);

		//make it so program exits on close button click
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		//the size of the game will be 480x640, the size of the JFrame needs to be slightly larger
        f.setSize(650,650);

		//show the window
        f.setVisible(true);
        
        Graphics g = f.getGraphics();
        
        canvas.drawBall(g);
        
        
        
        while(true) {
        	ball.move();
        	canvas.drawBall(g);
        }
	}
}

