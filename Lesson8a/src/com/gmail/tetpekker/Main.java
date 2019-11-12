package com.gmail.tetpekker;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileOne = new File("fileA.txt");
		System.out.println("File is real => "+fileOne.exists());
		
		try {
			fileOne.createNewFile();
		} catch (IOException exception) {
			System.out.println(exception);
		}
		
		File fileTwo = new File("fileB.txt");
		fileOne.renameTo(fileTwo);
		
		File folderTwo = new File("folderA");
		folderTwo.mkdirs();
		
		File fileThree = new File(folderTwo, "fileC.doc");
		fileTwo.renameTo(fileThree);
		
		//fileThree.delete();
		//folderTwo.delete();
		
		//deleteFolder(folderTwo);
	
		
		File folderOne = new File(".");
		File[] files = folderOne.listFiles();
		for (File file : files) {
			System.out.println(file + (file.isFile()?" File":" Folder"));
		}

	}
	
	public static void deleteFolder(File folder) {
		if(folder.isFile()) {
			System.out.println("Delete " + folder.getName());
			folder.delete();
		} else {
			File[] files = folder.listFiles();
			for(int i=0; i<files.length; i++) {
				deleteFolder(files[i]);
			}
			System.out.println("Delete " + folder.getName());
			folder.delete();
		}
	}

}
