package com.gmail.tetpekker;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb = new StringBuilder("Helllloooooo");
sb.setCharAt(0, 'Y');
sb.append(11111);
sb.insert(12, " ");

String text = sb.toString();
System.out.println(text);
	}

}
