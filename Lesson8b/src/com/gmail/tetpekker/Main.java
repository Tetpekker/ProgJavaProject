package com.gmail.tetpekker;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}, {1,23,345}};
		String text = fromArrayToString(array);
		System.out.println(text);
		File file = new File("matrix.txt");
		saveTextToFile(text, file);

	}
	
	public static void saveTextToFile(String text, File file) {
		try(PrintWriter pw = new PrintWriter(file)){
			pw.println(text);
		} catch (IOException exception) {
			System.out.println(exception);
		}
	}
	
	public static String fromArrayToString(int[][] array) {
		StringBuilder sb = new StringBuilder();
		for(int[] rows : array) {
			for(int col : rows) {
				sb.append(String.format("%-6.6s\t", "" + col));
			}
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

}
