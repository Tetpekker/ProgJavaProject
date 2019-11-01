package com.gmail.tetpekker;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 17;
		int d = 13;

		int e = calculateSum(c, d);
		System.out.println(e);

		int f = calculateSum(1, 2, 3);
		System.out.println(f);
		int[] arr = { 1, 4, 7, 23, 5 };
		int sumOne = calculateSum(arr);
		System.out.println(sumOne);
		int sumTwo = getSum(1, 4, 7, 23, 5);
		System.out.println(sumTwo);
	}

	static int calculateSum(int a, int b) {
		return a + b;
	}

	static int calculateSum(int a, int b, int c) {
		return a + b + c;
	}

	static int calculateSum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	static int getSum(int... arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

}
