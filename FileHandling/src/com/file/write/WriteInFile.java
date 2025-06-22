package com.file.write;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\ankit\\OneDrive\\Desktop\\FileHandling.txt");
			
			fileWriter.write("Hello this is new Text ");
			fileWriter.close();

			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
