package com.stringBuilderBuffer;

public class StringDemo {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Ankit");
		
		String string =  sb.append(" is Good Boy").substring(1,5);
		//1)Mutable, as we know that String is Immutable but with the use of 
		//  StringBuilder and String Buffer it is Mutable
		
		//2)String chaining in String builder and buffer we can call
		//  multiple methods by using .
		
		
		//3)String Buffer is Thread Safe(Synchronized)
		//  Otherthan all the features of StringBuilder is same as StringBuilder
		
		System.out.println(string);
	}

}
