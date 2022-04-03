package com.datastructure.sorting;

public class BubbleSortStringArray {
	public static void main(String[] args) {
		String[] str = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		bubble_sort_string(str);
		for (int i = 0; i <= str.length - 1; i++) {
			System.out.println(str[i]);
		}
	}

	private static void bubble_sort_string(String[] str) {
		String temp = null;
		for (int i = str.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (str[j].compareTo(str[j + 1]) > 0) {
					temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
	}
}
