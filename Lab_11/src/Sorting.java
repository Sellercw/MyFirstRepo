import java.util.Arrays;
/**
 * 
 * @author sellercw
 *
 */
public class Sorting {
	/** Sorting algorithms **/

	// Selectionsort.
	/**
	 * selection sort
	 * @param array an array of integers
	 */
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for(int j = i+1; j < array.length; j++) {
				if(array[j] < array[min])
					min = j;
			}
			//swap
			swap(array, i, min);
		}
	}

	// Insertion sort.
	/**
	 * insertion sort
	 * @param array an array of int values
	 */
	public static void insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			int j = i;
			while(j >= 1 && array[j-1] > temp) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = temp;
		}

	}

	// Quicksort.
	/**
	 * quick sort method
	 * @param array an array of integer values
	 */
	public static void quickSort(int[] array) {
		quickSort(array,0,array.length-1);
	}

	// Quicksort part of an array
	/**
	 * quick sort method
	 * @param array an array of integer values
	 * @param begin the start of the array
	 * @param end the end of the array
	 */
	private static void quickSort(int[] array, int begin, int end) {
		int index = partition(array, begin, end);
		
		if(begin < index - 1)
		{
			quickSort(array, begin, index - 1);
		}
		if (index < end) {
			quickSort(array, index, end);
		}
	}

	// Partition part of an array, and return the index where the pivot
	// ended up.
	/**
	 * partition method
	 * @param array an array of intger values
	 * @param begin the beggining of the array
	 * @param end the end of the array
	 * @return returns an integer pivot point
	 */
	private static int partition(int[] array, int begin, int end) {
		int pivot = array[(begin+end)/2];

		while(begin <= end)
		{
			while(array[begin] < pivot) begin++;
			while(array[end] > pivot) end--;


			if(begin <= end)
			{
				swap(array, begin, end);
				begin++;
				end--;
			}

		}
		return begin;
	}

	// Swap two elements in an array
	/**
	 * swap method
	 * @param array an array of integer values
	 * @param i the values being swapped
	 * @param j the values being swapped
	 */
		private static void swap(int[] array, int i, int j) {
		int x = array[i];
		array[i] = array[j];
		array[j] = x;
	}

	// Mergesort.

		/**
		 * merge sort 
		 * @param array an array of integer values
		 * @return returns an intger array 
		 */
	public static int[] mergeSort(int[] array) {
		if(array.length <= 1)
		{
			return array;
		}
		int mid = array.length /2;

		int[] left = new int[mid];
		int[] right;

		if(array.length % 2 ==0)
		{
			right = new int[mid];
		}
		else
		{
			right = new int[mid+1];
		}
		for(int i =0; i< mid; i++)
		{
			left[i] = array[i];
		}
		for(int j=0; j<right.length; j++)
		{
			right[j] = array[mid+j];
		}
		int[] result = new int[array.length];
		
		left = mergeSort(left);
		right = mergeSort(right);

		result = merge(left, right);
		return result;
	}

	// Merge two sorted arrays into one
	/**
	 * merge 
	 * @param left the left array
	 * @param right the right array
	 * @return returns a combined single array
	 */
	private static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int i1 = 0;
		int i2 = 0;
		for(int i = 0; i < result.length; i++) {
			if(i2 >= right.length || i1< left.length && left[i1] <= right[i2]) {
				result[i] = left[i1];
				i1++;
			} else {
				result[i] = right[i2];
				i2++;
			}
		}
		return result;
	}

}

