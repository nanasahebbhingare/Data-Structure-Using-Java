package com.datastructure.queue;

import java.util.Scanner;

import com.datastructure.linkedlist.singly.Node;
import com.datastructure.linkedlist.singly.NodeUtility;

public class DynamicQueue {
	public final static Node<Integer> START = null;

	public static Node<Integer> front = null;
	public static Node<Integer> rear = null;

	public static void init() {
		front = START;
		rear = START;
	}

	public static Boolean isEmpty() {
		if (front == null)
			return Boolean.FALSE;
		else
			return Boolean.FALSE;
	}

	public static void addQ(Integer data) {
		Node<Integer> temp = NodeUtility.newNode();
		if (temp == null) {
			System.out.println("Queue Is Full..!!");
			return;
		}
		temp.data = data;
		temp.next = null;

		if (rear == null || front == null) {
			rear = temp;
			front = temp;
		} else {
			rear.next = temp;
			rear = rear.next;
		}
	}
   
	public static Integer deleteQ() {
		Integer item = null;
		Node<Integer> temp = null;
		if (!isEmpty()) {
			item = front.data;
			temp = front;
			front = front.next;
			temp.next = null;
			NodeUtility.freeNode(temp);
		} else {
			rear = null;
		}
		return item;
	}

	public static Integer peek() {
		Integer item = null;
		if (!isEmpty()) {
			item = front.data;
		}
		return item;
	}

	public static void main(String[] args) {
		Integer choice = 0, data = null;
		init();
		while (true) {
			System.out.println("Menu:\n 1)ADD_Q \n 2)DELETE_Q \n 3)PEEK \n 4)EXIT");
			System.out.println("Enter Your Choice:");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Data To Add_Q:");
				data = scanner.nextInt();
				addQ(data);
				System.out.println("ADDEDED ELEMENT :" + data);
				break;
			case 2:
				if (isEmpty()) {
					System.out.println("Queue Is Empty ..!!");
				} else {
					data = deleteQ();
					System.out.println("DELETED ELEMENT :" + data);
				}
				break;
			case 3:
				if (isEmpty()) {
					System.out.println("Queue Is Empty ..!!");
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
