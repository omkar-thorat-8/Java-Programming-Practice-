package com.naruto.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = new String("Ankit");
		String b = new String("Ankit");
		String c = "Ankit";
		String d = "Ankit";
		
		System.out.println(a == b); //false
		System.out.println(c == d); // true
		System.out.println(a == d); // false
		
	}

}
