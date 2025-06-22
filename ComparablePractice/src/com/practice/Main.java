package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student(2,"Ankit"));
		list.add(new Student(4,"Prem"));

		list.add(new Student(3
				,"Raju"));
		list.add(new Student(1,"Shubham"));

		Collections.sort(list);
		
		System.out.println(list);
	}

}
