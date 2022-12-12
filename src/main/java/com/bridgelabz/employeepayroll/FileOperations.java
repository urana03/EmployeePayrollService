package com.bridgelabz.employeepayroll;

import java.io.*;

public class FileOperations {

	public static void main(String args[]) {
		//Check if file exists
		File file = new File("C:\\Users\\LENOVO\\Desktop\\demo.txt");
		System.out.println("File Exists: "+file.exists());
		
		//Delete file and check if not exist
		file.delete();
		System.out.println("File Exists: "+file.exists());
		
		//Create directory
		File directory = new File("C:\\Users\\LENOVO\\Desktop\\Demo");
		directory.mkdir();
		System.out.println("Successfully created");
		
		//Create Empty file
		try {
		File newOne = new File("C:\\Users\\LENOVO\\Desktop\\Demo\\demo.txt");
		newOne.createNewFile();
	    System.out.println("File created");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//List of files and directories
		File items = new File("C:\\Users\\LENOVO\\Desktop\\Demo");
		String[] paths = items.list();
		for(String path:paths) {
			System.out.println("----Files and directories in folder----");
			System.out.println(path);
		}
	}
	
}
