package com.datastructure.linkedlist.doubly;

/**
 * Doubly LinkedList Node
 * 
 * @author BhingarN
 * @version 1
 * @since 12-12-2021
 * @param <T>
 */

public class Node<T> {
	public Node<T> prev;
	public T data;
	public Node<T> next;

	public Node() {
	}

	public Node(Node<T> prev, T data, Node<T> next) {
		this.prev = prev;
		this.data = data;
		this.next = next;
	}

	public Node(T data) {
		this.prev = null;
		this.data = data;
		this.next = null;
	}
}