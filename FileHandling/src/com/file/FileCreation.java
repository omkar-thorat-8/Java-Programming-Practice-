package com.file;
import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\ankit\\OneDrive\\Desktop\\FileHandling.txt");
		
		try {
			if(file.createNewFile()) {
				
				System.out.println("File Created Successfully");
			}
			else {
				
				System.err.println("File Already Exist...");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
