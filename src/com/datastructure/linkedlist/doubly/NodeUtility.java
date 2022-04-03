package com.datastructure.linkedlist.doubly;

import com.datastructure.linkedlist.doubly.Node;

/**
 * Node Utility
 * 
 * @author BhingarN
 * @version 1
 * @since 13-12-2021
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
		node.prev = null;
		node.data = null;
		node.next = null;
	}
}
