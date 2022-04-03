package com.datastructure.queue;

import java.util.Scanner;

public class CircularQueue {
	public final static Integer START = 0;
	public final static Integer SIZE = 4;

	public static Integer front = 0, rear = 0;

	public static Integer[] QUEUE = new Integer[SIZE];

	public static void init() {
		front = START;
		rear = START;
	}

	public static Boolean isEmpty() {
		if (front == rear) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public static Boolean isFull() {
		if ((rear + 1) % SIZE == front) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public static void addQ(Integer data) {
		if (!isFull()) {
			rear = (rear + 1) % SIZE;
			QUEUE[rear] = data;
		}
	}

	public static Integer deleteQ() {
		Integer item = null;
		if (!isEmpty()) {
			front = (front + 1) % SIZE;
			item = QUEUE[front];
		}
		return item;
	}

	public static Integer peek() {
		Integer item = null;
		if (!isEmpty()) {
			item = QUEUE[front + 1];
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
