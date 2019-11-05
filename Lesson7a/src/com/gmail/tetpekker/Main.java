package com.gmail.tetpekker;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long t = -768767676786L;
		Date date = new Date();
		System.out.println(date);
		Scanner scan = new Scanner(System.in);
		System.out.println("Input any date dd MMMM yyyy");
		String text = scan.nextLine();
		SimpleDateFormat sdfTwo = new SimpleDateFormat("dd MMMM yyyy");
		
		try {
			date = sdfTwo.parse(text);
		} catch (ParseException exception) {
			exception.printStackTrace();
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("'Kyiv time is ' - HH:mm:ss ' of ' dd MMMM yyyy");
		String res = sdf.format(date);
		System.out.println(res);
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.YEAR, 1986);
		calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
		calendar.set(Calendar.DAY_OF_MONTH, 12);
		Date dateOne = calendar.getTime();
		System.out.println(dateOne);
		
		findJavaReleaseDay();
		}
	
	public static void findJavaReleaseDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 1995);
		calendar.set(Calendar.MONTH, Calendar.MAY);
		calendar.set(Calendar.DAY_OF_MONTH, 23);
		
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		Date date = calendar.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		System.out.println(sdf.format(date));
			
	}
	
	}


