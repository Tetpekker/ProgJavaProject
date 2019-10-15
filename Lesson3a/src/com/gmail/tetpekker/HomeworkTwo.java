package com.gmail.tetpekker;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		definePointInCircle();
		definePointInTriangle();
		checkHappyTicket();
		checkPalindrom();
	}

	public static void definePointInCircle() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter value X");
		double x = scan.nextInt();
		System.out.println("Please enter value Y");
		double y = scan.nextInt();

		if (((-4.0 <= x) && (x <= 4.0)) && ((-4.0 <= y) && (y <= 4.0))) {
			System.out.println("This point is inside the circle");
		} else {
			System.out.println("This point is outside the circle");
		}
	}

	public static void definePointInTriangle() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter value X");
		int x = scan.nextInt();
		System.out.println("Please enter value Y");
		int y = scan.nextInt();

		int n1 = (4 - 0) * (x - 0) - (4 - 0) * (y - 0);
		int n2 = (1 - 4) * (x - 4) - (6 - 4) * (y - 4);
		int n3 = (0 - 1) * (x - 6) - (0 - 6) * (y - 1);

		if (((n1 > 0) && (n2 > 0) && (n3 > 0)) || ((n1 < 0) && (n2 < 0) && (n3 < 0))) {
			System.out.println("This point is inside the triangle");
		} else {
			System.out.println("This point is outside the triangle");
		}
	}

	public static void checkHappyTicket() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your ticket");
		int ticket = scan.nextInt();
		
		int a = ticket / 1000;
		int b = ticket % 1000 / 100;
		int c = ticket % 100 / 10;
		int d = ticket % 10;

		if ((a + b) == (c + d)) {
			System.out.println("This ticket is a happy one!");
		} else {
			System.out.println("This ticket is not happy one. Try once more!");
		}
	}
	
	public static void checkPalindrom() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the 6 digit number");
		int number = scan.nextInt();
		
		int a = number / 100000;
		int b = number % 100000 / 10000;
		int c = number % 10000 / 1000;
		int d = number % 1000/ 100;
		int e = number % 100/ 10;
		int f = number % 10;
		
		if((a==f)&&(b==e)&&(c==d)) {
			System.out.println("This number is a palindrom!");
		} else {
			System.out.println("This number is NOT a palindrom!");
		}
	}
}