package com.datastructure.linkedlist.singly;

/**
 * LinkedList Node
 * 
 * @author BhingarN
 * @version 1
 * @since 30-11-2021
 * @param <T>
 */

public class Node<T> {
	public T data;
	public Node<T> next;

	public Node() {
	}

	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public Node(T data) {
		this.data = data;
		this.next = null;
	}
}