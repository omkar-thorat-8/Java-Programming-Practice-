package com.file.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\ankit\\OneDrive\\\\Desktop\\\\FileOutputStream.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		String data = "Hellooooo";
		 byte[] dataBytes = data.getBytes();
		fileOutputStream.write(dataBytes);
		
		fileOutputStream.close();
		System.out.println("Data Added");
	}
	

}
