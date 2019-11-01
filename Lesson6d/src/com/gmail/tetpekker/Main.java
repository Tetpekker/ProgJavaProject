package com.gmail.tetpekker;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int z = fact(5);
	}

	static int fact(int n) {
		if (n <= 1) {
			return 1;
		} else {
			System.out.println(n);
			return n * fact(n-1);
		}
	}

}
