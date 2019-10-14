package com.gmail.tetpekker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;

		for (int i = 1; i <= 100; i++) {

			if (i % 4 == 0) {
				System.out.print('*');
			} else {
				System.out.print(i);
			}
		}
	}
}
	
