package com.gmail.tetpekker;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getBits(7));
	}

	public static int getBits(int number) {
		int count = 0;
		for (; number != 0;) {
			if ((number & 1) > 0) {
				count++;
			}
			number = number >> 1;
		}
		return count;
	}
}
