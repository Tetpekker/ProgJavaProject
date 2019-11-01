package com.gmail.tetpekker;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 3, 5, 7, 9 };
		System.out.println(Arrays.toString(arr));
		int sum = getSum(arr);
		System.out.println(sum);
		System.out.println(Arrays.toString(arr));

		String text = "Hello";
		char letter = 'l';
		System.out.println(countLetters(text, letter));
	}

	static int getSum(int[] arr) {
		arr[0] += 3;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int countLetters(String text, char letter) {

		int counter = 0;
		char[] letters = text.toCharArray();
		for (char i : letters) {
			if (i == letter) {
				counter += 1;
			}
		}
		return counter;

	}
}
