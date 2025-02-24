package lecture11;

public class Lecture11Main {

	public static void main(String[] args) {
		GameBoy fun = new GameBoy();
		fun.setRectangle(2,2,55,55,3);
		for(int i = 0; i < 64; i++) {
			System.out.println();
			for(int j = 0; j < 64; j++) {
				System.out.print(fun.getPixel(i,j));
			}
		}
	}

}
