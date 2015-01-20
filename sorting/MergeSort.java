import java.util.Arrays;

public class MergeSort {
	
	/**
	 * Takes a unsorted array and returns a sorted array.
	 * 
	 * Merge Sort is a O(nlogn) comparison-based 
	 * divide and conquer sorting algorithm.
	 * 
	 * This is an top-down implementation of Merge Sort which 
	 * recursively divides the input array into smaller sub-arrays 
	 * until the sub-arrays are sorted, and then merges the sub-arrays 
	 * while returning up the call chain.
	 */
	public int[] merge_sort(int[] m) {
		if (m.length <= 1) {
			return m;
		}
		
		/* Recursive case. First, divide the array into equal-sized sub-arrays. */
		int middle = Math.round(m.length/2);
		int[] left = Arrays.copyOfRange(m, 0, middle);
		int[] right = Arrays.copyOfRange(m, middle, m.length);
		
		/* Recursively sort both sub-arrays. */
		left = merge_sort(left);
		right = merge_sort(right);
		return merge(left, right);
	}
	
	public int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int counter = 0;
		int i = 0, j = 0;
		while(i < left.length && j < right.length) {
			if(left[i] <= right[j]) {
				result[counter] = left[i];
				i++;
			} else {
				result[counter] = right[j];
				j++;
			}
			counter++;
		}

		/* either left or right may have elements left */
		int[] restOfLeft = Arrays.copyOfRange(left, i, left.length);
		int[] restOfRight = Arrays.copyOfRange(right, j, right.length);
		if (restOfLeft.length != 0) {
			for(int l = i; l < left.length; l++) {
				result[counter] = left[l];
				counter++;
			}
		}
		if (restOfRight.length != 0) {
			for(int r = j; r < right.length; r++) {
				result[counter] = right[r];
				counter++;
			}
		}
		return result;
	}

}
