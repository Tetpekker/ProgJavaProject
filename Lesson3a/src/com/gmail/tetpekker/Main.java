package com.gmail.tetpekker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMax();
	}

	public static void findMax() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter value a");
		int a = scan.nextInt();
		
		System.out.println("Please enter value b");
		int b = scan.nextInt();
		
		System.out.println("Please enter value c");
		int c = scan.nextInt();
		
		int max;

		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else {
			max = c;
		}

		System.out.println("Max value is: " + max);
	}

}
