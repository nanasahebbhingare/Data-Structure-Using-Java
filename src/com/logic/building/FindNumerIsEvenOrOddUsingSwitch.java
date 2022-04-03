package com.logic.building;

import java.util.Scanner;

public class FindNumerIsEvenOrOddUsingSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Number:-");
		checkEvenOrOddNumber(scanner.nextInt());
	}

	private static void checkEvenOrOddNumber(int num) {
		switch (num % 2) {
		case 0:
			System.out.println("Your Number Is Even : " + num);
			break;
		case 1:
			System.out.println("Your Number Is Odd : " + num);
			break;
		default:
			System.out.println("Please Enter Valid Number: " + num);
			break;
		}
	}
}
