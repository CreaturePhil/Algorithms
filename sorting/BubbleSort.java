
public class BubbleSort {
	
	/**
	 * Bubble Sort repeatedly steps through the list to be sorted, compares each
	 * pair of adjacent items and swaps them if they are in the wrong order. 
	 * The pass through the list is repeated until no swaps are needed, which 
	 * indicates that the list is sorted. Bubble Sort is a comparison sort and is 
	 * named for the way smaller elements "bubble" to the top of the list. 
	 * Bubble Sort has O(n^2) time complexity.
	 */
	public int[] bubble_sort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

}
