package com.swaping;

public class Main {

	public static void main(String[] args) {

		Swaping s= new Swaping();
		int a=10;
		int b=20;
		
		System.out.println("Before Swaping : " + a + " " + b);
		s.swap(a, b);
	}

}
