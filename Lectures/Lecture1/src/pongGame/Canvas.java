package pongGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.util.Timer;

public class Canvas {
	
	private Ball ball;
	// private Timer timer;
	
	public Canvas(Ball ball) {
		this.ball = ball;
		
		// timer = new Timer();
	}
	
	public void drawBall(Graphics g) {
		g.setColor(Color.red);
		int circlSize = 40;
		g.fillOval((int)ball.getX(),(int)ball.getY(), circlSize, circlSize);
	}
	
//	private void updateBall() {
//		ball.move();
//	}
//	
//	private void drawPaddle(Graphics g) {
//		int paddleSize = 60;
//		g.fillRect(paddleSize, paddleSize, paddleSize, paddleSize);
//	}
//	
//	private void paddlePosition(Graphics g) {
//		PointerInfo mouse = MouseInfo.getPointerInfo();
//		Point mouseLocation = mouse.getLocation();
//		g.drawRect(0, mouseLocation.y, 60, 60);
//	}
//
//	
	
}
