package com.datastructure.linkedlist.singly;

import java.util.Scanner;

public class LinearSearchAssignmentInLinkedlist {
	public static void main(String[] args) {
		System.out.println("Enter Your Required Node And Search Key..!!");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int key = scanner.nextInt();
		Node<Integer> head = SinglyLinkedListUtility.singlyLinkedList(number);
		int pos = linearSearchInLinkedList(head, key);
		if (pos == -1) {
			System.out.println("Not Found..!!");
		} else {
			System.out.println("Found In [" + pos + "] Index");
		}
	}

	private static int linearSearchInLinkedList(Node<Integer> first, int key) {
		int position = 0;
		Node<Integer> last = null;
		for (last = first; last != null; last = last.next) {
			if (last.data == key) {
				return position;
			}
			position++;
		}
		return -1;
	}
}
