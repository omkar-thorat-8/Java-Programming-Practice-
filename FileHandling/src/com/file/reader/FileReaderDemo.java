package com.file.reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\\\\\\\Users\\\\\\\\ankit\\\\\\\\OneDrive\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Print.txt");
		FileReader fReader = new FileReader(file);
		
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(fReader);
		
		while(scanner.hasNextLine()) {
			
			String string = scanner.nextLine();
			
			System.out.println(string);
			
		}
		
		fReader.close();
		
	}

}
