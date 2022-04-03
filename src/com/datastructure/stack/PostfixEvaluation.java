package com.datastructure.stack;

import java.util.Scanner;

public class PostfixEvaluation {
	public static void main(String[] args) {
		System.out.println("Enter Your Postfix String :");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		getPostfixEvaluation(inputString);
	}

	public static void getPostfixEvaluation(String inputString) {
		Integer opr1 = null, opr2 = null;
		for (int i = 0; i < inputString.length(); i++) {
			Character inputChar = inputString.charAt(i);
			switch (inputChar) {
			case '*':
				opr2 = IntegerStack.pop();
				opr1 = IntegerStack.pop();
				IntegerStack.push(opr1 * opr2);
				break;
			case '/':
				opr2 = IntegerStack.pop();
				opr1 = IntegerStack.pop();
				IntegerStack.push(opr1 / opr2);
				break;
			case '+':
				opr2 = IntegerStack.pop();
				opr1 = IntegerStack.pop();
				IntegerStack.push(opr1 + opr2);
				break;
			case '-':
				opr2 = IntegerStack.pop();
				opr1 = IntegerStack.pop();
				IntegerStack.push(opr1 - opr2);
				break;
			default:
				if (isDigit(inputChar)) {
					IntegerStack.push(Integer.valueOf(inputChar - 48));
				} else {
					System.out.println("Fill Value Of " + inputChar);
					Scanner scanner = new Scanner(System.in);
					Integer value = scanner.nextInt();
					IntegerStack.push(Integer.valueOf(value));
				}
				break;
			}
		}
		System.out.println("Answer :" + IntegerStack.pop());
	}

	private static boolean isDigit(Character inputChar) {
		if (inputChar >= 48 && inputChar <= 57) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}
