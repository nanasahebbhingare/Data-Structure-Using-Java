package com.datastructure.sorting.arraysoperations;

import java.util.Scanner;

public class ArraysOperations {

	/**
	 * Accept Input Array
	 * 
	 * @return
	 */
	public static int[] acceptArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How Many Number You Want To Sort: ");
		int inputnumber = scanner.nextInt();
		System.out.println("Enter Your Number :");
		int[] inputArray = new int[inputnumber];
		for (int i = 0; i < inputnumber; i++) {
			inputArray[i] = scanner.nextInt();

		}
		return inputArray;
	}

	/**
	 * Display Input Array
	 * 
	 * @param inputArray
	 */
	public static void displayArray(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(" " + inputArray[i]);
		}
		System.out.println();

	}

	/**
	 * Accept Sort Order
	 * 
	 * @return
	 */
	public static String acceptSortOrder() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your Sort Order : ");
		return scanner.next();
	}
}