package com.collection;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		System.out.println("Array List after add() size : "+names.size());
		boolean status = names.add("Sumedh");
		names.add("Ankit");
		names.add("Ashish");
		names.add("Jagganath");
		names.add("Jivaji");
		names.add("Chirag");
		
		System.out.println("Array List Before add() Size : " +names.size());

		status = names.contains("Ashish");
		System.out.println(status);
		
		names.add(1, "Sankalp");
		System.out.println("1st ArrayList : " +names);
		
		names.clear();
		System.out.println("1st ArrayList : " +names);
		
		names.remove("Chirag");
		System.out.println("1st ArrayList : " +names);

		
		
	}

}