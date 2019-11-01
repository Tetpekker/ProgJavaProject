package com.gmail.tetpekker;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;

		System.out.println("a = " + a);

		int c = getSum(a, b);

		System.out.println(c);
		System.out.println("a = " + a);
	}

	static int getSum(int a, int b) {
		a = a + 3;
		return a + b;
	}

}
