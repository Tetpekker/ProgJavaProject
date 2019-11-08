package com.gmail.tetpekker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;


public class HomeworkTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getDfferenceInDates();

	}
	
	public static void getDfferenceInDates() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
		Scanner scan = new Scanner(System.in);
		System.out.println("Input any date dd MM yyyy");
		String dateFromInput = scan.nextLine();
		LocalDate dateFromInput1 = LocalDate.parse(dateFromInput, formatter);
		System.out.println(formatter.format(dateFromInput1));
		
		Date currentDate = new Date();
		SimpleDateFormat sdfOne = new SimpleDateFormat("dd MM yyyy");
		String currentDate1 = sdfOne.format(currentDate);
		System.out.println(currentDate1);
		
	}
	

}
