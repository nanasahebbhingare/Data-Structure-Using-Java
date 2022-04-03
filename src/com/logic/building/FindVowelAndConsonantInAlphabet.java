package com.logic.building;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindVowelAndConsonantInAlphabet {
	public static void main(String[] args) {
		System.out.println("Please Enter Ur Alphabet :- ");
		Scanner scanner = new Scanner(System.in);
		checkVowelConsonat(scanner.next().charAt(0));
	}

	private static void checkVowelConsonat(char getChar) {
		switch (getVowelConsonatString(getChar)) {
		case "VOWEL":
			System.out.println("This Vowel Is : " + getChar);
			break;
		case "CONSONAT":
			System.out.println("This Consonant Is : " + getChar);
			break;
		default:
			System.out.println("This Not Vowel And Consonant : " + getChar);
			break;
		}
	}

	private static String getVowelConsonatString(char getChar) {
		List<Character> charVowel = Arrays.asList('a', 'i', 'e', 'o', 'u', 'A', 'I', 'E', 'O', 'U');
		List<Character> charConsonant = Arrays.asList('b', 'B', 'c', 'C', 'd', 'D', 'f', 'F', 'g', 'G', 'h', 'H', 'j',
				'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'p', 'P', 'q', 'Q', 'r', 'r', 's', 'S', 't', 'T', 'v', 'V',
				'w', 'W', 'x', 'X', 'z', 'Z');
		return charVowel.contains(getChar) ? "VOWEL"
				: charConsonant.contains(getChar) ? "CONSONAT" : "NOTVOWELCONSONAT";
	}
}
