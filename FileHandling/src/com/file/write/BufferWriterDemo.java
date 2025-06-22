package com.file.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter file = new FileWriter("C:\\Users\\ankit\\OneDrive\\\\Desktop\\\\buffer.txt");
		
		BufferedWriter bWriter =new BufferedWriter(file);
		
		bWriter.write("hello");
		
		bWriter.close();
		
		System.out.println("Data added");
	}

}
