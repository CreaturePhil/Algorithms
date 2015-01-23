
public class SelectionSort {
	
	/**
	 *  Selection Sort is an in-place comparison sort.
	 *  Selection Sort has O(n^2) time complexity.
	 */
	public int[] selection_sort(int[] arr) {
		int min, temp;
        	/* find the min element in the unsorted array */
		for (int i = 0; i < arr.length; i++) {
		    /* assume the min is the first element */
			min = i;
			/* test against elements after i to find the smallest */
			for (int j = i+1; j < arr.length; j++) {
				/* if this element is less, then it is the new minimum */  
				if (arr[j] < arr[min]) {
					/* found new minimum; remember its index */
					min = j;
				}
			}

			if (min != i) {
				/* swap i and min */
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		
		return arr;
	}

}
