package com.gmail.tetpekker;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HomeworkOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1, 2, 3, 4, 5};
		
		//Task 1
		System.out.println("The milliseconds-difference between current date and 3 months ago is " + getMilliseconds());
		//Task 2
		System.out.println(arraysToStringForIntegerArray(array));
		//Task 3
		System.out.println(getDecimalFromBinary());
		//Task 4
		printTenPIs();  //I guess the implementation is incorrect :)
	}

	public static long getMilliseconds() {

		Date currentDate = new Date();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, Calendar.OCTOBER);
		Date dateThreeMonthsAgo = calendar.getTime();
		
		long mills = currentDate.getTime() - dateThreeMonthsAgo.getTime();
		return mills;
	}
	
	public static String arraysToStringForIntegerArray(int array[]) {
		
		StringBuilder sb = new StringBuilder("[");
		for( int arrayElement : array) {
			sb.append(arrayElement + ", ");
		}
		sb.setCharAt((array.length*3)-1, ']');
		return sb.toString();
	}
	
	public static int getDecimalFromBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your binary value");
        String userInput = scanner.nextLine();
        return Integer.parseInt(userInput, 2);
    }
	
	public static void printTenPIs() {
		
		Formatter formatter = new Formatter();
		System.out.println(formatter.format("%.2f", Math.PI).toString());
		System.out.println(formatter.format("%.3f", Math.PI).toString());
		System.out.println(formatter.format("%.4f", Math.PI).toString());
		System.out.println(formatter.format("%.5f", Math.PI).toString());
		System.out.println(formatter.format("%.6f", Math.PI).toString());
		System.out.println(formatter.format("%.7f", Math.PI).toString());
		System.out.println(formatter.format("%.8f", Math.PI).toString());
		System.out.println(formatter.format("%.9f", Math.PI).toString());
		System.out.println(formatter.format("%.10f", Math.PI).toString());
		System.out.println(formatter.format("%.11f", Math.PI).toString());
		
	}
	
}
