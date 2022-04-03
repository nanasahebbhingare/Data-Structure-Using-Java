package com.logic.building;

import java.util.Scanner;

/**
 * Find Quotient And Reminder Without Division Or Modulo Operators.
 *
 * @author Bhingare Nana.
 * @since 1.0
 */
public class FindQuotientAndReminderWithoutDivisionOrModuloOperators {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Number:-");
		int number = scanner.nextInt();
		System.out.println("Enter Your Divisor:-");
		int divisor = scanner.nextInt();

		if (divisor <= 0) {
			System.out.println("Please enter valid divisor :-" + divisor);
			return;
		}
		int quotient = 0, reminder = 0;
		while (number >= divisor) {
			number = number - divisor;
			quotient++;
		}
		reminder = number;

		System.out.println("Quotient : " + quotient + " Reminder : " + reminder);
	}
}
