package lecture12;

public class WarmupQ {
	
	public static int arrayMax(int[] arr) throws IllegalArgumentException{
		if (arr.length == 0) {
			throw new IllegalArgumentException("Array must not be empty"); 
		}
		if(arr.length == 1) {
			return arr[0];
		}
		return arrayMax(arr[0], arr, 1);
	}
	
	private static int arrayMax(int biggestSoFar, int[] arr, int startIndex) {
		if(startIndex == arr.length) {
			return biggestSoFar;
		}
		
		if(arr[startIndex] > biggestSoFar) {
			biggestSoFar = arr[startIndex];
		}
		
		return arrayMax(biggestSoFar, arr, startIndex + 1);
	}


}
