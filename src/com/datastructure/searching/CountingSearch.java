package com.datastructure.searching;

public class CountingSearch {
	public static void main(String[] args) {
		int inputArray[] = { 1, 2, 3, 4, 2, 3, 5, 4, 4 };
		inputArray = counting_search(inputArray);
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]);
		}
	}

	private static int[] counting_search(int[] inputArray) {
		int maxLenght = maxSizeInArray(inputArray);
		int outputArray[] = new int[inputArray.length];
		int countNo[] = new int[maxLenght + 1];
		for (int i = 0; i < inputArray.length; i++) {
			countNo[inputArray[i]]++;
		}

		for (int i = 1; i <= maxLenght; i++) {
			countNo[i] = countNo[i - 1] + countNo[i];
		}

		for (int i = 0; i < inputArray.length; i++) {
			outputArray[countNo[inputArray[i]] - 1] = inputArray[i];
			countNo[inputArray[i]]--;
		}

		return outputArray;
	}

	private static int maxSizeInArray(int[] inputArray) {
		int max = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (max < inputArray[i]) {
				max = inputArray[i];
			}
		}
		return max;
	}
}
