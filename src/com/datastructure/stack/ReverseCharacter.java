package com.datastructure.stack;

import java.util.Scanner;

public class ReverseCharacter {
	public static void main(String[] args) {
		CharacterStack.init();
		System.out.println("Enter Your String :");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		for (int i = 0; i < input.length(); i++) {
			CharacterStack.push(input.charAt(i));
		}

		System.out.println("REVERSE STRING:");
		while (!CharacterStack.isEmpty()) {
			System.out.print(CharacterStack.pop());
		}
	}
}
