package pongGame;
import javax.swing.*;


public class Window {
	
	private static int screenSize;

	//declare and initialize the frame
    static JFrame f = new JFrame("Pong");

    public Window() {
    	
    	screenSize = 650;

		//make it so program exits on close button click
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		//the size of the game will be 480x640, the size of the JFrame needs to be slightly larger
        f.setSize(screenSize,screenSize);

		//show the window
        f.setVisible(true);
	}
    
    public static int getScreenSize() {
    	return screenSize;
    }
    
    public JFrame getJFrame() {
    	return f;
    }
}

