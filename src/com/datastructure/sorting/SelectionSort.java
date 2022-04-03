package com.datastructure.sorting;

import com.datastructure.sorting.arraysoperations.ArraysOperations;

public class SelectionSort {
	public static void main(String[] args) {
		int inputArray[] = ArraysOperations.acceptArray();
		System.out.print("Unsorted Array : ");
		ArraysOperations.displayArray(inputArray);
		selection_sort_asc(inputArray);
		System.out.print("Sorted Array : ");
		ArraysOperations.displayArray(inputArray);
	}

	/**
	 * Logic Of Insertion Sort ASC.
	 * 
	 * @param inputArray
	 * @return
	 */
	public static int[] selection_sort_asc(int[] inputArray) {
		int temp = 0;
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] > inputArray[j]) {
					temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		return inputArray;
	}
	
	/**
	 * Logic Of Insertion Sort DESC.
	 * 
	 * @param inputArray
	 * @return
	 */
	public static int[] selection_sort_desc(int[] inputArray) {
		int temp = 0;
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] < inputArray[j]) {
					temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		return inputArray;
	}
}
