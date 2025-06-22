package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student(1, "Ankit"));
		list.add(new Student(2, "Prem"));
		list.add(new Student(3, "Raju"));
		list.add(new Student(4, "Ankit"));
		list.add(new Student(5, "Shubham"));


		Collections.sort(list,new MyComparator());
		
		Iterator<Student> itr = list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());

		}
		
	}
	
	
}
