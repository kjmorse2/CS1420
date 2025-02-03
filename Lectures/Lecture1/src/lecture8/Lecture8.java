package lecture8;

public class Lecture8 {
	// END OF EXAM 1 MATERIAL 
	public static void main(String[] args) {
		// 2D arrays
		
		int [][] rectangularArray = new int[2][2];
		rectangularArray[0] = new int[]{1,2};
		rectangularArray[1] = new int[]{3,4};
		// chessBoard example below 
		Character[][]chessBoard = chessBoard();
		
		print2DArray(chessBoard);
		
		//rectangular array 
		Integer[][]rectangularExample = rectangularArray(4,6);
		
		System.out.println();
		
		print2DArray(rectangularExample);
		
	}
	
	public static Integer[][] rectangularArray(int rows, int cols){
		Integer [][] returnArray = new Integer[rows][cols];
		
		int value = 0;
		
		for(int r = 0; r < returnArray.length; r++) {
			for(int c = 0; c<returnArray[r].length; c++) {
				returnArray[r][c] = value;
				value = (value + 1) % 10;
			}
		}
		
		return returnArray;
	}
	
	
	
	
	//EXAMPLE: Chess Board
	public static Character[][] chessBoard() {
		Character[][] chessBoard = new Character[8][8];
		char king = 'k';
		char knight = 'n';
		char bishop = 'b';
		char queen = 'q';
		char pawn = 'p';
		char rook = 'r';
		
		chessBoard[0][3] = king;
		chessBoard[7][4] = king;
		
		chessBoard[0][4] = queen;
		chessBoard[7][3] = queen;
		
		int[] pawnRows = {1,6};
		
		for(int i : pawnRows)	
			for(int j= 0; j<8; j++) {
				chessBoard[i][j] = pawn;
			}
		
		chessBoard[0][0] = rook;
		chessBoard[0][7] = rook;
		chessBoard[7][0] = rook;
		chessBoard[7][7] = rook;
		
		chessBoard[0][1] = knight;
		chessBoard[0][6] = knight;
		chessBoard[7][1] = knight;
		chessBoard[7][6] = knight;
		
		chessBoard[0][2] = bishop;
		chessBoard[0][5] = bishop;
		chessBoard[7][2] = bishop;
		chessBoard[7][5] = bishop;
		

		for(int i = 2; i < 6; i++) {
			for(int j = 0; j < 8; j++) {
				chessBoard[i][j] = '_';
			}
		}
		
		
		
		
		return chessBoard;
	}
	
	
	// own generic print 2d array method yippie
	public static <E> void print2DArray(E[][] array) {
		for(E[] row : array) {
			for(E element : row) {
				System.out.print(element);
			}
			System.out.println();
		}
		
	}

}
