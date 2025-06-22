package com.file;
import java.io.File;
import java.io.IOException;

public class FileInfo {

	public static void main(String arg[] ) {
		
		File file = new File("C:\\\\Users\\\\ankit\\\\OneDrive\\\\Desktop\\\\FileHandling.txt");
		
//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		if(file.exists()) {
			
			System.out.println("File name :"+ file.getName());
			System.out.println("File Location :"+ file.getAbsolutePath());
			System.out.println("File Writable :"+ file.canWrite());
			System.out.println("File Readable :"+ file.canRead());
			System.out.println("File Size :"+ file.length());
			System.out.println("File Removed/Delete :"+ file.delete());

		}
		else {
			
			System.out.println("No Such File Exist");
		}
	}
}
