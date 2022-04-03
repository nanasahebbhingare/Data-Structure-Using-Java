package com.datastructure.searching;

import com.datastructure.sorting.BubbleSort;
import com.datastructure.sorting.arraysoperations.ArraysOperations;

public class BinarySearch {
	public static void main(String[] args) {
		int inputArray[] = ArraysOperations.acceptArray();
		int key = 6;
		BubbleSort.bubble_sort_asc(inputArray);
		int searchElementIndex = binary_search(inputArray, key);
		if (searchElementIndex < 0) {
			System.out.print("Element Not Found ...!!!");
		} else {
			System.out.print("Search Element : " + inputArray[searchElementIndex]);
		}
	}

	private static int binary_search(int[] inputArray, int key) {
		int lower = 0;
		int higher = inputArray.length - 1;
		while (lower <= higher) {
			int mid = (lower + higher) / 2;
			if (inputArray[mid] == key) {
				return mid;
			}
			if (key > inputArray[mid]) {
				lower = mid + 1;
			} else {
				higher = mid - 1;
			}
		}
		return -1;
	}
}
