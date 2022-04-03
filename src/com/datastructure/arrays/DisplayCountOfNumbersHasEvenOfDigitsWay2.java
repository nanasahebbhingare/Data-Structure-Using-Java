package com.datastructure.arrays;

public class DisplayCountOfNumbersHasEvenOfDigitsWay2 {
	public static void main(String[] args) {
		int a[] = { 42, 6732, 3334, 34721 };
		displayCountOfNumbersHasEvenOfDigits(a);
	}

	private static void displayCountOfNumbersHasEvenOfDigits(int[] a) {
		int[] digitCntArray = new int[a.length];
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			digitCntArray[i] = checkDigitsInNumbers(a[i]);
		}

		for (int j = 0; j < digitCntArray.length; j++) {
			if (digitCntArray[j] % 2 == 0)
				cnt++;
		}
		System.out.println("Count Of Numbers Has Even Of Digits : " + cnt);
	}
	
	private static int checkDigitsInNumbers(int num) {
		if (num / 10 == 0) {
			return 1;
		}
		return 1 + checkDigitsInNumbers(num / 10);
	}

}
