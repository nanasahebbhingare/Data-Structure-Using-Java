package com.datastructure.arrays;

public class DisplaySumOfEventElement {
	public static void main(String[] args) {
		int a[] = { 11, 22, 33, 44, 55 };
		displaySumOfAllEventElement(a);
	}

	private static void displaySumOfAllEventElement(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				sum = sum + a[i];
		}
		System.out.println("SUM : " + sum);
	}
}
