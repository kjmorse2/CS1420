package lecture02;
import java.util.Scanner;

public class Lecture2{
	public static void main(String[] args) {
		String hello = "hello";
		System.out.println("String length is " + hello.length());
		int worldLength = "world".length();
		System.out.println("world length: " + worldLength);		
		
		// length() returns an integer
		// hello 
		// 01234
		int index = 3;
		System.out.println("Char at " + index + ": " + hello.charAt(index));
		
		// method with 2 parameters: 
		// substring(int begin, int end)
		
		System.out.println(hello.substring(0,4));
		System.out.println("No more saying cuss-words guys!");
		
		System.out.println(hello.substring(1, hello.length())); //  ending index is exclusive,
		// does not include character at end index, only char before
		
		// ERROR EXAMPLE System.out.println(hello.charAt(hello.length()));
		
		// another object type is Scanner
		
		Scanner scanner = new Scanner(System.in);
		
		int magicNumber = scanner.nextInt();
		
		System.out.println("excellent choise of " + magicNumber);
		
		scanner.close();	
		// t
	}
}
