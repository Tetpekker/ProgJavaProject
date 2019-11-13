package com.gmail.tetpekker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeworkOneTaskOne {

	public static File file = new File("SomeTextFile.txt");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task_1:
		createFile();
		updateFile();
		System.out.println("The content of " + file + " is: " + checkFileUpdated(file));

	}

	public static void createFile() {

		try {
			file.createNewFile();
		} catch (IOException exception) {
			System.out.println(exception);
		}
		System.out.println("File " + file + " is created");
	}

	public static void updateFile() {

		try (PrintWriter pwriter = new PrintWriter(file)) {
			for (int i = 0; i < 10; i++) {
				pwriter.println(i);
			}
			pwriter.println();
			pwriter.println("Some content created");
		} catch (FileNotFoundException exception) {
			System.out.println("Error occurred while file was updating!");
		}
		System.out.println("File " + file + " is updated");
	}

	public static String checkFileUpdated(File file) {
		StringBuilder sb = new StringBuilder();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";
			for (; (text = br.readLine()) != null;) {
				sb.append(text).append(System.lineSeparator());
			}
		} catch (IOException exception) {
			System.out.println(exception);
		}
		return sb.toString();
	}

}
