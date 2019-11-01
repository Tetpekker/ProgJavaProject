package com.gmail.tetpekker;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		turnArray();
		}
	public static void turnArray() {
			int degrees = 90;

			int[][] array = new int[6][6];
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					int arrayData = (int)(Math.random() * 10);
					array[i][j] = arrayData;
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();

			for (int k = 0; k < degrees; k++) {
				for (int i = 0; i < array.length / 2; i++) {
					for (int j = i; j < array.length - i - 1; j++) {
						int t = array[i][j];
						array[i][j] = array[array.length - j - 1][i];
						array[array.length - j - 1][i] = array[array.length - i - 1][array.length - j - 1];
						array[array.length - i - 1][array.length - j - 1] = array[j][array.length - i - 1];
						array[j][array.length - i - 1] = t;
					}
				}
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
		}
}
