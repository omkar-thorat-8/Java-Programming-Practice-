package com.file.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file = new File("C:\\\\Users\\\\ankit\\\\OneDrive\\\\\\\\Desktop\\\\\\\\Print.txt");
		PrintWriter pWriter = new PrintWriter(file);
		
		
		pWriter.write("Helllllloooooo");
		pWriter.close();
		
		System.out.println("Data Added Succesfully");
	}

}
