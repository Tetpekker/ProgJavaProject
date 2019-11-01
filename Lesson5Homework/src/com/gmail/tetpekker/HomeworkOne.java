package com.gmail.tetpekker;

import java.util.Arrays;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countOdds();
		manualArray();
		copyArray();
		countB();
	}

	public static void countOdds() {
		int[] numbers = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int sumOdds = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {

				sumOdds += 1;

			} else {
			}
		}
		System.out.println(sumOdds);
	}

	public static void manualArray() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Set size of an array");
		int size = scan.nextInt();

		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter data in array");
			int data = scan.nextInt();
			array[i] = data;
		}
		System.out.println(Arrays.toString(array));
	}

	public static void copyArray() {
		int[] random = new int[15];

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 10);
		}

		int[] doubleRandom = Arrays.copyOf(random, random.length * 2);
		for (int j = 0; j < random.length; j++) {
			doubleRandom[j + 15] = random[j] * 2;
		}

		System.out.println(Arrays.toString(random));
		System.out.println(Arrays.toString(doubleRandom));
	}

	public static void countB() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word");
		String text = scan.next();
		int count = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'b') {
				count++;

			}
		}
		System.out.println(count);
	}
}
