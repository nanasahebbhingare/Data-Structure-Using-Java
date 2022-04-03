package com.datastructure.linkedlist.singly;

import java.util.Scanner;
@SuppressWarnings("resource")
public class CircularSinglyLinkedListOperations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		Node<Integer> head = null;
		do {
			System.out.println(" 1. Create Circular Singly Linked List\n "
					  +"2. Display Circular Singly Linked List\n "
					  +"3. Add First Circular Singly Linked List\n "
					  +"4. Add Last Circular Singly Linked List\n "
					  +"5. Delete First Circular Singly Linked List\n "
					  +"6. Delete Last Circular Singly Linked List\n "
					  +"7. Free Circular Singly Linked List\n 8. Exit");
			System.out.println("Enter Your Choice :");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("How Many Number You Want :");
				int number = scanner.nextInt();
				head = SinglyLinkedListUtility.circularSinglyLinkedList(number);
				break;
			case 2:
				SinglyLinkedListUtility.displayCircularSinglyLinkedList(head);
				break;
			case 3:
				head = SinglyLinkedListUtility.addFirstCircularSinglyLinkedList(head);
				break;
			case 4:
				head = SinglyLinkedListUtility.addLastCircularSinglyLinkedList(head);
				break;
			case 5:
				head = SinglyLinkedListUtility.deleteFirstCircularSinglyLinkedList(head);
				break;
			case 6:
				head = SinglyLinkedListUtility.deleteLastCircularSinglyLinkedList(head);
				break;
			case 7:
				head = SinglyLinkedListUtility.freeCircularSinglyLinkedList(head);
				break;
			case 8:
				System.out.println("Exit Successfully..!!");
				break;
			default:
				System.out.println("Plz select correct choice..!!");
				break;
			}
		} while (choice != 8);
	}

}
