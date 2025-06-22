package com.file.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) {
        try {
        	FileReader fileReader = new FileReader("C:\\\\Users\\\\ankit\\\\OneDrive\\\\\\\\Desktop\\\\\\\\buffer.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
