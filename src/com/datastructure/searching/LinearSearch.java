package com.datastructure.searching;

import com.datastructure.sorting.BubbleSort;
import com.datastructure.sorting.arraysoperations.ArraysOperations;

public class LinearSearch {
	public static void main(String[] args) {
		int inputArray[] = ArraysOperations.acceptArray();
		int key = 2;
		// int searchElementIndex = linear_search(inputArray, key);
		int searchElementIndex = oredered_linear_search(inputArray, key);
		if (searchElementIndex < 0) {
			System.out.print("Element Not Found ...!!!");
		} else {
			System.out.print("Search Element : " + inputArray[searchElementIndex]);
		}
	}

	/**
	 * Logic Of linear search.
	 * 
	 * @param inputArray
	 * @param key
	 * @return
	 */
	private static int linear_search(int[] inputArray, int key) {
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == key)
				return i;
		}
		return (-1);
	}

	/**
	 * Logic Of ordered linear search.
	 * 
	 * @param inputArray
	 * @param key
	 * @return
	 */
	private static int oredered_linear_search(int[] inputArray, int key) {
		BubbleSort.bubble_sort_asc(inputArray);
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == key)
				return i;
		}
		return (-1);
	}
}
