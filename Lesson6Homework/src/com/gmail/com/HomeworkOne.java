package com.gmail.com;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Task 1
		int[] numbersArray = new int[10];
		for (int i = 0; i < numbersArray.length; i++) {
			numbersArray[i] = (int) (Math.random() * 10);
		}
		int randomNumber = (int) (Math.random() * 10);
		System.out.println(Arrays.toString(numbersArray));
		System.out.println(maxValue(numbersArray));
		
		//Task 2
		System.out.println(concat(randomNumber, 2.8, "Sum of these numbers is: "));
		
		//Task 3
		drawRectangle(8, randomNumber);
		
		//Task 4
		System.out.println(findNumber(numbersArray, randomNumber));
		
		//Task 1
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your sentence");
		String randomSentence = scan.nextLine();
		System.out.println(countWords(randomSentence));
	}

	public static int maxValue(int numbersArray[]) {
		int max = numbersArray[0];
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] > max) {
				max = numbersArray[i];
			}
		}
		return max;
	}

	public static String concat(int numbInt, double numbDoub, String text) {
		return text + (numbInt + numbDoub);
	}

	public static void drawRectangle(int width, int height) {
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

	public static int findNumber(int numbersArray[], int randomNumber) {
		for (int i = 0; i < numbersArray.length; i++) {
			if (numbersArray[i] == randomNumber) {
				return i;
			} else {
				i++;
			}
		}
		return -1;
	}

	public static int countWords(String randomSentence) {
		int wordsNumber = 0;

		for (int i = 0; i < randomSentence.length(); i++) {
			if (randomSentence.charAt(i) == ' ') {
				wordsNumber++;

			}
		}
		return wordsNumber + 1;
	}
}
