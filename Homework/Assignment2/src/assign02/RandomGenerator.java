package assign02;
import java.util.Scanner;
/**
* @author Kenneth Morse
* @version 1/25/2025
*/

public class RandomGenerator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("What is Your Name?: ");
			String name = input.nextLine(); //  scans whole line for text input
			
			if(name.equals("exit")) {
				break;
			}
			int sum = 0;
			
			for(int i = 0; i < name.length(); i++) {
				sum += name.charAt(i); // sums numerical values of chars together
			}
			
			int[] luckyNums = new int[5];
			int place = 0;
			System.out.print("Lucky numbers: ");
			
			while(place < 5) {
				sum = (73*sum + 37) % 128;
				if(sum<=100) { //  ignores numbers over 100 and continues to next iteration of loop
					luckyNums[place] = sum;
					System.out.print(luckyNums[place] + " ");
					place += 1;
				}
			}
			System.out.println();
			
			// are they lucky?
			int luckySum = 0;
			for(int i : luckyNums) {
				luckySum += i;
			}
			int remainder = luckySum % 3;
			
			if(remainder == 0) {
				System.out.println("You are very lucky");
			}
			else if(remainder == 2){
				System.out.println("You are pretty lucky");
			}
			else {
				System.out.println("You are unlucky");
			}
		} while(1 < 2);
		input.close();
		System.out.println("Goodbye");
		
		
	}

}
