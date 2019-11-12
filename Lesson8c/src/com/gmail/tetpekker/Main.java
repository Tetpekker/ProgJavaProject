package com.gmail.tetpekker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Lesson8c/src/com/gmail/tetpekkker/Main.java");
		String text = loadTextFromFile(file);
		System.out.println(text);

	}
	
	public static String loadTextFromFile(File file) {
		StringBuilder sb = new StringBuilder();
		try(Scanner scan = new Scanner(file)){
			
			for(; scan.hasNextLine();) {
				sb.append(scan.nextLine());
				sb.append(System.lineSeparator());
			}
			
		} catch (IOException exception) {
			System.out.println(exception);
		}
		return sb.toString();
	}
	
	public static String fastLoadFromFile(File file) {
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String text = " ";
			for(; (text=br.readLine()) !=null;) {
				sb.append(text);
				sb.append(System.lineSeparator());
			}
			
		} catch (IOException exception) {
			System.out.println(exception);
		}
				
		
		return sb.toString();
	}

}
