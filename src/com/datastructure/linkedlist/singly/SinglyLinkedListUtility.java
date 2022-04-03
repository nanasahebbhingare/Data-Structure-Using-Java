package com.datastructure.linkedlist.singly;

import java.util.Scanner;

@SuppressWarnings("resource")
public class SinglyLinkedListUtility {
	/**
	 * Create singly linked list.
	 * 
	 * @param number
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> Node<T> singlyLinkedList(int number) {
		Node<Integer> first = null, temp = null, last = null;
		System.out.println("Enter Your Data:");
		Scanner scanner = new Scanner(System.in);
		first = NodeUtility.newNode();
		first.data = scanner.nextInt();
		first.next = null;
		// Only one node is present that time first node is always our last
		// node.
		last = first;
		for (int i = 2; i <= number; i++) {
			temp = NodeUtility.newNode();
			temp.data = scanner.nextInt();
			temp.next = null;
			last.next = temp;
			last = last.next;
		}
		last.next = null;
		return (Node<T>) first;
	}

	/**
	 * Create circular singly linked list.
	 *
	 * @param number
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> Node<T> circularSinglyLinkedList(int number) {
		Node<Integer> first = null, temp = null, last = null;
		System.out.println("Enter Your Data:");
		Scanner scanner = new Scanner(System.in);
		first = NodeUtility.newNode();
		first.data = scanner.nextInt();
		first.next = null;
		// Only one node is present that time first node is always our last
		// node.
		last = first;
		for (int i = 2; i <= number; i++) {
			temp = NodeUtility.newNode();
			temp.data = scanner.nextInt();
			temp.next = null;

			last.next = temp;
			last = last.next;
		}
		last.next = first;
		return (Node<T>) first;
	}

	/**
	 * Display singly linked list.
	 * 
	 * @param first
	 */
	public static void displaySinglyLinkedList(Node<Integer> first) {
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

	/**
	 * Free singly linked list.
	 * 
	 * @param first
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> Node<T> freeSinglyLinkedList(Node<Integer> first) {
		Node<Integer> last = null;
		last = first;
		while (first != null) {
			first = first.next;
			NodeUtility.freeNode(last);
			last = first;
		}
		return (Node<T>) first;
	}

	/**
	 * Display circular singly linked list.
	 * 
	 * @param first
	 */
	public static void displayCircularSinglyLinkedList(Node<Integer> first) {
		Node<Integer> last = null;
		if (first != null) {
			last = first;
			System.out.print("Your LinkedList Data :");
			if (first != null) {
				do {
					System.out.print(" " + last.data);
					last = last.next;
				} while (last != first);
			}
		}
		System.out.println();
		System.out.println("------------------------------------------------");
	}

	/**
	 * Free circular singly linked list.
	 * 
	 * @param first
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> Node<T> freeCircularSinglyLinkedList(Node<Integer> first) {
		Node<Integer> last = null;
		if (first != null) {
			last = first;
			first = last.next;
			last.next = null;
			last = first;
			while (first != null) {
				first = first.next;
				NodeUtility.freeNode(last);
				last = first;
			}
		}
		return (Node<T>) first;
	}

	/**
	 * Add element on first position in singly linked list.
	 * 
	 * @param first
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> Node<T> addFirstSinglyLinkedList(Node<Integer> first) {
		if (first != null) {
			Node<Integer> temp = null;
			System.out.println("\nEnter Your Data:");
			Scanner scanner = new Scanner(System.in);
			temp = NodeUtility.newNode();
			temp.data = scanner.nextInt();
			temp.next = first;
			first = temp;
		}
		return (Node<T>) first;
	}

	/**
	 * Add element on last position in circular singly linked list.
	 * 
	 * @param first
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> Node<T> addLastCircularSinglyLinkedList(Node<Integer> first) {
		Node<Integer> temp = null, last = null;
		if (first != null) {
			System.out.println("\nEnter Your Data:");
			Scanner scanner = new Scanner(System.in);
			temp = NodeUtility.newNode();
			temp.data = scanner.nextInt();
			last = first;
			do {
				last = last.next;
			} while (last.next != first);
			last.next = temp;
			last = last.next;
			last.next = first;
		} else {
			return (Node<T>) temp;
		}
		return (Node<T>) first;
	}

	/**
	 * Add element on first position in circular singly linked list.
	 * 
	 * @param first
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> Node<T> addFirstCircularSinglyLinkedList(Node<Integer> first) {
		if (first != null) {
			Node<Integer> temp = null, last = null;
			System.out.println("\nEnter Your Data:");
			Scanner scanner = new Scanner(System.in);
			temp = NodeUtility.newNode();
			temp.data = scanner.nextInt();
			temp.next = null;
			last = first;
			do {
				last = last.next;
			} while (last.next != first);
			temp.next = first;
			first = temp;
			last.next = first;
		}
		return (Node<T>) first;
	}

	/**
	 * Add element on last position in singly linked list.
	 * 
	 * @param first
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> Node<T> addLastSinglyLinkedList(Node<Integer> first) {
		Node<Integer> temp = null, last = null;
		if (first != null) {
			System.out.println("\nEnter Your Data:");
			Scanner scanner = new Scanner(System.in);
			temp = NodeUtility.newNode();
			temp.data = scanner.nextInt();
			for (last = first; last.next != null; last = last.next) {
			}
			last.next = temp;
		} else {
			return (Node<T>) temp;
		}
		return (Node<T>) first;
	}

	/**
	 * Delete element on last position in circular singly linked list.
	 * 
	 * @param first
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> Node<T> deleteFirstCircularSinglyLinkedList(Node<Integer> first) {
		Node<Integer> last = null, temp = null;
		if (first != null) {
			last = first;
			do {
				last = last.next;
			} while (last.next != first);
			temp = first;
			first = first.next;
			temp.next = null;
			freeSinglyLinkedList(temp);
			last.next = first;
		} else {
			return (Node<T>) first;
		}
		return (Node<T>) first;
	}

	/**
	 * Delete element on last position in circular singly linked list.
	 * 
	 * @param first
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> Node<T> deleteLastCircularSinglyLinkedList(Node<Integer> first) {
		Node<Integer> last = null, temp = null;

		if (first != null) {
			for (last = first; last.next != first; last = last.next) {
				temp = last;
			}
			temp.next = null;
			last.next = null;
			freeSinglyLinkedList(last);
			temp.next = first;
		} else {
			return (Node<T>) first;
		}
		return (Node<T>) first;
	}

	/**
	 * Delete element on last position in singly linked list.
	 * 
	 * @param first
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> Node<T> deleteFirstSinglyLinkedList(Node<Integer> first) {
		Node<Integer> last = null;
		if (first != null) {
			last = first;
			first = first.next;
			last.next = null;
			freeSinglyLinkedList(last);
		} else {
			return (Node<T>) first;
		}
		return (Node<T>) first;
	}

	/**
	 * Delete element on last position in singly linked list.
	 * 
	 * @param first
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> Node<T> deleteLastSinglyLinkedList(Node<Integer> first) {
		Node<Integer> last = null, temp = null;
		if (first != null) {
			for (last = first; last.next != null; last = last.next) {
				temp = last;
			}
			temp.next = null;
			freeSinglyLinkedList(last);
		} else {
			return (Node<T>) first;
		}
		return (Node<T>) first;
	}

	/**
	 * Length Of singly linked list.
	 * 
	 * @param first
	 * @return
	 */
	public static int lengthOfSinglyLinkedList(Node<Integer> first) {
		Node<Integer> last = null;
		int lengthCnt = 0;
		if (first == null) {
			return lengthCnt;
		}
		for (last = first; last != null; last = last.next) {
			lengthCnt++;
		}
		return lengthCnt;
	}

	/**
	 * Sum of singly linked list.
	 * 
	 * @param first
	 * @return
	 */
	public static int sumOfSinglyLinkedList(Node<Integer> first) {
		Node<Integer> last = null;
		int sum = 0;
		if (first == null) {
			return 0;
		}
		for (last = first; last != null; last = last.next) {
			sum += last.data;
		}
		return sum;
	}

	/**
	 * Insert data in any postion singly linked list.
	 * 
	 * @param first
	 * @param pos
	 * @return
	 */
	public static <T> Node<T> insertDataInSinglyLinkedList(Node<Integer> first, int pos) {
		Node<Integer> temp = new Node<>();
		Node<Integer> start = null;
		System.out.println("Enter Your Data :");
		Scanner scanner = new Scanner(System.in);
		temp.data = scanner.nextInt();

		if (pos == 1) {
			temp.next = first;
			first = temp;
			return (Node<T>) first;
		}

		for (int i = 1; i <= pos - 2 && start != null; i++) {
			start = start.next;
		}
		if (start == null) {
			System.out.println("Invalid Position...!!!");
			temp = null;
			return (Node<T>) first;
		}
		temp.next = start.next;
		start.next = temp;
		return (Node<T>) first;
	}

	/**
	 * Delete data in any postion singly linked list.
	 * 
	 * @param first
	 * @param pos
	 * @return
	 */
	public static <T> Node<T> deleteDataInSinglyLinkedList(Node<Integer> first, int pos) {
		Node<Integer> temp = null, start = null;
		
		if (pos == 1) {
			temp = first;
			first.next = first;
			temp.next = null;
			NodeUtility.freeNode(temp);
			return (Node<T>) first;
		}

		for (int i = 1; i <= pos - 2 && start != null; i++) {
			start = start.next;
		}
		if (start == null || start.next != null) {
			System.out.println("Invalid Position...!!!");
			return (Node<T>) first;
		}
		temp = start.next;
		start.next = temp.next;
		temp.next = null;
		NodeUtility.freeNode(temp);
		return (Node<T>) first;
	}
}