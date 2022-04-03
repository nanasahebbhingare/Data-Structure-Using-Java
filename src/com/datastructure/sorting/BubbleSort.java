package com.datastructure.sorting;

import com.datastructure.sorting.arraysoperations.ArraysOperations;

public class BubbleSort {
	public static void main(String[] args) {
		int inputArray[] = ArraysOperations.acceptArray();
		System.out.print("Unsorted Array : ");
		ArraysOperations.displayArray(inputArray);
		bubble_sort_asc_improve(inputArray);
		System.out.print("Sorted Array : ");
		ArraysOperations.displayArray(inputArray);
	}

	/**
	 * Logic Of Bubble Sort ASC.
	 * 
	 * @param inputArray
	 * @return
	 */
	public static int[] bubble_sort_asc(int[] inputArray) {
		int temp = 0;
		int length = inputArray.length;
		for (int i = length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
				}
			}
		}
		return inputArray;
	}

	/**
	 * Logic Of Bubble Sort DESC.
	 * 
	 * @param inputArray
	 * @return
	 */
	public static int[] bubble_sort_desc(int[] inputArray) {
		int temp = 0;
		int length = inputArray.length;
		for (int i = length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (inputArray[j] < inputArray[j + 1]) {
					temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
				}
			}
		}
		return inputArray;
	}

	/**
	 * Logic Of Bubble Sort DESC.
	 * 
	 * @param inputArray
	 * @return
	 */
	public static int[] bubble_sort_asc_v2(int[] inputArray) {
		int temp = 0;
		int length = inputArray.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
				}
			}
		}
		return inputArray;
	}

	/**
	 * Logic Of Bubble Sort ASC.
	 * 
	 * @param inputArray
	 * @return
	 */
	public static int[] bubble_sort_asc_improve(int[] inputArray) {
		int temp = 0;
		int length = inputArray.length;
		boolean sortFlag = true;
		for (int i = length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
					sortFlag = false;
				}
			}
			if (sortFlag) {
				break;
			}
		}
		return inputArray;
	}
}