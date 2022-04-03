package com.datastructure.stack;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class InfixToPostfixWithoutBraces {
	public final static Integer BOTTOM = -1;
	public final Integer SIZE = 50;

	public static Integer top = 0;
	public Character stack[] = new Character[SIZE];

	public static void init() {
		top = BOTTOM;
	}

	public Boolean isEmpty() {
		if (top == BOTTOM) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public Boolean isFull() {
		if (top == (SIZE - 1)) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public void push(Character data) {
		if (!isFull()) {
			top++;
			stack[top] = data;
		}
	}

	public Character pop() {
		Character data = null;
		if (!isEmpty()) {
			data = stack[top];
			top--;
		}
		return data;
	}

	public Character peek() {
		Character data = null;
		if (!isEmpty()) {
			data = stack[top];
		}
		return data;
	}

	public ArrayList<OperatorAndPriority> setOperatorAndPriority() {
		ArrayList<OperatorAndPriority> arrayList = new ArrayList<>();
		arrayList.add(new OperatorAndPriority('$', 3));
		arrayList.add(new OperatorAndPriority('*', 2));
		arrayList.add(new OperatorAndPriority('/', 2));
		arrayList.add(new OperatorAndPriority('+', 1));
		arrayList.add(new OperatorAndPriority('-', 1));
		arrayList.add(new OperatorAndPriority('(', 0));
		return arrayList;
	}

	public Integer getPriority(Character character) {
		ArrayList<OperatorAndPriority> operatorAndPriorities = setOperatorAndPriority();
		Integer priority = -1;
		OperatorAndPriority operatorAndPriority = operatorAndPriorities.stream()
				.filter(entity -> Character.compare(entity.getOperator(), character) == 0).findFirst().orElse(null);
		if (Objects.nonNull(operatorAndPriority)) {
			return operatorAndPriority.getPriority();
		}
		return priority;
	}

	public void getInfixToPostfix(String inputString) {
		Character data = null, ch = null;
		for (int i = 0; i < inputString.length(); i++) {
			data = inputString.charAt(i);
			if (data.equals('(')) {
				push(data);
				continue;
			}
			if (data.equals(')')) {
				while (true) {
					ch = pop();
					if (ch.equals('(')) {
						break;
					}
					System.out.print(ch);
				}
				continue;
			}
			Integer priority = getPriority(data);
			if (priority == -1) {
				System.out.print(inputString.charAt(i));
			} else {
				while (!isEmpty()) {
					if (getPriority(peek()) >= priority) {
						System.out.print(pop());
					} else {
						break;
					}
				}
				push(data);
			}
		}
		while (!isEmpty()) {
			System.out.print(pop());
		}
	}

	public static void main(String[] args) {
		init();
		InfixToPostfixWithoutBraces infixToPostfixWithoutBraces = new InfixToPostfixWithoutBraces();
		System.out.println("Enter Your Infix String :");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		System.out.println("Your Profix String :");
		infixToPostfixWithoutBraces.getInfixToPostfix(inputString);
	}
}