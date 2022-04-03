package com.datastructure.arrays;

public class DisplaySumOfAllElement {
	public static void main(String[] args) {
		int a[] = { 11, 22, 33, 44, 55 };
		displaySumOfAllElement(a);
	}

	private static void displaySumOfAllElement(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("SUM : " + sum);
	}
}
