package com.datastructure.linkedlist.singly;

/**
 * Node Utility
 * 
 * @author BhingarN
 * @version 1
 * @since 30-11-2021
 * 
 */
public class NodeUtility {
	/**
	 * Create new node.
	 * 
	 * @return
	 */
	public static <T> Node<T> newNode() {
		return new Node<T>();
	}

	/**
	 * Free node
	 * 
	 * @param node
	 */
	public static void freeNode(Node<?> node) {
		node.data = null;
		node.next = null;
	}
}
