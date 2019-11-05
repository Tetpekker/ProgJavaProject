package com.gmail.tetpekker;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNumber("PI", Math.PI, 4));
	}

	public static String getNumber(String constName, double value, int numbChars) {
		String text = String.format(constName + "  %." + numbChars + "f", value);
		return text;

	}

}
