package com.gmail.tetpekker;

import java.io.File;

public class HomeworkOneTaskThree {

	public static File folder = new File("src/com/gmail/tetpekkker");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
foldersList(folder);
		
		}
	
	public static void foldersList(File folder) {
		File folderOne = new File(".");
		File[] files = folderOne.listFiles();
		for (File file : files) {
			System.out.println(file + (file.isFile()?" File":" Folder"));

	}
	}
}


