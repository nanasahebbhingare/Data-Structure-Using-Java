package com.datastructure.sorting;

import com.datastructure.sorting.arraysoperations.ArraysOperations;

public class InsertionSort {
	public static void main(String[] args) {
		int inputArray[] = ArraysOperations.acceptArray();
		System.out.print("Unsorted Array : ");
		ArraysOperations.displayArray(inputArray);
		insertion_sort_asc(inputArray);
		System.out.print("Sorted Array : ");
		ArraysOperations.displayArray(inputArray);
	}

	/**
	 * Logic Of Insertion Sort ASC.
	 * 
	 * @param inputArray
	 * @return
	 */
	public static int[] insertion_sort_asc(int[] inputArray) {
		int temp = 0, j = 0;
		int length = inputArray.length;
		for (int i = 1; i < length; i++) {
			temp = inputArray[i];
			for (j = i - 1; j >= 0; j--) {
				if (inputArray[j] > temp) {
					inputArray[j+1] = inputArray[j];
				} else {
					break;
				}
			}
			inputArray[j + 1] = temp;
		}
		return inputArray;
	}
	
	/**
	 * Logic Of Insertion Sort DESC.
	 * 
	 * @param inputArray
	 * @return
	 */
	public static int[] insertion_sort_desc(int[] inputArray) {
		int temp = 0, j = 0;
		int length = inputArray.length;
		for (int i = 1; i < length; i++) {
			temp = inputArray[i];
			for (j = i - 1; j >= 0; j--) {
				if (inputArray[j] < temp) {
					inputArray[j+1] = inputArray[j];
				} else {
					break;
				}
			}
			inputArray[j + 1] = temp;
		}
		return inputArray;
	}
}
