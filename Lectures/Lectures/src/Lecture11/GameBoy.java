package Lecture11;


public class GameBoy {

	int[][] pixels;

	public GameBoy() {

		pixels = new int[64][64];

		for (int i = 0; i < pixels.length; i++) {
			for (int j = 0; j < pixels[0].length; j++) {
				pixels[i][j] = 0;
			}
		}
	}

	public int getPixel(int x, int y) throws IllegalArgumentException{
		if(!boundsCheck(new int[] {x,y}).equals(null)) {
			throw boundsCheck(new int[] {x,y});
		}
		
		return pixels[x][y];
	}

	public void setPixel(int x, int y, int color){
		if (!colorCheck(color).equals(null)) {
			colorCheck(color);
		} else if(!boundsCheck(new int[] {x,y}).equals(null) ) { 
			throw boundsCheck(new int[] {x,y});
		} else {
			pixels[x][y] = color;
		}
	}
	
	/**
	 * 
	 * @param leftX
	 * @param bottomY
	 * @param rightX
	 * @param topY
	 * @param color
	 * @throws IllegalArgumentException
	 */
	public void setRectangle(int leftX, int bottomY, int rightX, int topY, int color) 
			throws IllegalArgumentException {
		if (!boundsCheck(new int[]{leftX,bottomY,rightX,topY}).equals(null)) {
			throw boundsCheck(new int[]{leftX,bottomY,rightX,topY});
		} else if (!colorCheck(color).equals(null)) {
			throw colorCheck(color);
		} else if (leftX > rightX || bottomY > topY) {
			throw new IllegalArgumentException();
		}
		
		for(int i = leftX; i <= rightX; i++) {
			for(int j = bottomY; j <= topY; j++) {
				setPixel(i,j,color);
			}
		}
		
	}

	
	
	private IllegalArgumentException colorCheck(int color) {
		if (color < 0 || color > 3) {
			return new IllegalArgumentException("color takes value between 0 and 3");
		}
		return null;
	}	
	
	private IllegalArgumentException boundsCheck(int[]bounds) {
		for(int bound : bounds) {
			if(bound < 0 || bound > 63) {
				throw new IllegalArgumentException(bound + "location is off the screen, max value of any pixel is index 64");
			}
		}
			return null;
	}
	

}
