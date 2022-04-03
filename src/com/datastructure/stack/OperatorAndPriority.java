package com.datastructure.stack;

public class OperatorAndPriority {
	public Character operator;
	public Integer priority;

	public OperatorAndPriority() {
		super();
	}

	public OperatorAndPriority(Character operator, Integer priority) {
		super();
		this.operator = operator;
		this.priority = priority;
	}

	public Character getOperator() {
		return operator;
	}

	public void setOperator(Character operator) {
		this.operator = operator;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}
}
