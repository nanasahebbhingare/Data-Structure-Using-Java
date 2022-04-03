package com.datastructure.stack;

import java.util.Scanner;

import com.datastructure.linkedlist.doubly.Node;
import com.datastructure.linkedlist.doubly.NodeUtility;

public class DynamicStack {
	final static Node<Integer> BOTTOM = null;
	static Node<Integer> top;

	public static void init() {
		top = BOTTOM;
	}

	public static Boolean isEmpty() {
		if (top == BOTTOM) {
			return true;
		} else {
			return false;
		}
	}

	@SuppressWarnings("unused")
	public static void push(Integer data) {
		Node<Integer> temp = NodeUtility.newNode();
		temp.data = data;
		temp.prev = null;
		temp.next = null;
		if (temp == null) {
			System.out.println("Stack Full..!!");
			return;
		}
		if (top == BOTTOM) {
			top = temp;
		} else {
			top.next = temp;
			temp.prev = top;
			top = top.next;
		}
	}

	public static Integer pop() {
		Integer item = 0;
		Node<Integer> temp;
		if (!isEmpty()) {
			item = top.data;
			temp = top;
			top = top.prev;
			NodeUtility.freeNode(temp);
			if (top != null) {
				top.next = null;
			}
		}
		return item;
	}

	public static Integer peek() {
		Integer item = 0;
		if (!isEmpty()) {
			item = top.data;
		}
		return item;
	}

	public static void main(String[] args) {
		Integer choice = 0, data = 0;
		init();
		while (true) {
			System.out.println("Menu:\n 1)PUSH \n 2)POP \n 3)PEEK \n 4)EXIT");
			System.out.println("Enter Your Choice:");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Data To Push:");
				data = scanner.nextInt();
				push(data);
				break;
			case 2:
				if (isEmpty()) {
					System.out.println("Stack Is Empty ..!!");
				} else {
					data = pop();
					System.out.println("POOPED ELEMENT :" + data);
				}
				break;
			case 3:
				if (isEmpty()) {
					System.out.println("Stack Is Empty ..!!");
				} else {
					data = peek();
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