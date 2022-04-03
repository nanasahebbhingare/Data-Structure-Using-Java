package com.datastructure.linkedlist.singly;

import java.util.Scanner;

public class FindReplaceAssignmentInLinkedlist {
	public static void main(String[] args) {

		System.out.println("How many node you want ?? Whice element you want to replace from and to..!!");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int replaceFrom = scanner.nextInt();
		int replaceTo = scanner.nextInt();
		Node<Integer> head = SinglyLinkedListUtility.singlyLinkedList(number);
		int replaceCnt = findReplaceInLinkedList(head, replaceFrom, replaceTo);
		if (replaceCnt == -1) {
			System.out.println("Not Replace..!!");
		} else {
			System.out.println("Replace Count [" + replaceCnt + "] Index");
		}

	}

	private static int findReplaceInLinkedList(Node<Integer> first, int replaceFrom, int replaceTo) {
		int replaceCnt = 0;
		Node<Integer> last = null;
		for (last = first; last != null; last = last.next) {
			if(last.data==replaceFrom)
			{
				last.data= replaceTo;
				replaceCnt++;
			}
		}		
		return replaceCnt > 0 ? replaceCnt : -1;
	}
}
