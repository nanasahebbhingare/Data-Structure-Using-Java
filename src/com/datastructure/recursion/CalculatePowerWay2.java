package com.datastructure.recursion;

public class CalculatePowerWay2 {
	public static void main(String[] args) {
		int base = 2, power = 4;
		System.out.println("Power Of :" + power(base, power));
	}

	private static int power(int base, int power) {
		int x = 0;
		if (power == 0)
			return 1;
		if (power % 2 == 0) {
			x = power(base, power / 2);
			return x * x;
		} else {
			x = power(base, (power - 1) / 2);
			return base * x * x;
		}
	}
}