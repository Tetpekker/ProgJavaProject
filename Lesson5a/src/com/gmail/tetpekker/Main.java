package com.gmail.tetpekker;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		averagePayment();
		twoDArray();
		}
	
	public static void averagePayment() {
		int[] yearMonthes = new int[12];
		for (int i = 0; i<yearMonthes.length; i++) {
				yearMonthes[i] = 5000+(int) (Math.random() * 5000);
				System.out.println(Arrays.toString(yearMonthes));
			}
		int total = 0;
		for (int i = 0; i<yearMonthes.length; i++) {
			total += yearMonthes[i];
		}
		System.out.println(total);
		System.out.println("Average = " + (total/yearMonthes.length));
	}
	
	public static void twoDArray() {
		Scanner scan = new Scanner(System.in);
			System.out.println("Please enter yuor value");
			int value = scan.nextInt();
			
			int[][] array = new int [value][value];
			for(int i=0; i<array.length; i++) {
				for(int j=0; j<array[i].length; j++) {
					array[i][j] = (j + 1);
					
				}
			}
			for(int[] row:array) {
				System.out.println(Arrays.toString(row));
			}
			int sum = 0;
			for(int i = 0; i<array.length; i++) {
				sum+=array[i][i];
			}
			System.out.println("Summa is " + sum);
	}
}

