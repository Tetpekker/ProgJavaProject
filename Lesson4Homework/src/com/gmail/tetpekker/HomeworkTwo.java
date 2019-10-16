package com.gmail.tetpekker;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawFigure();
		primeNumbers();
		sandWatch();
	}

	public static void drawFigure() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the max height value");
		int maxHeight = scan.nextInt();
		String paint = "";

		for (int i = 0; i < maxHeight * 2; i++) {
			if (i < maxHeight) {
				paint = paint + "*";
				System.out.println(paint);
			} else {
				paint = paint.substring(1);
				System.out.println(paint);
			}

		}
	}

	public static void primeNumbers() {

		for (int i = 2; i < 100; i++) {
			for (int k = 2; k <= i; k++) {
				if (i % k == 0 & i != k) {
					break;
				} else if (i != k) {
					continue;
				} else {
					System.out.println(i);
				}
			}
		}
	}

	public static void sandWatch() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your value");
		int number = scan.nextInt();
		int x = number * 2 - 1;

		for (int i = 0; i < number; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < x; k++) {
				System.out.print("*");
			}
			x -= 2;
			System.out.println();
		}

		x = 3;
		for (int i = 1; i < number; i++) {
			for (int j = i; j < number - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < x; k++) {
				System.out.print("*");
			}
			x += 2;
			System.out.println();
		}
	}
}
