package com.datastructure.sorting;

import com.datastructure.sorting.arraysoperations.ArraysOperations;

public class BubbleSortWithUserRequirmentOrder {
	public static void main(String[] args) {
		int[] inputArray = ArraysOperations.acceptArray();
		String sortOrder = ArraysOperations.acceptSortOrder();
		System.out.print("Unsorted Array : ");
		ArraysOperations.displayArray(inputArray);
		if (sortOrder.equalsIgnoreCase("asc")) {
			BubbleSort.bubble_sort_asc_v2(inputArray);
		} else {
			BubbleSort.bubble_sort_desc(inputArray);
		}
		System.out.print("Sorted Array : ");
		ArraysOperations.displayArray(inputArray);
	}
}
