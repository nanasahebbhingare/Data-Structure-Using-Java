package com.datastructure.stack;

import java.util.Scanner;

public class CharacterStack {

	public final static Integer BOTTOM = -1;
	public final static Integer SIZE = 50;

	public static Character stack[] = new Character[SIZE];
	public static Integer top = 0;

	public static void init() {
		top = BOTTOM;
	}

	public static Boolean isEmpty() {
		if (top == BOTTOM) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public static Boolean isFull() {
		if (top == (SIZE - 1)) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public static void push(Character data) {
		if (!isFull()) {
			top++;
			stack[top] = data;
		}
	}

	public static Character pop() {
		Character data = null;
		if (!isEmpty()) {
			data = stack[top];
			top--;
		}
		return data;
	}

	public static Character peek() {
		Character data = null;
		if (!isEmpty()) {
			data = stack[top];
		}
		return data;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Integer choice = 0;
		init();
		while (true) {
			System.out.println("Menu:\n 1)PUSH \n 2)POP \n 3)PEEK \n 4)EXIT");
			System.out.println("Enter Your Choice:");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				if (isFull()) {
					System.out.println("Stack Is Full ..!!");
				} else {
					System.out.println("Enter Data To Push:");
					Character data = scanner.next().charAt(0);
					push(data);
				}
				break;
			case 2:
				if (isEmpty()) {
					System.out.println("Stack Is Empty ..!!");
				} else {
					Character data = pop();
					System.out.println("POOPED ELEMENT :" + data);
				}
				break;
			case 3:
				if (isEmpty()) {
					System.out.println("Stack Is Empty ..!!");
				} else {
					Character data = peek();
					System.out.println("TOPMOST ELEMENT :" + data);
				}
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid Choice..!!");
				break;
			}
		}
	}
}
