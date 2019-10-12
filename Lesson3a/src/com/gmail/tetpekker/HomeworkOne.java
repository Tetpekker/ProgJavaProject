package com.gmail.tetpekker;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// findMax();
		// findFlat();
		// defineLeapYear();
		defineTriangle();
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

	public static void findFlat() {
		Scanner scan = new Scanner(System.in);

		int entrance;
		int floor;
		int flatNumber;

		System.out.println("Please enter a flat number");
		flatNumber = scan.nextInt();

		if (!(flatNumber <= 0) && (flatNumber <= 36)) {
			entrance = 1;
			if (!(flatNumber <= 0) && (flatNumber <= 4)) {
				floor = 1;
			} else if ((flatNumber) >= 5 && (flatNumber <= 8)) {
				floor = 2;
			} else if ((flatNumber) >= 9 && (flatNumber <= 12)) {
				floor = 3;
			} else if ((flatNumber) >= 13 && (flatNumber <= 16)) {
				floor = 4;
			} else if ((flatNumber) >= 17 && (flatNumber <= 20)) {
				floor = 5;
			} else if ((flatNumber) >= 21 && (flatNumber <= 24)) {
				floor = 6;
			} else if ((flatNumber) >= 25 && (flatNumber <= 28)) {
				floor = 7;
			} else if ((flatNumber) >= 29 && (flatNumber <= 32)) {
				floor = 8;
			} else {
				floor = 9;
			}
		} else if (!(flatNumber <= 37) && (flatNumber <= 72)) {
			entrance = 2;
			flatNumber -= 36;
			if (!(flatNumber <= 0) && (flatNumber <= 4)) {
				floor = 1;
			} else if ((flatNumber) >= 5 && (flatNumber <= 8)) {
				floor = 2;
			} else if ((flatNumber) >= 9 && (flatNumber <= 12)) {
				floor = 3;
			} else if ((flatNumber) >= 13 && (flatNumber <= 16)) {
				floor = 4;
			} else if ((flatNumber) >= 17 && (flatNumber <= 20)) {
				floor = 5;
			} else if ((flatNumber) >= 21 && (flatNumber <= 24)) {
				floor = 6;
			} else if ((flatNumber) >= 25 && (flatNumber <= 28)) {
				floor = 7;
			} else if ((flatNumber) >= 29 && (flatNumber <= 32)) {
				floor = 8;
			} else {
				floor = 9;
			}
		} else if (!(flatNumber <= 73) && (flatNumber <= 108)) {
			entrance = 3;
			flatNumber -= 72;
			if (!(flatNumber <= 0) && (flatNumber <= 4)) {
				floor = 1;
			} else if ((flatNumber) >= 5 && (flatNumber <= 8)) {
				floor = 2;
			} else if ((flatNumber) >= 9 && (flatNumber <= 12)) {
				floor = 3;
			} else if ((flatNumber) >= 13 && (flatNumber <= 16)) {
				floor = 4;
			} else if ((flatNumber) >= 17 && (flatNumber <= 20)) {
				floor = 5;
			} else if ((flatNumber) >= 21 && (flatNumber <= 24)) {
				floor = 6;
			} else if ((flatNumber) >= 25 && (flatNumber <= 28)) {
				floor = 7;
			} else if ((flatNumber) >= 29 && (flatNumber <= 32)) {
				floor = 8;
			} else {
				floor = 9;
			}
		} else {
			entrance = 4;
			flatNumber -= 108;
			if (!(flatNumber <= 0) && (flatNumber <= 4)) {
				floor = 1;
			} else if ((flatNumber) >= 5 && (flatNumber <= 8)) {
				floor = 2;
			} else if ((flatNumber) >= 9 && (flatNumber <= 12)) {
				floor = 3;
			} else if ((flatNumber) >= 13 && (flatNumber <= 16)) {
				floor = 4;
			} else if ((flatNumber) >= 17 && (flatNumber <= 20)) {
				floor = 5;
			} else if ((flatNumber) >= 21 && (flatNumber <= 24)) {
				floor = 6;
			} else if ((flatNumber) >= 25 && (flatNumber <= 28)) {
				floor = 7;
			} else if ((flatNumber) >= 29 && (flatNumber <= 32)) {
				floor = 8;
			} else {
				floor = 9;
			}
		}

		System.out.println("This flat is located on the " + floor + " floor of the " + entrance + " entrance.");
	}

	public static void defineLeapYear() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a year");

		int year = scan.nextInt();

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("This year is a leap year and contains 366 days!");
		} else {
			System.out.println("This year is NOT a leap year and contains 365 days!");
		}
	}

	public static void defineTriangle() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter value a");
		int a = scan.nextInt();
		System.out.println("Please enter value b");
		int b = scan.nextInt();
		System.out.println("Please enter value c");
		int c = scan.nextInt();

		if ((a + b >= c) && (b + c >= a) && (a + c >= b)) {
			System.out.println("Yes, this is a triangle!");
		} else {
			System.out.println("No, this is NOT a triangle!");
		}
	}
}
