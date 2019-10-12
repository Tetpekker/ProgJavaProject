package com.gmail.tetpekker;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers();
		triangleSquare();
		countCircleLength();
	}

	public static void printNumbers() {
		Scanner scan = new Scanner(System.in);
		int bigNumber;

		System.out.println("Please enter big number");
		bigNumber = scan.nextInt(); // 54698

		int firstLine = bigNumber / 10000;
		int secondLine = bigNumber % 10000 / 1000;
		int thirdLine = bigNumber % 1000 / 100;
		int fourthLine = bigNumber % 100 / 10;
		int fifthLine = bigNumber % 10;

		System.out.println(firstLine);
		System.out.println(secondLine);
		System.out.println(thirdLine);
		System.out.println(fourthLine);
		System.out.println(fifthLine);
	}
	
	public static void triangleSquare() {
		
		double a = 7.8;
		double b = 8.2;
		double c = 4.0;
		double p;
		double s;
		
		p = (a+b+c)/2;
		s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		System.out.println(s);
	}
	
	public static void countCircleLength() {
		Scanner scan = new Scanner(System.in);
		double r;
		double circleLength;
		
		System.out.println("Please enter the radius value");
		
		r = scan.nextDouble();
		circleLength = 2 * Math.PI * r;
		
		System.out.println(circleLength);
	}
}
