package com.logic.building;

import java.util.Scanner;

public class PrintPositiveNumberInfinite {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Ur Number : ");
		while (true) {
			int num = scanner.nextInt();
			if (num < 0)
				break;
			System.out.println("##" + num + "###");
		}
		System.out.println("## Thank You ###");
	}
}
