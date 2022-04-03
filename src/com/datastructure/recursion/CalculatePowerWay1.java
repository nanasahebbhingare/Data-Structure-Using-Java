package com.datastructure.recursion;

public class CalculatePowerWay1 {
	public static void main(String[] args) {
		int base = 2, power = 4;
		System.out.println("Power Of :" + power(base, power));
	}

	private static int power(int base, int power) {
		if (power == 0)
			return 1;
		return base * power(base, power - 1);
	}
}
