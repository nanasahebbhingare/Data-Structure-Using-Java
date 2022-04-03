package com.datastructure.searching;

import com.datastructure.sorting.arraysoperations.ArraysOperations;

public class SentinelSearch {
	public static void main(String[] args) {
		int inputArray[] = ArraysOperations.acceptArray();
		int key = 6;
		int searchElementIndex = sentinel_search(inputArray, key);
		if (searchElementIndex < 0) {
			System.out.print("Element Not Found ...!!!");
		} else {
			System.out.print("Search Element : " + inputArray[searchElementIndex]);
		}
	}

	private static int sentinel_search(int[] inputArray, int key) {
		int i = 0;
		int lastIndex = inputArray.length - 1;
		int last = inputArray[lastIndex];
		inputArray[lastIndex] = key;
		for (i = 0; inputArray[i] != key; i++) {
		}

		inputArray[lastIndex] = last;
		if (i < lastIndex) {
			return i;
		}
		if (inputArray[lastIndex] == key) {
			return i;
		}
		return (-1);
	}
}
