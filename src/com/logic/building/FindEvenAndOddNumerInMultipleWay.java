package com.logic.building;

public class FindEvenAndOddNumerInMultipleWay {
	public static void main(String[] args) {
		int num = 4;
		findEvenAndOddLogic1(num);
		findEvenAndOddLogic2(num);
		findEvenAndOddLogic3(num);
	}

	private static void findEvenAndOddLogic1(int num) {
		int rem = 0;
		rem = num % 2;
		if (rem == 1) {
			System.out.println(num + " Given Number Is ODD");
		} else {
			System.out.println(num + " Given Number Is EVEN");
		}
	}

	private static void findEvenAndOddLogic2(int num) {
		if (num % 2 == 1) {
			System.out.println(num + " Given Number Is ODD");
		} else {
			System.out.println(num + " Given Number Is EVEN");
		}
	}

	private static void findEvenAndOddLogic3(int num) {
		if ((num & 1) == 1) {
			System.out.println(num + " Given Number Is ODD");
		} else {
			System.out.println(num + " Given Number Is EVEN");
		}
	}

}
