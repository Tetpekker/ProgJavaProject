package com.gmail.tetpekker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your number");
		int number = scan.nextInt();

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
