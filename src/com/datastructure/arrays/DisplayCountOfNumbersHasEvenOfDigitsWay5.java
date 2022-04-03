package com.datastructure.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DisplayCountOfNumbersHasEvenOfDigitsWay5 {
	public static void main(String[] args) {
		Integer a[] = { 42, 6732, 3334, 34721 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(a));
		displayCountOfNumbersHasEvenOfDigits(arrayList);
	}

	private static void displayCountOfNumbersHasEvenOfDigits(ArrayList<Integer> list) {
		ArrayList<Integer> digitCntList = (ArrayList<Integer>) list.stream()
				.filter(num -> (String.valueOf(num).length() % 2 == 0)).collect(Collectors.toList());
		System.out.println("Count Of Numbers Has Even Of Digits : " + digitCntList.size());
	}
}
