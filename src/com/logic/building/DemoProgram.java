package com.logic.building;

import java.util.ArrayDeque;
import java.util.Deque;

public class DemoProgram {
public static void main(String[] args) {
	Deque<Character> stack =new ArrayDeque<>();
	stack.push('A');
	
	System.out.println(stack.pop());
}
}
