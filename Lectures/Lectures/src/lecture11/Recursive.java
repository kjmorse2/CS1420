package lecture11;

public class Recursive {


	public int sum(int[] arr) {
		return sum(arr, 0);
	}
	
	private int sum(int[] arr, int index) {
		if(index >= arr.length) {
			return 0; // base case
		}
		return arr[index] + sum(arr,index + 1);
		
	}
	
	public int bianarySearch(Integer[] sortedArr, Integer needle) {
		return bianarySearch(sortedArr, needle, sortedArr.length/2, sortedArr.length);
	}
	
	private Integer bianarySearch(Integer[] sortedArr, Integer needle, Integer middle, Integer end) {
		if(needle == middle) {
			return (Integer)middle;
		}
		else if(middle == end || end < middle) {
			return null;
		}
		else if(needle < middle) {
			return bianarySearch(sortedArr, needle, middle/2, middle);
		}
		else{
			return bianarySearch(sortedArr, needle, middle + (end-middle)/2, end);
		}
	}
}
