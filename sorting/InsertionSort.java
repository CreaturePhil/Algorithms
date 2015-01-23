
public class InsertionSort {
	
	/**
	 *  Insertion Sort is an in-place sort that builds
	 *  the final sorted array one item at a time.
	 *  Insertion Sort has O(n^2) time complexity.
	 */
	public int[] insertion_sort(int[] arr) {
		int j, temp;
		for (int i = 0; i < arr.length; i++) {
			j = i;
			while (j > 0 && arr[j-1] > arr[j]) {
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j -= 1;
			}
		}
		
		return arr;
	}

}
