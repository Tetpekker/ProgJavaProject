package com.gmail.com;

public class HomeworkTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbersArray1 = new int[] {0, 2, 4, 6, 8, 10, 12};
int[] numbersArray2 = new int[] {1, 4, 7, 10, 13};
int[] numbersArray3 = new int[] {1, 2, 4, 8, 16, 32};
int[] numbersArray4 = new int[] {1, 3, 9, 27};
int[] numbersArray5 = new int[] {1, 4, 9, 16, 25};
int[] numbersArray6 = new int[] {1, 8, 27, 64, 125};

System.out.println(getNumber(numbersArray1));

	}
	
	public static int getNumber(int[] numbersArray) {
		for(int i=0; i<numbersArray.length; i++) {
			if((numbersArray[1] - numbersArray[0]) == 2) {
				
			}
		}
		return numbersArray[numbersArray.length-1] + 2;
	}

}
