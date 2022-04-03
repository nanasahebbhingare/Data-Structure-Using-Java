package com.datastructure.linkedlist.doubly;

import java.util.Scanner;

public class DoublyLinkedListUtility {
	/**
	 * Create doubly linked list.
	 * 
	 * @param number
	 * @return
	 */
	public static <T> Node<T> createDoublyLinkedList(int number) {
		Node<Integer> first = null, temp = null, last = null;
		first = NodeUtility.newNode();
		System.out.println("Enter Your Data: ");
		Scanner scanner = new Scanner(System.in);
		first.data = scanner.nextInt();
		first.prev = null;
		first.next = null;
		last = first;

		for (int i = 2; i <= number; i++) {
			temp = NodeUtility.newNode();
			temp.data = scanner.nextInt();
			last.next = temp;
			temp.prev = last;
			last = last.next;
		}
		last.next = null;
		return (Node<T>) first;
	}

	/**
	 * Create Circular Doubly Linked List.
	 * 
	 * @param number
	 * @return
	 */
	public static <T> Node<T> createCircularDoublyLinkedList(int number) {
		Node<Integer> first = null, temp = null, last = null;
		first = NodeUtility.newNode();
		System.out.println("Enter Your Data: ");
		Scanner scanner = new Scanner(System.in);
		first.data = scanner.nextInt();
		first.prev = null;
		first.next = null;
		last = first;

		for (int i = 2; i <= number; i++) {
			temp = NodeUtility.newNode();
			temp.data = scanner.nextInt();
			last.next = temp;
			temp.prev = last;
			last = last.next;
		}
		last.next = first;
		last.prev = last;
		return (Node<T>) first;
	}

	/**
	 * Display Doubly Linked List.
	 * 
	 * @param first
	 */
	public static void displayDoublyLinkedList(Node<Integer> first) {
		{
			Node<Integer> last = null;
			if (first != null) {
				System.out.print("Your LinkedList Data : ");
				for (last = first; last != null; last = last.next) {
					System.out.print(" " + last.data);
				}
			}
			System.out.println();
			System.out.println("------------------------------------------------");

		}
	}

	/**
	 * Reverse Display Doubly Linked List.
	 * 
	 * @param first
	 */
	public static void reverseDisplayDoublyLinkedList(Node<Integer> first) {
		{
			Node<Integer> last = null;
			if (first != null) {
				System.out.print("Your LinkedList Data : ");
				for (last = first; last.next != null; last = last.next) {
				}
				for (; last != null; last = last.prev) {
					System.out.print(" " + last.data);
				}

			}
			System.out.println();
			System.out.println("------------------------------------------------");

		}
	}

	/**
	 * EraseAll Display Doubly Linked List.
	 * 
	 * @param first
	 */
	public static <T> Node<T> eraseAllDoublyLinkedList(Node<Integer> first) {
		{
			Node<Integer> last = null;
			if (first != null) {
				last = first;
				while (first != null) {
					first = first.next;
					NodeUtility.freeNode(last);
					last = first;
				}
			}
		}
		return (Node<T>) first;
	}

	/**
	 * Display Circular Doubly Linked List.
	 * 
	 * @param first
	 */
	public static void displayCircularDoublyLinkedList(Node<Integer> first) {
		{
			Node<Integer> last = null;
			if (first != null) {
				System.out.print("Your LinkedList Data : ");
				last = first;
				do {
					System.out.print(" " + last.data);
					last = last.next;
				} while (last != first);
			}
			System.out.println();
			System.out.println("------------------------------------------------");

		}
	}

	/**
	 * Insert Any Position Doubly Linked List.
	 *
	 * @param first
	 * @param pos
	 * @return
	 */
	public static <T> Node<T> insertDoublyLinkedList(Node<Integer> first, int pos) {
		{
			Node<Integer> last = null, start = null;
			if (first != null) {
				last = NodeUtility.newNode();
				last.next = null;
				last.prev = null;
				if (pos == 1) {
					last.next = first;
					first.prev = last;
					first = last;
					return (Node<T>) first;
				} else {
					start = first;
					for (int i = 1; i <= pos - 2 && start != null; i++) {
						start = start.next;
					}
					if (start == null) {
						System.out.println("Invalid Postion...!!!");
						NodeUtility.freeNode(last);
						return (Node<T>) first;
					}
					last.next = start.next;
					last.prev = start;
					start.next.prev = last;
					start.next = last;
				}
			}
		}
		return (Node<T>) first;
	}

	/**
	 * Delete Any Position Doubly Linked List.
	 *
	 * @param first
	 * @param pos
	 * @return
	 */
	public static <T> Node<T> deleteDoublyLinkedList(Node<Integer> first, int pos) {
		{
			Node<Integer> last = null, start = null;
			if (first != null) {
				if (pos == 1) {
					last = first;
					first = first.next;
					last.next = null;
					NodeUtility.freeNode(last);
					first.prev = null;
					return (Node<T>) first;
				} else {
					start = first;
					for (int i = 1; i <= pos - 2 && start != null; i++) {
						start = start.next;
					}
					if (start == null || start.next == null) {
						System.out.println("Invalid Postion...!!!");
						return (Node<T>) first;
					}
					last = start.next;
					start.next = last.next;
					last.next.prev = start;
					NodeUtility.freeNode(last);
					return (Node<T>) first;
				}
			}
		}
		return (Node<T>) first;
	}
}