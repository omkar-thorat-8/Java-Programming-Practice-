package com.swaping;

public class Swaping {
	
	public void swap(int a,int b)
	{
		// 1st Approach using 3rd variable
		
//		int temp;
//		temp= a;
//		a=b;
//		b=temp;
		
		// 2nd Approach Without using 3rd variable
		
//		a=a+b; //10+20 =30
//		b=a-b; //30-20 = 10
//		a=a-b; //30-10 = 20
		
		// 3rd Approach using Multi,Division
		
		a=a*b; //10*20 = 200
		b=a/b; //200/20 = 10
		a=a/b; //200/10= 20
		
		System.out.println("After Swaping : " + a + " " + b);
	}

}
