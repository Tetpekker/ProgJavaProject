package com.gmail.tetpekker;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double fuelPrice = 27.5;
		double fuelR = 9.8;
		int pathLength;
		
		System.out.println("Please enter pathLenght value");
		
		pathLength = scan.nextInt();
		
		double sum;
		
		sum = fuelPrice * fuelR/100.0 * pathLength * 2;
		
		System.out.println("Total sum = " + sum + " UAH");
	}

}
