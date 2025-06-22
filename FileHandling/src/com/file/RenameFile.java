package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RenameFile {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File file = new File("C:\\\\Users\\\\ankit\\\\OneDrive\\\\Desktop\\\\Ankit.txt");
		File file1 = new File("C:\\\\Users\\\\ankit\\\\OneDrive\\\\Desktop\\\\Renamed.txt");
		
		if(file.exists()) {
			
			
		    System.out.println(file.renameTo(file1));
			
		}
		else {
			System.out.println("File not Exist");
		}
	}

}
