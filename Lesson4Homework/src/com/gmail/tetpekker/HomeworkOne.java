package com.gmail.tetpekker;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawWallpaper();
		countFactorial();
		multiplyOnFive();
		drawTriangle();
	}

	public static void drawWallpaper() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your number");
		int number = scan.nextInt();

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				if (j % 2 != 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
	}
	
	public static void countFactorial() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your number");
		int number = scan.nextInt();
		int factorial=1;
		
			if ((number>4)&&(number<16)) {
				for (int i=1; i<=number; i++){
				factorial = factorial*i;
				}
				System.out.println(factorial);
				
			} else {
				System.out.println("The number is out of the range");
		}
	}
	
	public static void multiplyOnFive() {
		int multiplier = 0;
		int result;
		
		while (multiplier < 10) {
			multiplier += 1;
			result = 5 * multiplier;
			System.out.println(multiplier + " x 5 = " + result);
		}
	}
	
	public static void drawTriangle() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your value for the height");
		int height = scan.nextInt();
		System.out.println("Enter your value for the width");
		int width = scan.nextInt();
		
		for (int i = 0; i < height; i++) {
			System.out.print("*");
		}
		System.out.println();

		for (int j = 1; j < width - 1; j++) {
			for (int k = 0; k < height; k++) {
				if ((k == 0) || (k == height - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < height; i++) {
			System.out.print("*");
		}
		System.out.println();

	}
}