package lecture9;

public class TimesTable {
	
	public int lowerRange;
	public int upperRange;
	public int [][] Table;
	
	/**
	 * constructor for Times table 
	 * @param x lower limit of times table 
	 * @param y upper limit of times table
	 */
	
	public TimesTable(int x, int y){
		lowerRange = x;
		upperRange = y;
		
		int[][] timesTable = new int[y-x][y-x];
		
		for(int row = x; row <= y; row++) {
			for(int col = x; col <= y; col++) {
				timesTable[row][col] = (row + 1) * (col + 1);
			}	
		}
		
		Table = timesTable;
	}
	/**
	 * 
	 * finds the product of two integers within the scope of the times table it is called on
	 * 
	 * @param x first integer to multiply
	 * @param y second integer to multiply
	 * @return integer value of their product, using the values stored in the times table object
	 */
	
	public Integer product(int x, int y) {
		
		if(x < lowerRange || y > upperRange) {
			return null;
		}
		
		return this.Table[x-1][y-1];
	}
}
