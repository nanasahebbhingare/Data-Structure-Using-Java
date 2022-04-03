package com.datastructure.linkedlist.singly;

import java.util.Scanner;
@SuppressWarnings("resource")
public class SinglyLinkedListOperations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		Node<Integer> head = null;
		do {
			System.out.println(" 1. Create Singly Linked List\n "
							  +"2. Display Singly Linked List\n "
							  +"3. Add First Singly Linked List\n "
							  +"4. Add Last Singly Linked List\n "
							  +"5. Delete First Singly Linked List\n "
							  +"6. Delete Last Singly Linked List\n "
							  +"7. Length Of Singly Linked List\n "
							  +"8. Sum Of Singly Linked List\n "
							  +"9. Free Singly Linked List\n 10.Exit");
			System.out.println("Enter Your Choice :");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("How Many Number You Want :");
				int number = scanner.nextInt();
				head = SinglyLinkedListUtility.singlyLinkedList(number);
				break;
			case 2:
				SinglyLinkedListUtility.displaySinglyLinkedList(head);
				break;
			case 3:
				head = SinglyLinkedListUtility.addFirstSinglyLinkedList(head);
				break;
			case 4:
				head = SinglyLinkedListUtility.addLastSinglyLinkedList(head);
				break;
			case 5:
				head = SinglyLinkedListUtility.deleteFirstSinglyLinkedList(head);
				break;
			case 6:
				head = SinglyLinkedListUtility.deleteLastSinglyLinkedList(head);
				break;
			case 7:
				int length = SinglyLinkedListUtility.lengthOfSinglyLinkedList(head);
				System.out.println("Length Of Singly LinkedList : " + length);
				break;
			case 8:
				int sum = SinglyLinkedListUtility.sumOfSinglyLinkedList(head);
				System.out.println("Sum Of Singly LinkedList : " + sum);
				break;
			case 9:
				head = SinglyLinkedListUtility.freeSinglyLinkedList(head);
				break;
			case 10:
				System.out.println("Exit Successfully..!!");
				break;
			default:
				System.out.println("Plz select correct choice..!!");
				break;
			}
		} while (choice != 10);
	}
}
